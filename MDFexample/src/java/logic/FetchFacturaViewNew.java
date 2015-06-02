/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.FacturaDTO;
import java.sql.SQLException;

/**
 *
 * @author Dennis
 */
public class FetchFacturaViewNew {

    DBViewDAO connect = new DBViewDAO();

    public FacturaDTO fetchFactura(String id_factura) throws SQLException {

        FacturaDTO FD = connect.selectFactura(id_factura);
        return FD;
    }
}
