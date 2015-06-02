/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PartnerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class NewFetchPartners {
    DBViewDAO connect = new DBViewDAO();
    public ArrayList<PartnerDTO> fetchCurrentsPartners() throws SQLException {
        ArrayList<PartnerDTO> fcp = connect.selectCurrentsPartners();
        return fcp;
    }
}
