package com.example;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
        public static void main(String[] args) {
        System.out.println("Introduce your name");

        String name = inputUserString();

        System.out.println("Hello: " + name + " !!!");

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

