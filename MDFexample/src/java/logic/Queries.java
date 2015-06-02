/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class Queries {

    DBDAO connect = new DBDAO();

    public void addMdfRequestToDatabase(MdfDTO mdf, CampaignDTO camp) throws SQLException {
        CampaignDTO camp2 = new CampaignDTO();
        MdfDTO mdf2 = new MdfDTO();

        camp2 = camp;
        mdf2 = mdf;

        String sub_date = mdf.getSubmission_date();
        String comp_add = mdf.getCompany_address();
        String cont_name = mdf.getContact_name();
        String cont_email = mdf.getContact_email();
        String comp_name = mdf.getCompany_name();
        String cont_phone = mdf.getContact_phone();
        String prog_date = mdf.getProgram_date();
        String estim_att = mdf.getEstimated_attendees();
        String start_time = mdf.getStart_time();
        String venue_name = mdf.getVenue_name();
        String end_time = mdf.getEnd_time();
        String venue_add = mdf.getVenue_address();
        String f_tof = mdf.getFace_to_face();
        String tradeshows = mdf.getTradeshows();
        String mul_touch_camp = mdf.getMulti_touch_campaign();
        String door_op = mdf.getDoor_opener_campaign();
        String third_part = mdf.getThird_party_campaign();
        String direct_mail = mdf.getDirect_mail();
        String blitz_camp = mdf.getBlitz_campaign();
        String desc_agenda = mdf.getDescription_agenda();
        String d_st1 = mdf.getDiss_Storage_1();
        String d_st2 = mdf.getDiss_Storage_2();
        String d_st3 = mdf.getDiss_Storage_3();
        String d_st4 = mdf.getDiss_Storage_4();
        String d_st5 = mdf.getDiss_Storage_5();
        String d_st6 = mdf.getDiss_Storage_6();
        String d_ser1 = mdf.getDiss_Server_1();
        String d_ser2 = mdf.getDiss_Server_2();
        String d_ser3 = mdf.getDiss_Server_3();
        String d_ser4 = mdf.getDiss_Server_4();
        String d_net1 = mdf.getDiss_Network_1();
        String d_net2 = mdf.getDiss_Network_2();
        String d_sol1 = mdf.getDiss_Solutions_1();
        String d_sol2 = mdf.getDiss_Solutions_2();
        String d_sol3 = mdf.getDiss_Solutions_3();
        String d_sol4 = mdf.getDiss_Solutions_4();
        String d_sol5 = mdf.getDiss_Solutions_5();
        String d_sol6 = mdf.getDiss_Solutions_6();
        String d_text = mdf.getDiss_text();
        String target1 = mdf.getTarget_1();
        String target2 = mdf.getTarget_2();
        String target3 = mdf.getTarget_3();
        String add_totcost = mdf.getAdditional_totalcost();
        String add_totmdf = mdf.getAdditional_totalmdf();
        String add_reimburst = mdf.getAdditional_reimbursement();
        String add_part = mdf.getAdditional_participating();
        String add_contri = mdf.getAdditional_contribution();
        String add_opp = mdf.getAdditional_opportunities();
        String add_revenue = mdf.getAdditional_revenue();

        connect.addMdfRequestToDatabase(mdf, camp, sub_date, comp_add, cont_name, cont_email, comp_name, cont_phone, prog_date, estim_att, start_time, venue_name, end_time, venue_add, f_tof, tradeshows, mul_touch_camp, door_op, third_part, direct_mail, blitz_camp, desc_agenda, d_st1, d_st2, d_st3, d_st4, d_st5, d_st6, d_ser1, d_ser2, d_ser3, d_ser4, d_net1, d_net2, d_sol1, d_sol2, d_sol3, d_sol4, d_sol5, d_sol6, d_text, target1, target2, target3, add_totcost, add_totmdf, add_reimburst, add_part, add_contri, add_opp, add_revenue);
    }

    public void addCampaignToDatabase(MdfDTO mdf, CampaignDTO camp) throws SQLException {

        String camp_no = camp.getCampaign_No();
        String camp_name = camp.getCampaign_Name();
        String partner_no = camp.getPartner_No();
        String id_mdf = mdf.getID_MDF();

        connect.insertCampaignToDatabase(camp_no, camp_name, partner_no, id_mdf);
    }

    public void addPoERequestToDatabase(PoEDTO poe) throws SQLException {

        String camp_type = poe.getCampaign_type();
        String activity = poe.getActivity();
        String date = poe.getDate();
        String recipients = poe.getRecipients();
        String Uni_open_hits = poe.getUnique_opens_hits();
        String Uni_clicks = poe.getUnique_clicks();
        String add_info = poe.getAdditional_information();
        String filepath = poe.getFilepath();
        String poe_id = poe.getPoe_ID();

        connect.updatePoERequestToDatabase(camp_type, activity, date,
                recipients, Uni_open_hits, Uni_clicks, add_info, filepath, poe_id);
    }

    public void addInvoiceToDatabase(InvoiceDTO invoice) throws SQLException {

        String filepath = invoice.getFilepath();
        String add_info = invoice.getAdditional_information();
        String Id_invoice = invoice.getID_invoice();

        connect.updateInvoiceToDatabase(filepath, add_info, Id_invoice);
    }

    public void addFacturaToDatabase(FacturaDTO factura) throws SQLException {

        String filepath = factura.getFilepath();
        String add_info = factura.getAdditional_information();
        String Id_factura = factura.getID_factura();

        connect.updateFactura(filepath, add_info, Id_factura);
    }

//    public void addCampaignToDatabase(MdfDTO mdf, CampaignDTO camp) throws SQLException {
//        Connection con = null;
//        PreparedStatement stmt = null;
//        PreparedStatement stmt2 = null;
//        PreparedStatement stmt3 = null;
//        PreparedStatement stmt4 = null;
//        Long id_poe = UUID.randomUUID().getMostSignificantBits();
//        Long id_invoice = UUID.randomUUID().getMostSignificantBits();
//        Long id_factura = UUID.randomUUID().getMostSignificantBits();
//
//        try {
//            Class.forName(DB.driver);
//            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);
//
//            String sql = "INSERT INTO POE (ID_POE) VALUES (?)";
//            String sql2 = "INSERT INTO INVOICE (ID_INVOICE) VALUES (?)";
//            String sql3 = "INSERT INTO FACTURA (ID_FACTURA) VALUES (?)";
//            String sql4 = "INSERT INTO CAMPAIGN (CAMPAIGN_NO, CAMPAIGN_NAME, PARTNER_NO, ID_MDF, ID_POE, ID_INVOICE, ID_FACTURA, C_STATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//
//            stmt = con.prepareStatement(sql);
//            stmt2 = con.prepareStatement(sql2);
//            stmt3 = con.prepareStatement(sql3);
//            stmt4 = con.prepareStatement(sql4);
//
//            stmt.setString(1, id_poe.toString());
//
//            stmt2.setString(1, id_invoice.toString());
//
//            stmt3.setString(1, id_factura.toString());
//
//            stmt4.setString(1, camp.getCampaign_No());
//            stmt4.setString(2, camp.getCampaign_Name());
//            stmt4.setString(3, camp.getPartner_No());
//            stmt4.setString(4, mdf.getID_MDF());
//            stmt4.setString(5, id_poe.toString());
//            stmt4.setString(6, id_invoice.toString());
//            stmt4.setString(7, id_factura.toString());
//            stmt4.setInt(8, 0);
//
//            stmt.executeQuery();
//            stmt2.executeQuery();
//            stmt3.executeQuery();
//            stmt4.executeQuery();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            con.close();
//            stmt.close();
//            stmt2.close();
//            stmt3.close();
//            stmt4.close();
//        }
//    }
//
//    public void addPoERequestToDatabase(PoEDTO poe) throws SQLException {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            Class.forName(DB.driver);
//            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);
//
//            String sql = "UPDATE POE "
//                    + "SET campaign_type = ?, activity = ?, POE_date = ?, recipients = ?, unique_opens_hits = ?, "
//                    + "unique_clicks = ?, additional_information = ?, filepath = ?"
//                    + " WHERE ID_POE = ?";
//            stmt = con.prepareStatement(sql);
//
//            stmt.setString(1, poe.getCampaign_type());
//            stmt.setString(2, poe.getActivity());
//            stmt.setString(3, poe.getDate());
//            stmt.setString(4, poe.getRecipients());
//            stmt.setString(5, poe.getUnique_opens_hits());
//            stmt.setString(6, poe.getUnique_clicks());
//            stmt.setString(7, poe.getAdditional_information());
//            stmt.setString(8, poe.getFilepath());
//            stmt.setString(9, poe.getPoe_ID());
//
//            stmt.executeQuery();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            con.close();
//            stmt.close();
//        }
//
//    }
//
//    public void addInvoiceToDatabase(InvoiceDTO invoice) throws SQLException {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            Class.forName(DB.driver);
//            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);
//
//            String sql = "UPDATE INVOICE "
//                    + "SET FILEPATH = ?, ADDITIONAL_INFORMATION = ?"
//                    + " WHERE ID_INVOICE = ?";
//            stmt = con.prepareStatement(sql);
//
//            stmt.setString(1, invoice.getFilepath());
//            stmt.setString(2, invoice.getAdditional_information());
//            stmt.setString(3, invoice.getID_invoice());
//
//            stmt.executeQuery();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            con.close();
//            stmt.close();
//        }
//    }
//
//    public void addFacturaToDatabase(FacturaDTO factura) throws SQLException {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            Class.forName(DB.driver);
//            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);
//
//            String sql = "UPDATE FACTURA "
//                    + "SET FILEPATH = ?, ADDITIONAL_INFORMATION = ?"
//                    + " WHERE ID_FACTURA = ?";
//            stmt = con.prepareStatement(sql);
//
//            stmt.setString(1, factura.getFilepath());
//            stmt.setString(2, factura.getAdditional_information());
//            stmt.setString(3, factura.getID_factura());
//
//            stmt.executeQuery();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            con.close();
//            stmt.close();
//        }
//    }
    public ArrayList<CampaignDTO> fetchPendingCampaigns(String partner) throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        String variable = "*";
        String table = "CAMPAIGN";
        fpc = connect.SelectPendingCampaignForPartnerDB(variable, table);

        return fpc;
    }

    public ArrayList<quarterDTO> fetchQuarters() throws SQLException {

        ArrayList<quarterDTO> fpq = new ArrayList<>();

        fpq = connect.SelectQuartersFromDB();

        return fpq;
    }

}
