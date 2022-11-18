package lesson_08.interfaces;

public interface GameBJ {
    void addPlayerInGame(Player player); // Добавить игрока в игру

    void giveTwoCardsOnHand(); // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать доп карту игроку, если ему нужно

    void printWinner(); // объявлять победителя
}
