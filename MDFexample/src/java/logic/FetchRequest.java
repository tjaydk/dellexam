/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import logic.DBDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ebbe
 */
public class FetchRequest {

    DBDAO connect = new DBDAO();

    public ArrayList<CampaignDTO> fetchPendingCampaigns() throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        // 
        String variable = "*";
        String table = "CAMPAIGN";
        fpc = connect.SelectPendingCampaignDB(variable, table);
        
        return fpc;
    }

    public ArrayList<CampaignDTO> fetchPendingCampaignsForPartner(String partner) throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        String variable = "*";
        String table = "CAMPAIGN WHERE PARTNER_NO = '" + partner + "'";
        ResultSet rs = null;
        fpc = connect.SelectPendingCampaignForPartnerDB(variable, table);

        return fpc;
    }

    public String fetchPartnerNo(String username) throws SQLException {
        String variable = "partner_no";
        String table = "partner where username = '" + username + "'";
        
        String out = connect.SelectPartnerNoFromDB(variable, table);
        
        return out;
    }
}
