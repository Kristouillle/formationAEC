package com.example.devoir_v2.view;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/page2")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Motivation";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Afficher la vue "home.jsp" par défaut
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }


    public void destroy() {
    }


}