package lesson_08.homework_08;

public class Goods {
    private String nameGoods;
    private String price;
    private String top;


    public Goods(String nameGoods, String price, String top) {
        this.nameGoods = nameGoods;
        this.price = price;
        this.top = top;
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = String.valueOf(price);
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
