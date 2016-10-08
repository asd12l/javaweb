package com.apress.bookstore.dao;

import com.apress.bookstore.model.Book;
import com.apress.bookstore.model.Category;

import java.util.List;

/**
 * Created by Loki on 10/8/2016.
 */
public interface BookDAO {
    public List<Book> findAllBooks();

    public List<Category> findAllCategories();

    public List<Book> searchBooksByKeyword(String keyWord);
}
