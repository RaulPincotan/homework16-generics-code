package ro.fasttrackit.curs16.homework.shop;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Shop<Electronic> electronicShop = new Shop<>(List.of());
        electronicShop.addItem(new Electronic("tv", 1500, Category.ON_SALE));
        electronicShop.addItem(new Electronic("laptop", 2100, Category.REFURBISHED));
        electronicShop.addItem(new Electronic("monitor", 800, Category.ON_SALE));
        electronicShop.addItem(new Electronic("lampa", 50, Category.NEW));
        electronicShop.addItem(new Electronic("telefon", 1100, Category.REFURBISHED));
        electronicShop.addItem(new Electronic("imprimanta", 200, Category.ON_SALE));
        electronicShop.addItem(new Electronic("ceas", 300, Category.NEW));
        electronicShop.addItem(null);
        System.out.println(electronicShop.findByCategory(Category.ON_SALE));
        System.out.println(electronicShop.findWithLowerPrice(1200));

        System.out.println(electronicShop.findByName("ceas"));
        System.out.println();
        System.out.println(electronicShop.getAllItems());
        electronicShop.removeItem("imprimanta");
        System.out.println();
        System.out.println(electronicShop.getAllItems());
    }
}
