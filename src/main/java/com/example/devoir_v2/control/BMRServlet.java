package com.example.devoir_v2.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/BMRServlet")
public class BMRServlet extends HttpServlet {

    double activityModifier, resultBmr;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        int poids = Integer.parseInt(request.getParameter("weight"));
        int taille = Integer.parseInt(request.getParameter("height"));
        int age = Integer.parseInt(request.getParameter("age"));
        String genre = request.getParameter("genre");
        int activityLvl = Integer.parseInt(request.getParameter("activityLvl"));

        System.out.println("genre: "+genre);
        System.out.println(activityLvl);

        // Calculate BMR (example calculation)
        switch (activityLvl){
            case 0:
                activityModifier = 1.2;
                break;
            case 1:
                activityModifier = 1.375;
                break;
            case 2:
                activityModifier = 1.55;
                break;
            case 3:
                activityModifier = 1.725;
                break;
            case 4:
                activityModifier = 1.9;
                break;
            default:
                activityModifier = 1;
                break;

        }
        System.out.println(activityLvl);

        System.out.println(activityModifier);

        if (genre.equals("homme")){
            resultBmr = (66.47 + (13.75*poids)+(5.003*taille)-(6.755*age))*activityModifier;
            System.out.println("je suis homme");
        }
        else {
            resultBmr = (655.1+(9.563*poids)+(1.85*taille)-(6.755*age))*activityModifier;
            System.out.println("je suis femme");
        }


        // Set the BMR result as an attribute in request
        request.setAttribute("bmr", resultBmr);



        // Forward the request to the about.jsp page
        request.getRequestDispatcher("page2.jsp").forward(request, response);
    }
}
