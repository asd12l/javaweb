package com.apress.bookstore.service;

import com.apress.bookstore.model.Book;
import com.apress.bookstore.model.Category;

import java.util.List;

/**
 * Created by Loki on 10/8/2016.
 */
public interface BookService {
    public List<Book> findAll();
    public List<Category> findAllCategories();

    public List<Book> searchBooksByKeyword(String keyWord);
}
