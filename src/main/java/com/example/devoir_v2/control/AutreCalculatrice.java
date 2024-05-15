package com.example.devoir_v2.control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AutreCalculatrice extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Process form data
        // For simplicity, let's assume you want to echo back the entered value of "poids"
        String poids = request.getParameter("poids");

        // Set the result in request attribute
        request.setAttribute("result", "You entered: " + poids);

        // Forward the request to the same JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("your_page.jsp");
        dispatcher.forward(request, response);
    }
}