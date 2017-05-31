package com.xamarin;

import managed_dll.methods.Parameters;

public class Main {
    public static void main(String[] args) {
        String text = Parameters.concat("Hello, ", "Embeddinator!");
        System.out.println(text);
    }
}
