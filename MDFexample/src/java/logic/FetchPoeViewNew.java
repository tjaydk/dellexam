/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PoEDTO;
import java.sql.SQLException;

/**
 *
 * @author Dennis
 */
public class FetchPoeViewNew {
    
    DBViewDAO connect = new DBViewDAO();
    public PoEDTO fetchPoe(String id_POE) throws SQLException {
        PoEDTO poe = connect.selectPoe(id_POE);
        return poe;
    }
}
