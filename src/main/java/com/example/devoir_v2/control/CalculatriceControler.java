package com.example.devoir_v2.control;

import com.example.devoir_v2.model.BMR;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.awt.datatransfer.DataFlavor;
import java.io.IOException;

@WebServlet(name = "calculatriceServlet", value = "/calculatrice")
public class CalculatriceControler extends HttpServlet {

    BMR b;
    Calcule c = new Calcule();
    double result = 0.0;

    public void init(){}



   /* @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("je suis dans le doGet");
        // Récupérer les données du formulaire
        int poids = Integer.parseInt(request.getParameter("poids"));
        int taille = Integer.parseInt(request.getParameter("taille"));
        int age = Integer.parseInt(request.getParameter("age"));
        String genre = request.getParameter("genre");
        int activityLvl = Integer.parseInt(request.getParameter("activityLvl"));

        // Set attributes in request
        request.setAttribute("poids", poids);
        request.setAttribute("taille", taille);
        request.setAttribute("age", age);
        request.setAttribute("genre", genre);
        request.setAttribute("activityLvl", activityLvl);

        // Set attributes in session
        HttpSession session = request.getSession();
        session.setAttribute("poids", poids);
        session.setAttribute("taille", taille);
        session.setAttribute("age", age);
        session.setAttribute("genre", genre);
        session.setAttribute("activityLvl", activityLvl);

        result = c.CalculeBmr(b);
        request.setAttribute("result", result);

        // Forward to another JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);

        try{

            dispatcher.forward(request,response);

        }catch(ServletException se){
            throw new RuntimeException(se);
        }

    }*/

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("je suis dans le doPost");
        // Récupérer les données du formulaire
        int poids = Integer.parseInt(request.getParameter("poids"));
        int taille = Integer.parseInt(request.getParameter("taille"));
        int age = Integer.parseInt(request.getParameter("age"));
        String genre = request.getParameter("genre");
        int activityLvl = Integer.parseInt(request.getParameter("activityLvl"));

        b = new BMR(poids,taille,age,activityLvl,genre);

        result = c.CalculeBmr(b);

        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);

        System.out.println(result);

        try{

            dispatcher.forward(request,response);

        }catch(ServletException se){
            throw new RuntimeException(se);
        }
    }
}
