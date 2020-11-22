package ro.fasttrackit.curs16.homework.shop;

import java.util.*;

public class Shop<T extends ShopItem> {
    private final List<T> items = new ArrayList<>();

    public Shop(Collection<T> items) {
        if (items != null) {
            this.items.addAll(items);
        }
    }


    public void addItem(T item) {
        Optional<T> itm = Optional.ofNullable(item);
        if (itm.isPresent()) {
            items.add(item);
        }
    }

    public List<T> findByCategory(Category category) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        return result;
    }


    public List<T> findWithLowerPrice(int max) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.getPrice() <= max) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {

        for (T item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
        return Optional.empty();
    }

    List<T> getAllItems() {
        return new ArrayList<T>(items);
    }
}
