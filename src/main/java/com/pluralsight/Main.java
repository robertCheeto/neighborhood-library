package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isCheckedOut = true;

        Book[] bookInventory = {
                new Book(1001, "100-1-10-1010-1","To Kill a Mockingbird", false, ""),
                new Book(1092, "200-2-20-2020-2","The Great Gatsby", true, "John Green"),
                new Book(3003, "300-3-30-3030-3","All Quiet on the Western Front", true, "Dan Spezialetti"),
                new Book(7004, "400-4-40-4040-4","1984", false, ""),
                new Book(4505, "401-9-43-0934-5","Fahrenheit 451", true, "Mary Lou"),
                new Book(6520, "590-3-30-3030-6","Rich Dad, Poor Dad", false, ""),
                new Book(8008, "012-8-99-2384-7","The Symposium", true, "Jarred Schlatter"),
                new Book(5123, "583-7-92-4418-8","Harry Potter and the Sorcerer's Stone", false, ""),
                new Book(2718, "907-9-44-1835-9","Wheel of Time - New Spring", false, ""),
                new Book(9113, "361-5-67-9281-0","The Stormlight Archive: The Way of Kings", true, "Dave Stein"),
                new Book(3640, "478-2-39-5562-1","Lone Survivor", true, "George McCartney"),
                new Book(4912, "652-8-84-1204-2","The Art of War", false, ""),
                new Book(7190, "129-4-56-7349-3","The Love Hypothesis", true, "Caroline Oak"),
                new Book(8280, "840-6-71-2987-4","The Fault in Our Stars", false, ""),
                new Book(6912, "735-1-23-6405-5","Dune", false, ""),
                new Book(9695, "293-0-88-4156-6","The Hunger Games", true, "Sally Mae"),
                new Book(8123, "516-9-12-8740-7","A Child Called It", false, ""),
                new Book(5902, "678-2-35-9021-8","How to Win Friends and Influence People", false, ""),
                new Book(7546, "442-7-29-6834-9","The 48 Laws of Power", true, "Matt Rinaldo"),
                new Book(8014, "871-5-64-2097-0","Diary of a Wimpy Kid", true, "Jeff Kinney"),

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
                    System.out.println("Loading available books...\n********************");
                    listAvailableBooks(bookInventory, keyboard);
                    break;

                    case (2):
                    System.out.println("Showing checked out books...\n**********");
                    listCheckedOutBooks(bookInventory, keyboard);
                    break;

                    case (3):
                    System.out.println("Exiting the program...");
                    System.exit(0);

                default:
                    System.out.println("\n**********\nPlease enter a valid value.");
            } // end of switch case
        } // end of while loop
    } // end of main()

    public static void listAvailableBooks(Book[] bookInventory, Scanner keyboard) {
        for (Book book : bookInventory) {
            if (!book.isCheckedOut()) {
                System.out.printf("Book ID: %s\t\t Book ISBN: %s\t\t Book Title: %s\n", book.getBookID(), book.getIsbn(), book.getTitle());
            } // end of if statement
        } // end of for loop
        System.out.println("********************");
        System.out.print("\nWould you like to check out a book? (Y/N): ");
        String menuInput = keyboard.nextLine().trim();
        char charInput = menuInput.charAt(0);
        if (charInput == 'y' || charInput == 'Y') {
            System.out.print("Enter in the Book ID you want to check out: ");
            int bookID = keyboard.nextInt();
            keyboard.nextLine();

            for (Book book : bookInventory) {
                if (book.getBookID() == bookID && book.isCheckedOut() == false) {
                    System.out.printf("You are checking out %s, please enter your name: ", book.getTitle());
                    String name = keyboard.nextLine();
                    book.checkOut(name);
                } // end of if statement
                else {
                    System.out.println("Invalid Book ID");
                    break;
                }
            } // end of for each loop
        } // end of if statement
    } // end of listAllBooks

    public static void listCheckedOutBooks(Book[] bookInventory,Scanner keyboard) {
        for (Book book : bookInventory) {
            if (book.isCheckedOut()) {
                System.out.printf("Book ID: %s\t\t Book ISBN: %s\t\t Book Title: %s\t\t Checked Out To: %s\n", book.getBookID(), book.getIsbn(), book.getTitle(), book.getIsCheckedOutTo());
            } // end of if statement
        } // end of for loop

        System.out.println("********************");
        System.out.print("\nWould you like to check in a book? (Y/N): ");
        String menuInput = keyboard.nextLine().trim();
        char charInput = menuInput.charAt(0);
        if (charInput == 'y' || charInput == 'Y') {
            System.out.print("Enter in the Book ID you want to check in: ");
            int bookID = keyboard.nextInt();
            keyboard.nextLine();

            for (Book book : bookInventory) {
                if (book.getBookID() == bookID && book.isCheckedOut() == true) {
                    book.checkIn("");
                } // end of if statement
                else {
                    System.out.println("Invalid Book ID");
                }
            } // end of for each loop
        } // end of if statement

    } // end of listCheckedOutBooks

}
