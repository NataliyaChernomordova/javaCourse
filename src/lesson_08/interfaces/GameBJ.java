package lesson_08.interfaces;

import lesson_08.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player); // Добавить игрока в игру

    void giveTwoCardsOnHand(); // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать доп карту игроку, если ему нужно

    void printWinner(); // объявлять победителя

    //    public void namePlayer(){
    //        Scanner scanner = new Scanner(System.in);
    //        playersIntGame = new PlayerImpl[scanner.nextInt()];
    //        System.out.println(scanner.nextInt());
    //    }
    //
//    void setCountOFPlayers();

//    int countPlayersInGame();
//    void setCountOFPlayers();
}
