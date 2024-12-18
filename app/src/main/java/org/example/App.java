package org.example;
public class App {

    public static void main(String[] args) {
        Book myBook = new Book("Jay's Life", "Janelle", 2024);
        myBook.getTitle();

        System.out.println(myBook.getTitle());
    }
}