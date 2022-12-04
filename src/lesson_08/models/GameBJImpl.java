package lesson_08.models;

import lesson_08.interfaces.GameBJ;

import java.util.Scanner;

public class GameBJImpl implements GameBJ {
    PlayerImpl [] playersIntGame = new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();

    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersIntGame.length; i++) {
            if (playersIntGame[i] == null){
                playersIntGame[i]= player;
                break;
            }

        }
    }

    @Override
    public void giveTwoCardsOnHand() {
        for (int i = 0; i < playersIntGame.length; i++) {
            if (playersIntGame[i] != null){
                playersIntGame[i].takeCard(deckOfCards.randomCards());
                playersIntGame[i].takeCard(deckOfCards.randomCards());
            }

        }

    }

    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersIntGame.length; i++) {
            if (playersIntGame[i] != null){
                while (playersIntGame[i].needCard()) {
                    playersIntGame[i].takeCard(deckOfCards.randomCards());
                }
            }

        }
    }

    @Override
    public void printWinner() {
        // 1. Проход по всему массиву игроков в игре и выключение всех игроков у кого больше 21
        for (PlayerImpl player : playersIntGame){
            if (player != null && !player.isCroupier){
                if (player.countValuesOfAllCardsOnHand() > 21){
                    player.setInGame(false);
                }
            }
        }
        if (countPlayersInGame() == 0){
            System.out.println("Победил игрок:" + playersIntGame);
        }
        //2. Победил один игрок, оставшийся в игре
        if (countPlayersInGame() == 1){
            System.out.println("Победил игрок :" + playersIntGame);
            for (PlayerImpl player: playersIntGame){
                if (player != null && player.isInGame()){
                    player.showCardsOnHand();
                    return;
                }
            }
        }

        //3. Победило несколько игроков, нужно выбрать одного с лучшим значением карт на руках

        int bestValue = 0;
        if (countPlayersInGame() > 1){
            for (PlayerImpl player: playersIntGame) {
                if (player != null && player.isInGame()){
                    System.out.println("Победил игрок :" + player);
                    player.showCardsOnHand();
                    if (bestValue < player.countValuesOfAllCardsOnHand()) {
                        bestValue = player.countValuesOfAllCardsOnHand();
                    }
                }
            }
        }
        for (PlayerImpl player: playersIntGame) {
            if (player != null && player.isInGame()){
                System.out.println("Победил игрок :");
                player.showCardsOnHand();
                if (bestValue < player.countValuesOfAllCardsOnHand()) {
                    bestValue = player.countValuesOfAllCardsOnHand();
                }
            }
        }
//        return player;
    }

    public int countPlayersInGame() {
        int countPlayers = 0;
        for (PlayerImpl player: playersIntGame) {
            if (player != null && player.isInGame()){
                countPlayers ++;
            }
        }
        return countPlayers;
    }
    public void namePlayer(){
        Scanner scanner = new Scanner(System.in);
        playersIntGame = new PlayerImpl[scanner.nextInt()];
        System.out.println(scanner.nextInt());
    }
//
//    @Override
//    public void setCountOFPlayers() {
//        System.out.println("Имя пользователя - имя пользователя");
//        Scanner scanner = new Scanner(System.in);
//        playersIntGame = new PlayerImpl[scanner.nextInt()];
//        System.out.println(scanner.nextInt() + "ввод");
//    }
}
