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
}
