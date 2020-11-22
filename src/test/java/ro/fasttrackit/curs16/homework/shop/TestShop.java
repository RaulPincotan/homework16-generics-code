package ro.fasttrackit.curs16.homework.shop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class TestShop {

    @Test
    @DisplayName("When shop is initialized with an empty list ThHEN getAllItems  isEmpty")
    void testEmptyList() {
        Shop<Electronic> shop = new Shop<>(List.of(
        ));
        List<Electronic> recieved = shop.getAllItems();
        assertThat(recieved).isEmpty();

    }

    @Test
    @DisplayName("WHEN shop is initialized with an empty list ThHEN getAllItems  isEmpty")
    void testIsNotEmptyList() {
        Shop<Electronic> shop = new Shop<>(List.of(new Electronic("tv", 2000, Category.ON_SALE)
        ));
        List<Electronic> recieved = shop.getAllItems();
        assertThat(recieved).hasSize(1);

    }

    @Test
    @DisplayName("WHEN findItem method is called THEN will return the item with given name")
    void testfindItem() {
        Shop<Electronic> shop = new Shop<>(List.of(new Electronic("tv", 2000, Category.ON_SALE)));
        Optional<Electronic> obtained = shop.findByName("tv");
        assertThat(obtained).isEqualTo(Optional.of(new Electronic("tv", 2000, Category.ON_SALE)));

    }
}
