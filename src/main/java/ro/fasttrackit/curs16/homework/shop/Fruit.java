package ro.fasttrackit.curs16.homework.shop;

import java.util.Objects;

public class Fruit implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;


    public Fruit(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruits = (Fruit) o;
        return price == fruits.price &&
                Objects.equals(name, fruits.name) &&
                category == fruits.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
