/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.SQLException;

/**
 *
 * @author Dennis
 */
public class DeclineDescriptionAdderNew {

    DBViewDAO connect = new DBViewDAO();

    public void addDeclineMDFDescription(String mdf, String desc) throws SQLException {
        connect.insertDeclineMDFDescription(mdf, desc);
    }
}
