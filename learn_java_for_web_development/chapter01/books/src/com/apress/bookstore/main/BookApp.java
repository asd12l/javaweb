package com.apress.bookstore.main;

import com.apress.bookstore.model.Book;
import com.apress.bookstore.service.BookService;
import com.apress.bookstore.service.BookServiceImpl;

import java.util.List;

/**
 * Created by Loki on 10/8/2016.
 */
public class BookApp {
    private static BookService bookService = new BookServiceImpl();

    public static void main(String[] args) {
        System.out.println("Listing all books:");
        findAllBooks();

        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println("Searching Books by Keyword: Java");

        searchBooksByKeyword("java");
    }

    private static void findAllBooks() {
        List<Book> books = bookService.findAll();
        for (Book book : books) {
            System.out.println(book);
        }

    }

    private static void searchBooksByKeyword(String keyword) {
        List<Book> books = bookService.searchBooksByKeyword(keyword);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
