package lesson_08.homework_08;

public class Category extends Goods {
    private String nameCategory;
    Goods [] goods = new Goods [6];


    public Category(String nameGoods, String price, String top) {
        super(nameGoods, price, top);
    }

    Category product = new Category("milk" , "80" , "7");
    Category clothes = new Category ("jeans", "2000", "8");
    Category shoes = new Category("shoes", "4000", "6");
//    public Category(Goods[] goods) {
//        this.goods = goods;
//    }
//


//    Category product = new Category("Продукты");
//        Category clothes = new Category("Одежда");
//        Category shoes = new Category("Обувь");


}
