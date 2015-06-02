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
public class LoginSystemNew {

    DBDAO connect = new DBDAO();

    public String login(String user, String pass) throws SQLException {
        String result = connect.tryLogin(user, pass);
        return result;

    }
}
