/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.MdfDTO;
import java.sql.SQLException;

/**
 *
 * @author Dennis
 */
public class FetchMdfViewNew {

    DBViewDAO connect = new DBViewDAO();

    public MdfDTO fetchMdf(String id_MDF) throws SQLException {
        MdfDTO mdf = connect.selectMdf(id_MDF);
        return mdf;
    }
}
