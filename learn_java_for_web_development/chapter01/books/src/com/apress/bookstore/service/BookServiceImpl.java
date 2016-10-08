package com.apress.bookstore.service;

import com.apress.bookstore.dao.BookDAO;
import com.apress.bookstore.dao.BookDAOImpl;
import com.apress.bookstore.model.Book;
import com.apress.bookstore.model.Category;

import java.util.List;

/**
 * Created by Loki on 10/8/2016.
 */
public class BookServiceImpl implements  BookService {
    private  static BookDAO bookDAO = new BookDAOImpl();

    @Override
    public List<Book> findAll() {
        List<Book> list = bookDAO.findAllBooks();
        return  list;
    }

    @Override
    public List<Category> findAllCategories() {
        List<Category> list = bookDAO.findAllCategories();
        return  list;
    }

    @Override
    public List<Book> searchBooksByKeyword(String keyWord) {
        List<Book> list = bookDAO.searchBooksByKeyword(keyWord);
        return  list;
    }
}
