package com.company;

public class TextInput {
    protected String value = "";

    public void add(char c) {
        this.value += c;
    }

    public String getValue() {
        return this.value;
    }
}
