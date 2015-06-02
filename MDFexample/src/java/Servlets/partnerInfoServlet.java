package Servlets;

import DTO.PartnerDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.FetchRequest;
import logic.addPartner;

@WebServlet(name = "partnerInfoServlet", urlPatterns = {"/partnerInfoServlet"})
public class partnerInfoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PartnerDTO partner = null;
        FetchRequest FR = new FetchRequest();
        addPartner view = new addPartner();
        HttpSession session = request.getSession();
        String user = null;

        try {
            user = FR.fetchPartnerNo((String) session.getAttribute("user"));
            partner = view.fetchPartnerInfo(user);
        } catch (SQLException ex) {
            Logger.getLogger(updatePartnerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        session.setAttribute("partnerInfo", partner);

        RequestDispatcher disp = request.getRequestDispatcher("updatePartner.jsp");
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
