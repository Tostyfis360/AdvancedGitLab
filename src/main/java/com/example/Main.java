package com.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        System.out.println("Introduce your name");

        String name = inputUserString();

        System.out.println("Hello: " + name + " !!!");
    }

    public static String inputUserString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
}