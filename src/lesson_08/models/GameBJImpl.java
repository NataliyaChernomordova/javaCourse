package lesson_08.models;

import lesson_08.interfaces.GameBJ;

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
            if (player != null){
                if (player.countValuesOfAllCardsOnHand() > 21){
                    player.setInGame(false);
                }
            }
        }
        //2. Победил один игрок, оставшийся в игре
        if (countPlayersInGame() == 1){
            System.out.println("Победил игрок :");
            for (PlayerImpl player: playersIntGame){
                if (player != null && player.isInGame()){
                    player.showCardsOnHand();
                }
            }
        }

        //3. Победило несколько игроков, нужно выбрать одного с лучшим значением карт на руках

        int bestValue = 0;
        for (PlayerImpl player: playersIntGame) {
            if (player != null && player.isInGame()){
                if (bestValue < player.countValuesOfAllCardsOnHand()) {
                    bestValue = player.countValuesOfAllCardsOnHand();
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
    }

    public int countPlayersInGame(){
        int countPlayers = 0;
        for (PlayerImpl player: playersIntGame) {
            if (player != null && player.isInGame()){
                countPlayers ++;
            }
        }
        return countPlayers;

    }
}
