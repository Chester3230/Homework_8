package book;

import book.author.Author;

public class Book {
    private String name;
    private int yearOfPublication;
    private Author author;

    public Book(String name, int yearOfPublication, Author author){
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
