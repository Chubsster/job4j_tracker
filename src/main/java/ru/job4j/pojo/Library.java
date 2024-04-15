package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 100);
        Book shantarem = new Book("Shantarem", 250);
        Book ono = new Book("Ono", 150);
        Book zolushka = new Book("Zolushke", 200);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = shantarem;
        books[2] = ono;
        books[3] = zolushka;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " = " + book.getCount());
        }
        System.out.println("Replace Clean Cod and Zolushka");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " = " + book.getCount());
        }
        System.out.println("Books name Clean Code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName() == "Clean Code") {
                System.out.println(book.getName() + " = " + book.getCount());

            }

        }

    }

}
