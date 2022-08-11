package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemDescByNameTest {
    @Test
    public void whenDescByName() {
        List<Item> items = Arrays.asList(
                new Item("qqq"),
                new Item("www"),
                new Item("eee")
        );
        List<Item> expected = Arrays.asList(
                new Item("www"),
                new Item("qqq"),
                new Item("eee")
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}
