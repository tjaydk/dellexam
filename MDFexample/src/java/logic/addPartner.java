/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PartnerDTO;
import java.sql.SQLException;

/**
 *
 * @author Ebbe
 */
public class addPartner {
    
    DBDAO connect = new DBDAO();

    public void addPartnerToDatabase(PartnerDTO partner) throws SQLException {
        connect.insertPartnerToDatabase(partner);
    }
    
    public void updatePartner(PartnerDTO partner) throws SQLException {
        connect.updateExistingPartner(partner);
    }
    
    public PartnerDTO fetchPartnerInfo(String user) throws SQLException {
        PartnerDTO partner = connect.selectPartnerInfo(user);
        return partner;
    }
}
