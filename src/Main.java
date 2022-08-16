import book.Book;
import book.author.Author;

public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author("Валерий", "Сюткин");
        Author authorTwo = new Author("Юрий", "Гагарин");

        Book bookOne = new Book("Вася", 1991, authorOne);
        Book bookTwo = new Book("Поехали", 1961, authorTwo);

        bookOne.setYearOfPublication(1999);
    }
}