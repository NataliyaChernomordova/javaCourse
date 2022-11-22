package lesson_08.models;

import lesson_08.interfaces.Card;
import lesson_08.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {
    public PlayerImpl() {
        super();
    }
    // Поля
    Card [] cardsOnHand = new Card [100];
    boolean inGame;
    String name = new String();
    //Конструктор


    public PlayerImpl(String name) {
        this.name = name;
    }
    // Методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null){
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int count = 0;
        for (Card c : cardsOnHand) {
            if (c != null) {
                count += c.getValue();
            }
        }
        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("------------Ваши карты------------ ");
        showCardsOnHand();
        System.out.println("Нужна ли вам ещё карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("Да")){
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        for (Card card : cardsOnHand){
            if (card != null) {
                card.printCard();
            }
        }

    }

    @Override
    public boolean isCroupier() {
        return false;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }
}
