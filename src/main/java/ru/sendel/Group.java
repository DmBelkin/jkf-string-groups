package ru.sendel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Group {

    private int number;

    private List<Item> items;

    private Set<String> rows;

    public Group(int number, List<Item> items) {
        this.number = number;
        this.items = items;
        rows = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItem(Item item) {
        items.add(item);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Группа " + number + "\n");
        for (Item item : items) {
            out.append(item.getInputString() + "\n");
        }
        return out.toString().trim();
    }


}
