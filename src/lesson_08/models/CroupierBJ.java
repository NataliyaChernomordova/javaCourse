package lesson_08.models;

public class CroupierBJ extends PlayerImpl {
    @Override
    public boolean isCroupier() {
        return true;
    }

    public boolean needCard() {
        return countValuesOfAllCardsOnHand() <= 17;
    }

    @Override
    public void setInGame(boolean inGame) {
        super.setInGame(inGame);
    }

}


