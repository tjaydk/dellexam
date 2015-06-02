/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import DTO.CampaignDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.DB;
import logic.Queries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennis
 */
public class campaignTest {

    public campaignTest() {
    }

    @Before
    public void setUp() throws SQLException {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        Statement stmt2 = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO USERPASS VALUES ('JUnitUser', 'JUnitUser', 'JUnitTest')";
            String sql1 = "INSERT INTO PARTNER VALUES ('JUnitNo', 'JUnitUser', 'JUnitName', 'JUnitMail', 'JUnitNumber', 'JUnitAddress')";
            String sql2 = "INSERT INTO MDF (ID_MDF) VALUES (10000)";

            stmt = con.createStatement();
            stmt.executeQuery(sql);

            stmt1 = con.createStatement();
            stmt1.executeQuery(sql1);

            stmt2 = con.createStatement();
            stmt2.executeQuery(sql2);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt1.close();
            stmt2.close();
        }

    }

    @Test
    public void testCreateCampaign() throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        Statement stmt3 = null;
        ResultSet rs = null;

        CampaignDTO camp = new CampaignDTO("10000", "JUnitCampName", "JUnitNo", "10000", "11111", "22", "22", "0");

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO POE (ID_POE) VALUES (?)";
            String sql2 = "INSERT INTO CAMPAIGN (CAMPAIGN_NO, CAMPAIGN_NAME, PARTNER_NO, ID_MDF, ID_POE, C_STATUS) VALUES (?, ?, ?, ?, ?, ?)";

            stmt = con.prepareStatement(sql);
            stmt2 = con.prepareStatement(sql2);

            stmt.setString(1, "11111");

            stmt2.setString(1, camp.getCampaign_No());
            stmt2.setString(2, camp.getCampaign_Name());
            stmt2.setString(3, camp.getPartner_No());
            stmt2.setString(4, camp.getId_MDF());
            stmt2.setString(5, camp.getId_POE());
            stmt2.setInt(6, 0);

            stmt.executeQuery();
            stmt2.executeQuery();

            String testSql = "SELECT * FROM CAMPAIGN WHERE CAMPAIGN_NO LIKE 'JUnitCampNo'";

            stmt3 = con.createStatement();

            rs = stmt3.executeQuery(testSql);

            while (rs.next()) {
                assertTrue(rs.getString("CAMPAIGN_NO").equals(camp.getCampaign_No()));
                assertTrue(rs.getString("CAMPAIGN_NAME").equals(camp.getCampaign_Name()));
                assertTrue(rs.getString("PARTNER_NO").equals(camp.getPartner_No()));
                assertTrue(rs.getString("ID_MDF").equals(camp.getId_MDF()));
                assertTrue(rs.getString("ID_POE").equals(camp.getId_POE()));
                assertTrue(rs.getString("C_STATUS").equals(camp.getC_Status()));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt2.close();
            stmt3.close();
            rs.close();
        }

    }

    @After
    public void tearDown() throws SQLException {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        Statement stmt3 = null;
        Statement stmt4 = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "DELETE FROM CAMPAIGN WHERE CAMPAIGN_NO LIKE '10000'";
            String sql1 = "DELETE FROM POE WHERE ID_POE LIKE 11111";
            String sql2 = "DELETE FROM MDF WHERE ID_MDF LIKE 10000";
            String sql3 = "DELETE FROM PARTNER WHERE PARTNER_NO LIKE 'JUnitNo'";
            String sql4 = "DELETE FROM USERPASS WHERE USERNAME LIKE 'JUnitUser'";

            stmt = con.createStatement();
            stmt.executeQuery(sql);

            stmt1 = con.createStatement();
            stmt1.executeQuery(sql1);

            stmt2 = con.createStatement();
            stmt2.executeQuery(sql2);

            stmt3 = con.createStatement();
            stmt3.executeQuery(sql3);

            stmt4 = con.createStatement();
            stmt4.executeQuery(sql4);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt1.close();
            stmt2.close();
            stmt3.close();
            stmt4.close();
        }

    }

}
