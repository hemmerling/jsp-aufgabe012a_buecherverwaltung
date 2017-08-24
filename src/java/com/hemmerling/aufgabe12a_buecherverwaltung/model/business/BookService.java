/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe12a_buecherverwaltung.model.business;

import com.hemmerling.aufgabe12a_buecherverwaltung.model.persistence.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rhemmerling
 */
public class BookService {

    /* static */ List<Book> bookList;
    private static BookService instance = null;
    
    public BookService() {
    }

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }

    public List<Book> get() {
        if (bookList == null) {
            bookList = new ArrayList<Book>();
        }
        return bookList;
    }

    public void add(Book book) {
        bookList.add(book);
    }

    public void set(int id, Book book) {
        bookList.set(id, book);
    }

    public void remove(int id) {
        bookList.remove(id);
    }

}
