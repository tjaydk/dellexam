/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DTO.CampaignDTO;
import DTO.MdfDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.ControlDAO;
import logic.FetchRequest;

/**
 *
 * @author Dennis
 */
@WebServlet(name = "mdfServlets", urlPatterns = {"/mdfServlets"})
public class mdfServlets extends HttpServlet {

    ControlDAO query = new ControlDAO();
    FetchRequest FR = new FetchRequest();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MdfDTO mdf = new MdfDTO(request.getParameter("Submission_date"),
                request.getParameter("Company_address"),
                request.getParameter("Contact_name"),
                request.getParameter("Contact_email"),
                request.getParameter("Company_name"),
                request.getParameter("Contact_phone"),
                request.getParameter("Program_date"),
                request.getParameter("Estimated_attendees"),
                request.getParameter("Start_time"),
                request.getParameter("Venue_name"),
                request.getParameter("End_time"),
                request.getParameter("Venue_address"),
                request.getParameter("face_to_face"),
                request.getParameter("Tradeshows"),
                request.getParameter("Multi_touch_campaign"),
                request.getParameter("Door_opener_campaign"),
                request.getParameter("Third_party_campaign"),
                request.getParameter("Direct_mail"),
                request.getParameter("Blitz_campaign"),
                request.getParameter("description_agenda"),
                request.getParameter("Diss_Storage_1"),
                request.getParameter("Diss_Storage_2"),
                request.getParameter("Diss_Storage_3"),
                request.getParameter("Diss_Storage_4"),
                request.getParameter("Diss_Storage_5"),
                request.getParameter("Diss_Storage_6"),
                request.getParameter("Diss_Server_1"),
                request.getParameter("Diss_Server_2"),
                request.getParameter("Diss_Server_3"),
                request.getParameter("Diss_Server_4"),
                request.getParameter("Diss_Network_1"),
                request.getParameter("Diss_Network_2"),
                request.getParameter("Diss_Solutions_1"),
                request.getParameter("Diss_Solutions_2"),
                request.getParameter("Diss_Solutions_3"),
                request.getParameter("Diss_Solutions_4"),
                request.getParameter("Diss_Solutions_5"),
                request.getParameter("Diss_Solutions_6"),
                request.getParameter("Diss_text"),
                request.getParameter("Target_1"),
                request.getParameter("Target_2"),
                request.getParameter("Target_3"),
                request.getParameter("Additional_totalcost"),
                request.getParameter("Additional_totalmdf"),
                request.getParameter("Additional_reimbursement"),
                request.getParameter("Additional_participating"),
                request.getParameter("Additional_contribution"),
                request.getParameter("Additional_opportunities"),
                request.getParameter("Additional_revenue"));

        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        try {
            CampaignDTO camp = new CampaignDTO(request.getParameter("Campaign_name"), FR.fetchPartnerNo(user));
            query.addMdfRequestToDatabase(mdf, camp);
            query.addCampaignToDatabase(mdf, camp);
        } catch (SQLException ex) {
            Logger.getLogger(mdfServlets.class.getName()).log(Level.SEVERE, null, ex);
        }

//        FETCH CAMPAIGNS FROM DATABASE
        ArrayList<CampaignDTO> result = null;

        try {
            result = query.fetchPendingCampaignsForPartner(FR.fetchPartnerNo(user));
        } catch (SQLException ex) {
            Logger.getLogger(mdfServlets.class.getName()).log(Level.SEVERE, null, ex);
        }

        session.setAttribute("Campaigns", result);

//        END OF FETCH
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
