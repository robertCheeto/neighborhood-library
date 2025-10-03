package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isCheckedOut = true;

        Book[] bookInventory = {
                new Book(0001, "100-1-10-1010-1","Book Title 1", false, ""),
                new Book(0002, "200-2-20-2020-2","Book Title 2", true, "John Green"),
                new Book(0003, "300-3-30-3030-3","Book Title 3", false, ""),
                new Book(0004, "400-4-40-4040-4","Book Title 4", false, ""),
                new Book(0005, "401-4-41-4141-4","Book Title 4.5", true, "Mary Lou")
        };

        System.out.println("=== Welcome to the CommUNITY Library ===");

        while (true) {
            System.out.println("\nSelect the menu you would like to access by entering the corresponding number\n");
            System.out.println("1) Show All Available Books");
            System.out.println("2) Show Checked Out Books");
            System.out.println("3) Exit Program");

            System.out.print("Please enter your choice: ");
            int userInput = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("\n*****\n");

            switch (userInput) {
                case (1):
                    System.out.println("Showing available books...");
                    listAvailableBooks(bookInventory, isCheckedOut);
                    // need to update listAvailableBooks to have the display just show the bookID, isbn, and title
                    break;
                case (2):
                    System.out.println("Showing checked out books...");
                    listCheckedOutBooks(bookInventory, isCheckedOut);
                    break;
                case (3):
                    System.out.println("Exiting the program");
                    // turn true to false and exit program
                default:
                    System.out.println("\n**********\nPlease enter a valid value.");
            } // end of switch case

        } // end of while loop
    } // end of main()

    public static void listAvailableBooks(Book[] bookInventory, boolean isCheckedOut) {
        for (Book book : bookInventory) {
            if (book.isCheckedOut() == false) {
                System.out.printf("Book ID: %s\t\t Book ISBN: %s\t\t Book Title: %s\n", book.getBookID(), book.getIsbn(), book.getTitle());
            } // end of if statement
        } // end of for loop
    } // end of listAllBooks

    public static void listCheckedOutBooks(Book[] bookInventory, boolean isCheckedOut) {
        for (Book book : bookInventory) {
            if (book.isCheckedOut()) {
                System.out.printf("Book ID: %s\t\t Book ISBN: %s\t\t Book Title: %s\t\t Checked Out To: %s\n", book.getBookID(), book.getIsbn(), book.getTitle(), book.getIsCheckedOutTo());
            }
        }

    }

}
