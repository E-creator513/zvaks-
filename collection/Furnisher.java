package com.collection;

public enum Furnisher {
    NONE,
    FINE,
    BAD;

    public static String nameList() {
        String nameList=" ,";
        for (Furnisher value1 : values()){
            nameList +=value1.name() + " ," ;
        }
        return nameList.substring(0, nameList.length()-2);
    }
}
