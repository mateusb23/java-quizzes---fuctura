package model;

import java.util.Set;
import java.util.TreeSet;

public class Numbers {

    private final Set<Integer> numberList = new TreeSet<>();

    public Numbers() { }

    public Set<Integer> getNumberList() {
        return numberList;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numberList=" + numberList +
                '}';
    }

}
