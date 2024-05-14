package com.example.devoir_v2.control;

import com.example.devoir_v2.model.BMR;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "calculatriceServlet", value = "/calculatrice")
public class CalculatriceControler extends HttpServlet {

    BMR b;
    Calcule c = new Calcule();
    double result = 0.0;

    public void init(){}

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Récupérer les données du formulaire
        int poids = Integer.parseInt(request.getParameter("poids"));
        int taille = Integer.parseInt(request.getParameter("taille"));
        int age = Integer.parseInt(request.getParameter("age"));
        String genre = request.getParameter("genre");
        String objectif = request.getParameter("objectif");

        request.setAttribute("montant", montant);
        request.setAttribute("taux", taux);
        request.setAttribute("duree", duree);
        HttpSession session = request.getSession();

        session.setAttribute("montant", montant);
        session.setAttribute("taux", taux);
        session.setAttribute("duree", duree);

        result = c.CalculeLeMontantMensuel(r);
        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("calculatrice.jsp");

        try{

            dispatcher.forward(request,response);

        }catch(ServletException se){
            throw new RuntimeException(se);
        }


    }
}
