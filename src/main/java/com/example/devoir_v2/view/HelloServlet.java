package com.example.devoir_v2.view;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/page2")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Motivation";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Your JSP Page</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Form</h1>");
        out.println("<form action=\"AutreCalculatrice\" method=\"post\">");
        out.println("    <input type=\"number\" id=\"poids\" name=\"poids\" required><br><br>");
        out.println("    <input type=\"submit\" value=\"Submit\">");
        out.println("</form>");

        out.println("<label>");
        out.println("    Résultat: ${result}");
        out.println("</label>");
        out.println("</body>");
        out.println("</html>");

    }

    public void destroy() {
    }


}