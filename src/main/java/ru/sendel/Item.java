package ru.sendel;

import java.util.List;

public class Item {

    private String inputString;

    int index;

    private List<String> dec;

    private Group group;

    public Item(){
    }

    public Item(String inputString, List<String> dec, Group group) {
        this.inputString = inputString;
        this.dec = dec;
        this.group = group;
    }

    public String getInputString() {
        return inputString;
    }

    public void setDec(List<String> dec) {
        this.dec = dec;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public List<String> getDec() {
        return dec;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String toString() {
        return inputString;
    }

}
