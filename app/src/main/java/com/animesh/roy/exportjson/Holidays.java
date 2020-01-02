package com.animesh.roy.exportjson;

public class Holidays {

    private final String name;
    private final String date;

    public Holidays(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
