/*
 rvz
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

public class DBDAO implements DBDAOInterface {

    @Override
    public String tryLogin(String user, String pass) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String result = "0";

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT * FROM USERPASS WHERE USERNAME = '" + user + "' AND PASSWORD = '" + pass + "'";

            System.out.println(sql);

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                result = rs.getString(3); //refere til status for login 1(medarbejder) eller 2(partner)
            }

            return result;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }

        return result;

    }

    @Override
    public ResultSet SelectFromDB(String variable, String table) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT " + variable + " FROM " + table;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return rs;
    }

    @Override
    public ArrayList<CampaignDTO> SelectPendingCampaignDB(String variable, String table) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<CampaignDTO> fpc = new ArrayList();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT " + variable + " FROM " + table;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return fpc;
    }

    @Override
    public ArrayList<CampaignDTO> SelectPendingCampaignForPartnerDB(String variable, String table) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<CampaignDTO> fpc = new ArrayList();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT " + variable + " FROM " + table;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return fpc;
    }

    @Override
    public String SelectPartnerNoFromDB(String variable, String table) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String out = "";

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT " + variable + " FROM " + table;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            StringBuilder builder = new StringBuilder();
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 0; i < columnCount; i++) {
                    builder.append(rs.getString(i + 1));
                }
            }

            out = builder.toString();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return out;
    }

    @Override
    public ArrayList<quarterDTO> SelectQuartersFromDB() throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<quarterDTO> fpq = new ArrayList<>();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT * FROM CAMPAIGN";

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                fpq.add(new quarterDTO(
                        rs.getString("quarter_Name"),
                        rs.getString("quarter_Startdate"),
                        rs.getString("quarters_Enddate")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return fpq;
    }

    @Override
    public void updateDB(String updateVarAndTable) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        String update = "UPDATE ";

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            stmt = con.createStatement();

            stmt.executeQuery(update + " " + updateVarAndTable);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    @Override
    public void insertDB(String insert) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        String ii = "INSERT INTO ";

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            stmt = con.createStatement();

            stmt.executeQuery(ii + " " + insert);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    @Override
    public void updateFactura(String Filepath, String add_info, String Id_factura) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE FACTURA SET FILEPATH = ?, ADDITIONAL_INFORMATION = ? WHERE ID_FACTURA = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, Filepath);
            stmt.setString(2, add_info);
            stmt.setString(3, Id_factura);

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    @Override
    public void updateInvoiceToDatabase(String Filepath, String add_info, String Id_invoice) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE INVOICE SET FILEPATH = ?, ADDITIONAL_INFORMATION = ? WHERE ID_INVOICE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, Filepath);
            stmt.setString(2, add_info);
            stmt.setString(3, Id_invoice);

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    @Override
    public void updatePoERequestToDatabase(String campaign_type, String activity, String date, String recipients,
            String uni_open_hits, String uni_clicks, String add_info, String filepath, String poe_id) throws SQLException {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE POE "
                    + "SET campaign_type = ?, activity = ?, POE_date = ?, recipients = ?, unique_opens_hits = ?, "
                    + "unique_clicks = ?, additional_information = ?, filepath = ?"
                    + " WHERE ID_POE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, campaign_type);
            stmt.setString(2, activity);
            stmt.setString(3, date);
            stmt.setString(4, recipients);
            stmt.setString(5, uni_open_hits);
            stmt.setString(6, uni_clicks);
            stmt.setString(7, add_info);
            stmt.setString(8, filepath);
            stmt.setString(9, poe_id);

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

    }

    @Override
    public void insertCampaignToDatabase(String campaign_no, String campaign_name, String partner_no, String id_mdf) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        PreparedStatement stmt4 = null;
        Long id_poe = UUID.randomUUID().getMostSignificantBits();
        Long id_invoice = UUID.randomUUID().getMostSignificantBits();
        Long id_factura = UUID.randomUUID().getMostSignificantBits();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO POE (ID_POE) VALUES (?)";
            String sql2 = "INSERT INTO INVOICE (ID_INVOICE) VALUES (?)";
            String sql3 = "INSERT INTO FACTURA (ID_FACTURA) VALUES (?)";
            String sql4 = "INSERT INTO CAMPAIGN (CAMPAIGN_NO, CAMPAIGN_NAME, PARTNER_NO, ID_MDF, ID_POE, ID_INVOICE, ID_FACTURA, C_STATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            stmt = con.prepareStatement(sql);
            stmt2 = con.prepareStatement(sql2);
            stmt3 = con.prepareStatement(sql3);
            stmt4 = con.prepareStatement(sql4);

            stmt.setString(1, id_poe.toString());

            stmt2.setString(1, id_invoice.toString());

            stmt3.setString(1, id_factura.toString());

            stmt4.setString(1, campaign_no);
            stmt4.setString(2, campaign_name);
            stmt4.setString(3, partner_no);
            stmt4.setString(4, id_mdf);
            stmt4.setString(5, id_poe.toString());
            stmt4.setString(6, id_invoice.toString());
            stmt4.setString(7, id_factura.toString());
            stmt4.setInt(8, 0);

            stmt.executeQuery();
            stmt2.executeQuery();
            stmt3.executeQuery();
            stmt4.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt2.close();
            stmt3.close();
            stmt4.close();
        }
    }

    private ArrayList<String> mdfArrayList() {
        ArrayList al = new ArrayList();
        al.add("ID_MDF");
        al.add("Submission_date");
        al.add("Company_address");
        al.add("Contact_name");
        al.add("Contact_email");
        al.add("Company_name");
        al.add("Contact_phone");
        al.add("Program_date");
        al.add("Estimated_attendees");
        al.add("Start_time");
        al.add("Venue_name");
        al.add("End_time");
        al.add("Venue_address");
        al.add("face_to_face");
        al.add("Tradeshows");
        al.add("Multi_touch_campaign");
        al.add("Door_opener_campaign");
        al.add("Third_party_campaign");
        al.add("Direct_mail");
        al.add("Blitz_campaign");
        al.add("description_agenda");
        al.add("Diss_Storage_1");
        al.add("Diss_Storage_2");
        al.add("Diss_Storage_3");
        al.add("Diss_Storage_4");
        al.add("Diss_Storage_5");
        al.add("Diss_Storage_6");
        al.add("Diss_Server_1");
        al.add("Diss_Server_2");
        al.add("Diss_Server_3");
        al.add("Diss_Server_4");
        al.add("Diss_Network_1");
        al.add("Diss_Network_2");
        al.add("Diss_Solutions_1");
        al.add("Diss_Solutions_2");
        al.add("Diss_Solutions_3");
        al.add("Diss_Solutions_4");
        al.add("Diss_Solutions_5");
        al.add("Diss_Solutions_6");
        al.add("Diss_text");
        al.add("Target_1");
        al.add("Target_2");
        al.add("Target_3");
        al.add("Additional_totalcost");
        al.add("Additional_totalmdf");
        al.add("Additional_reimbursement");
        al.add("Additional_participating");
        al.add("Additional_contribution");
        al.add("Additional_opportunities");
        al.add("Additional_revenue");

        return al;
    }

    @Override
    public void addMdfRequestToDatabase(MdfDTO mdf, CampaignDTO camp, String sub_date,
            String comp_add, String cont_name, String cont_email, String comp_name, String cont_phone,
            String prog_date, String estim_att, String start_time, String venue_name, String end_time,
            String venue_add, String f_to_f, String tradeshows, String mul_touch_camp, String door_opener_camp,
            String third_party_camp, String direct_mail, String blitz_camp, String decsrip_agenda,
            String diss_st1, String diss_st2, String diss_st3, String diss_st4, String diss_st5, String diss_st6,
            String diss_ser1, String diss_ser2, String diss_ser3, String diss_ser4, String diss_net1, String diss_net2,
            String diss_sol1, String diss_sol2, String diss_sol3, String diss_sol4, String diss_sol5, String diss_sol6,
            String diss_text, String target1, String target2, String target3, String add_totcost, String add_totmdf,
            String add_reimbursement, String add_partici, String add_contri, String add_opp, String add_revenue) throws SQLException {

        Connection con = null;
        PreparedStatement stmt = null;

        Long campaign_no = UUID.randomUUID().getMostSignificantBits();
        Long id_mdf = UUID.randomUUID().getMostSignificantBits();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = makeSqlInsertString(mdfArrayList());

            stmt = con.prepareStatement(sql);

            camp.setCampaign_No(campaign_no.toString());
            mdf.setID_MDF(id_mdf.toString());

            stmt.setString(1, id_mdf.toString());
            stmt.setString(2, sub_date);
            stmt.setString(3, comp_add);
            stmt.setString(4, cont_name);
            stmt.setString(5, cont_email);
            stmt.setString(6, comp_name);
            stmt.setString(7, cont_phone);
            stmt.setString(8, prog_date);
            stmt.setString(9, estim_att);
            stmt.setString(10, start_time);
            stmt.setString(11, venue_name);
            stmt.setString(12, end_time);
            stmt.setString(13, venue_add);
            stmt.setString(14, f_to_f);
            stmt.setString(15, tradeshows);
            stmt.setString(16, mul_touch_camp);
            stmt.setString(17, door_opener_camp);
            stmt.setString(18, third_party_camp);
            stmt.setString(19, direct_mail);
            stmt.setString(20, blitz_camp);
            stmt.setString(21, decsrip_agenda);
            stmt.setString(22, diss_st1);
            stmt.setString(23, diss_st2);
            stmt.setString(24, diss_st3);
            stmt.setString(25, diss_st4);
            stmt.setString(26, diss_st5);
            stmt.setString(27, diss_st6);
            stmt.setString(28, diss_ser1);
            stmt.setString(29, diss_ser2);
            stmt.setString(30, diss_ser3);
            stmt.setString(31, diss_ser4);
            stmt.setString(32, diss_net1);
            stmt.setString(33, diss_net2);
            stmt.setString(34, diss_sol1);
            stmt.setString(35, diss_sol2);
            stmt.setString(36, diss_sol3);
            stmt.setString(37, diss_sol4);
            stmt.setString(38, diss_sol5);
            stmt.setString(39, diss_sol6);
            stmt.setString(40, diss_text);
            stmt.setString(41, target1);
            stmt.setString(42, target2);
            stmt.setString(43, target3);
            stmt.setString(44, add_totcost);
            stmt.setString(45, add_totmdf);
            stmt.setString(46, add_reimbursement);
            stmt.setString(47, add_partici);
            stmt.setString(48, add_contri);
            stmt.setString(49, add_opp);
            stmt.setString(50, add_revenue);

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

    }

    private String makeSqlInsertString(ArrayList<String> al) {
        if (al.isEmpty()) {
            return "";
        }
        String sql = "";
        String variable = "";
        String values = "";
        for (String s : al) {
            variable += s + ",";
            values += "?,";
        }
        if (variable.length() > 0 && variable.charAt(variable.length() - 1) == ',') {
            variable = variable.substring(0, variable.length() - 1);
        }
        if (values.length() > 0 && values.charAt(values.length() - 1) == ',') {
            values = values.substring(0, values.length() - 1);
        }
        sql = "INSERT INTO MDF (" + variable + ") VALUES (" + values + ")";
        return sql;
    }

    @Override
    public void insertPartnerToDatabase(PartnerDTO partner) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO USERPASS (USERNAME, PASSWORD, USERTYPE) VALUES (?, ?, ?)";
            String sql2 = "INSERT INTO PARTNER (PARTNER_NO, USERNAME) VALUES (?, ?)";

            stmt = con.prepareStatement(sql);
            stmt2 = con.prepareStatement(sql2);

            stmt.setString(1, partner.getUsername());
            stmt.setString(2, partner.getPassword());
            stmt.setInt(3, 2);
            stmt2.setString(1, partner.getPartner_No());
            stmt2.setString(2, partner.getUsername());

            stmt.executeQuery();
            stmt2.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt2.close();
        }
    }

    @Override
    public void updateExistingPartner(PartnerDTO partner) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE PARTNER "
                    + "SET PARTNER_NAME = ?, PARTNER_MAIL = ?, PARTNER_PHONE = ?, PARTNER_ADDRESS = ?"
                    + " WHERE PARTNER_NO = ?";

            stmt = con.prepareStatement(sql);

            stmt.setString(1, partner.getPartner_name());
            stmt.setString(2, partner.getPartner_mail());
            stmt.setString(3, partner.getPartner_phone());
            stmt.setString(4, partner.getPartner_address());
            stmt.setString(5, partner.getPartner_No());

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    @Override
    public PartnerDTO selectPartnerInfo(String user) throws SQLException {
        PartnerDTO partner = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from PARTNER where PARTNER_NO = '" + user + "'";

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                partner = new PartnerDTO(
                        rs.getString("PARTNER_NAME"),
                        rs.getString("PARTNER_MAIL"),
                        rs.getString("PARTNER_PHONE"),
                        rs.getString("PARTNER_ADDRESS")
                );
            }
        } catch (ClassNotFoundException ex) {
            
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return partner;
    }
}
