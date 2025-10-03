package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Book[] bookInventory = {
                new Book(0001, "100-1-10-1010-1", "Book Title 1", false, ""),
                new Book(0002,"200-2-20-2020-2", "Book Title 2", true, "John Green"),
                new Book(0003, "300-3-30-3030-3", "Book Title 3", false, ""),
                new Book(0004, "400-4-40-4040-4", "Book Title 4", false, ""),
                new Book(0005, "401-4-41-4141-4", "Book Title 4.5", true, "Mary Lou")
        };

        System.out.println();

    }
}
