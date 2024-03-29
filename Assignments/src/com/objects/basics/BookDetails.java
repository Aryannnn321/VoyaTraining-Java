package com.objects.basics;

public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("Jvava", "surya", 344, "horror");
        book.getDetails();
        book.checkbookType();
    }
}
