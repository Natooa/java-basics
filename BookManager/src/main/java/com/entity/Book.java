package com.entity;

public class Book{
    private final int idOfBook;
    private final String bookName;
    private final String bookAuthor;
    private static int countOfId = 0;

    public Book(int idOfBook, String bookName, String bookAuthor) {
        if((bookName == null || bookName.trim().isEmpty()) || (bookAuthor == null || bookAuthor.trim().isEmpty())) {
            throw new IllegalArgumentException("bookName or bookAuthor is null");
        }
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.idOfBook = ++countOfId;
    }
    public int getIdOfBook() {
        return idOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getCountOfId() {
        return countOfId;
    }
}
