package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemAscByNameTest {

    @Test
    public void whenAscByName() {
        List<Item> items = Arrays.asList(
                new Item("qqq"),
                new Item("www"),
                new Item("eee")
        );
        List<Item> expected = Arrays.asList(
                new Item("eee"),
                new Item("qqq"),
                new Item("www")
        );
        items.sort(new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }
}