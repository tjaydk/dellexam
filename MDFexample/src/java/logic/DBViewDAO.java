/* rvz
 * FACADE DAO TO COMMUNICATE REQUESTS TO DATABASE
 */
package logic;

import DTO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBViewDAO implements DBViewDAOInterface {

    @Override
    public void insertDeclineMDFDescription(String mdf, String desc) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement stmt1 = null;
        ResultSet rs = null;
        String campaign_No = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT CAMPAIGN_NO FROM CAMPAIGN WHERE ID_MDF LIKE " + mdf;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                campaign_No = rs.getString("CAMPAIGN_NO");
            }

            String sql1 = "INSERT INTO DECLINEDESCRIPTION (CAMPAIGN_NO, MDF_DECLINE_DESCRIPTION) VALUES (?,?)";
            stmt1 = con.prepareStatement(sql1);

            stmt1.setString(1, campaign_No);
            stmt1.setString(2, desc);

            stmt1.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt1.close();
            rs.close();
        }
    }

    @Override
    public FacturaDTO selectFactura(String id_factura) throws SQLException {
        FacturaDTO factura = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from FACTURA where ID_FACTURA =" + id_factura;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                factura = new FacturaDTO(
                        rs.getString("id_factura"),
                        rs.getString("filepath"),
                        rs.getString("additional_information")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchPoeViewNew.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return factura;
    }

    @Override
    public InvoiceDTO selectInvoice(String id_invoice) throws SQLException {
        InvoiceDTO invoice = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from INVOICE where ID_INVOICE =" + id_invoice;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                invoice = new InvoiceDTO(
                        rs.getString("id_invoice"),
                        rs.getString("filepath"),
                        rs.getString("additional_information")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchPoeViewNew.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return invoice;
    }

    @Override
    public MdfDTO selectMdf(String id_MDF) throws SQLException {
        MdfDTO mdf = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from mdf where ID_MDF =" + id_MDF;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                mdf = new MdfDTO(
                        rs.getString("ID_MDF"),
                        rs.getString("Submission_date"),
                        rs.getString("Company_address"),
                        rs.getString("Contact_name"),
                        rs.getString("Contact_email"),
                        rs.getString("Company_name"),
                        rs.getString("Contact_phone"),
                        rs.getString("Program_date"),
                        rs.getString("Estimated_attendees"),
                        rs.getString("Start_time"),
                        rs.getString("Venue_name"),
                        rs.getString("End_time"),
                        rs.getString("Venue_address"),
                        rs.getString("face_to_face"),
                        rs.getString("Tradeshows"),
                        rs.getString("Multi_touch_campaign"),
                        rs.getString("Door_opener_campaign"),
                        rs.getString("Third_party_campaign"),
                        rs.getString("Direct_mail"),
                        rs.getString("Blitz_campaign"),
                        rs.getString("description_agenda"),
                        rs.getString("Diss_Storage_1"),
                        rs.getString("Diss_Storage_2"),
                        rs.getString("Diss_Storage_3"),
                        rs.getString("Diss_Storage_4"),
                        rs.getString("Diss_Storage_5"),
                        rs.getString("Diss_Storage_6"),
                        rs.getString("Diss_Server_1"),
                        rs.getString("Diss_Server_2"),
                        rs.getString("Diss_Server_3"),
                        rs.getString("Diss_Server_4"),
                        rs.getString("Diss_Network_1"),
                        rs.getString("Diss_Network_2"),
                        rs.getString("Diss_Solutions_1"),
                        rs.getString("Diss_Solutions_2"),
                        rs.getString("Diss_Solutions_3"),
                        rs.getString("Diss_Solutions_4"),
                        rs.getString("Diss_Solutions_5"),
                        rs.getString("Diss_Solutions_6"),
                        rs.getString("Diss_text"),
                        rs.getString("Target_1"),
                        rs.getString("Target_2"),
                        rs.getString("Target_3"),
                        rs.getString("Additional_totalcost"),
                        rs.getString("Additional_totalmdf"),
                        rs.getString("Additional_reimbursement"),
                        rs.getString("Additional_participating"),
                        rs.getString("Additional_contribution"),
                        rs.getString("Additional_opportunities"),
                        rs.getString("Additional_revenue")
                );

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchRequest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return mdf;
    }

    @Override
    public PoEDTO selectPoe(String id_POE) throws SQLException {
        PoEDTO poe = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from poe where ID_POE =" + id_POE;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                poe = new PoEDTO(
                        rs.getString("ID_POE"),
                        rs.getString("campaign_type"),
                        rs.getString("activity"),
                        rs.getString("poe_date"),
                        rs.getString("recipients"),
                        rs.getString("unique_opens_hits"),
                        rs.getString("unique_clicks"),
                        rs.getString("additional_information"),
                        rs.getString("filepath")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchPoeViewNew.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return poe;
    }

    @Override
    public ArrayList<PartnerDTO> selectCurrentsPartners() throws SQLException {
        ArrayList<PartnerDTO> fcp = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT PARTNER_NO, USERNAME FROM PARTNER";

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                fcp.add(new PartnerDTO(rs.getString("partner_no"), rs.getString("username")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }

        return fcp;
    }
}
