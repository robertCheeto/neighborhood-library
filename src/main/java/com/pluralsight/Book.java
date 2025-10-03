package com.pluralsight;

public class Book {
    private int bookID;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String isCheckedOutTo;

    public Book(int bookID, String isbn, String title, boolean isCheckedOut, String isCheckedOutTo) {
        this.bookID = bookID;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.isCheckedOutTo = isCheckedOutTo;
    } // Book Constructor

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", isCheckedOutTo='" + isCheckedOutTo + '\'' +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getIsCheckedOutTo() {
        return isCheckedOutTo;
    }

    public void setIsCheckedOutTo(String isCheckedOutTo) {
        this.isCheckedOutTo = isCheckedOutTo;
    }


    // TO-DO: add code to get the checkOut and checkIn data for the books
    public void checkOut(String title, String name) {
        System.out.print("Enter a Book Title you would like to check out: ");
        book.getTitle();
        System.out.print("Please enter your name: ");
        book.setIsCheckedOutTo() = book.getIsCheckedOutTo();

    } // checkOut method

    public void checkIn() {
        // work goes here as well :)
    } // checkIn method

}
