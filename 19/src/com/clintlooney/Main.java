package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        char charVar = 'I';
        // YOu must use '', not "". You also cannot have more than 1 character in a char.
        // A char has a width of 16 (2 bytes).
        // You can also store a unicode character in a char.
        // Preface unicode characters with '\u'.
        char unicodeVar = '\u00A9';
        System.out.println(unicodeVar);

        bool boolVar = false;

    }
}
