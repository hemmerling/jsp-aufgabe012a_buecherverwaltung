/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe12a_buecherverwaltung.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hemmerling.aufgabe12a_buecherverwaltung.model.business.*;

/**
 *
 * @author rhemmerling
 */
@WebServlet(name = "FrontController4", urlPatterns = {"/FrontController4/*"})
public class FrontController4 extends HttpServlet {

    private static final String ACTION = "action";
    private static final String CREATE = "create";
    private static final String READ = "read";
    private static final String DELETE = "delete";
    private static final String SET = "set";
    private static final String UPDATE = "update";
    private static final String LOGIN = "login";
    private static final String LOGOUT = "logout";

    private static final String STARTPAGE = "index4.jsp";
    private static final String CREATEPAGE = "create4.jsp";
    private static final String READPAGE = "read4.jsp";
    private static final String UPDATEPAGE = "update4.jsp";

    private static final String BOOKSERVICE = "bookservice";

    private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getUserPrincipal() != null) {
            request.logout();
            request.getAuthType();
        }
        String username = request.getParameter("username");
        request.login(username, "password");
    }

    private void doLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getUserPrincipal() != null) {
            request.logout();
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     * Processes just the doGet() request
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = null;
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
        BookService bookService = (BookService) session.getAttribute(BOOKSERVICE);

        //String action = request.getParameter(ACTION);
        String actionPathinfo = request.getPathInfo(); // ===> "/bookList"

        if (actionPathinfo == null) {
            actionPathinfo = "";
        }
        String action = actionPathinfo.substring(1); // ===> "bookList"

        if (action != null && !action.trim().isEmpty()) {
            switch (action) {
                case UPDATE: {
                    new BookUpdateAction().execute(request, response);
                    nextPage = UPDATEPAGE;
                    break;
                }
                case CREATE: {
                    new BookCreateAction().execute(request, response);
                    //nextPage = CREATEPAGE;
                    nextPage = READPAGE;
                    break;
                }
                case READ: {
                    nextPage = READPAGE;
                    break;
                }
                case DELETE: {
                    new BookDeleteAction().execute(request, response);
                    nextPage = READPAGE;
                    break;
                }
                case SET: {
                    new BookSetAction().execute(request, response);
                    //nextPage = CREATEPAGE;
                    nextPage = READPAGE;
                    break;
                }
                case CREATEPAGE: {
                    nextPage = "/" + CREATEPAGE;
                    break;
                }
                case READPAGE: {
                    nextPage = "/" + READPAGE;
                    break;
                }
                case UPDATEPAGE: {
                    nextPage = "/" + UPDATEPAGE;
                    break;
                }
                case LOGIN: {
                    doLogin(request, response);
                    nextPage = STARTPAGE;
                    break;
                }
                case LOGOUT: {
                    doLogout(request, response);
                    nextPage = STARTPAGE;
                    break;
                }
                default: {
                    System.out.println("/FrontController command error ( 'default' )");
                }
            }

        }

        if (nextPage != null) {
            RequestDispatcher requestDispatcher
                    = request.getRequestDispatcher(nextPage);
            requestDispatcher.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
