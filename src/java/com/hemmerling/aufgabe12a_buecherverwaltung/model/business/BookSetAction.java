/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe12a_buecherverwaltung.model.business;

import com.hemmerling.aufgabe12a_buecherverwaltung.model.persistence.Book;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BookSetAction {

    // Parameter
    private static final String ID = "id";
    private static final String TITLE = "title";
    private static final String AUTHOR = "author";
    private static final String YEAROFRELEASE = "yearofrelease";
    private static final String ISBN = "isbn";
    private static final String GENRE = "genre";

    private static final String BOOKSERVICE = "bookservice";

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Buch set #2");
        int id = Integer.valueOf(request.getParameter(ID));
        System.out.println("Buch set #3");
        String title = request.getParameter(TITLE);
        String autor = request.getParameter(AUTHOR);
        String yearOfRelease = request.getParameter(YEAROFRELEASE);
        String isbn = request.getParameter(ISBN);
        String genre = request.getParameter(GENRE);
        System.out.println("Buch set #4");
        
        if ((isbn != null && !isbn.trim().isEmpty())
                & (title != null && !title.trim().isEmpty())) {
            System.out.println("Buch set #5");
            Book book = new Book(id, title, autor, yearOfRelease, isbn, genre);
            HttpSession session = request.getSession();
            BookService bookService = (BookService) session.getAttribute(BOOKSERVICE);
            bookService.set(id, book);
        }
        System.out.println("Buch set #6");

    }
}
