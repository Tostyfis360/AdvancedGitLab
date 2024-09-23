package com.example;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
        public static void main(String[] args) {
        System.out.println("Introduce your name");

        String name = inputUserString();

        String surname = inputUserString();

        System.out.println("Hello, please introduce your name and surname: " + name + " " +surname+ " !!!");

        System.out.println("Change to git stash");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));

        }

        public static String inputUserString() {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
    
            return input;
    
        }
}

