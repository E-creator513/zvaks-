package com.collection;

public enum View {
    STREET(1),
    YARD(2),
    BAD(3),
    NORMAL(4),
    GOOD(5);
    int value;

    View(int value) {
        this.value = value;
    }

    public static String nameList() {
        String nameList = "";
        for (View view1 : values()) {
            nameList += view1.name() + " ,";
        }
        return nameList.substring(0,nameList.length()-2);
    }


}
