package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class NumericInput extends TextInput {
    private Collection<TextInput> textInputCollection = new ArrayList<TextInput>();

    @Override
    public void add(char c) {
        if (((int) c) > 48 && ((int) c) < 57) {
            this.value += c;
        }
    }
}
