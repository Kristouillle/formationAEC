package com.example.devoir_v2.control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class PageControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Decide which JSP page to forward to based on some condition
        String nextPage;
        if (1==1) {
            nextPage = "page1.jsp";
        } else {
            nextPage = "page2.jsp";
        }

        // Forward the request to the next JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
    }
}
