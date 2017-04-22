package com.company;

public class Main {

    public static void main(String[] args) {
        TextInput textInput = new TextInput();
        NumericInput numericInput = new NumericInput();

        textInput.add('a');
        textInput.add('b');
        textInput.add('c');
        textInput.add('1');
        textInput.add('2');
        textInput.add('3');
        System.out.println(textInput.getValue());
        
        numericInput.add('a');
        numericInput.add('b');
        numericInput.add('c');
        numericInput.add('1');
        numericInput.add('2');
        numericInput.add('3');
        System.out.println(numericInput.getValue());
    }
}
