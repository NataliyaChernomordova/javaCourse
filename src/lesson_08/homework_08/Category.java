package lesson_08.homework_08;

public class Category extends Goods {
    private String nameCategory;
    Goods [] goods = new Goods [5];

    public Category(Goods[] goods) {
        this.goods = goods;
    }

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    Category milkProduct = new Category("Молочные продукты");
    Category bakeryProducts = new Category("Хлебобулочные изделия");
    Category grocery = new Category("Бакалея");

}
