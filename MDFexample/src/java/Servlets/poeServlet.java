/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DTO.PoEDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.ControlDAO;

@WebServlet(name = "poeServlet", urlPatterns = {"/poeServlet"})
public class poeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ControlDAO query = new ControlDAO();

        String poe_ID = request.getParameter("poe_ID");

        PoEDTO poe = new PoEDTO(
                poe_ID,
                request.getParameter("Campaign_type"),
                request.getParameter("Activity:"),
                request.getParameter("Date"),
                request.getParameter("Recipients"),
                request.getParameter("Unique_opens_hits"),
                request.getParameter("Unique_clicks"),
                request.getParameter("additional_information"),
                request.getParameter("dataFile"));

        query.addPoERequestToDatabase(poe);
        query.updateCampaignStatusAfterPoeUpload(poe_ID);

        RequestDispatcher disp = request.getRequestDispatcher("submitted.jsp");
        disp.forward(request, response);
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
