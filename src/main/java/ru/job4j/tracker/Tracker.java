package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    //private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        //return Arrays.copyOf(items, size);
        return items;
    }

    public List<Item> findByName(String key) {
        //Item[] rsl = new Item[size];
        List<Item> rsl = new ArrayList<>();
        //int count = 0;
        for (int index = 0; index < items.size(); index++) {
            //Item name = items[index];
            Item name = items.get(index);
            if (name.getName().equals(key)) {
                //rsl[count] = name;
                rsl.add(name);
                //count++;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            //if (items[index].getId() == id) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            //items[index] = item;
            items.add(item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            //  System.arraycopy(items, index + 1, items, index, size - index - 1);
            //  items[size - 1] = null;
            //  size--;
            // }
            items.remove(index);
        }
        return rsl;
    }
}