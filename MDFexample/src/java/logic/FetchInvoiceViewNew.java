/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.InvoiceDTO;
import java.sql.SQLException;

/**
 *
 * @author Dennis
 */
public class FetchInvoiceViewNew {

    DBViewDAO connect = new DBViewDAO();

    public InvoiceDTO fetchInvoice(String id_invoice) throws SQLException {
        InvoiceDTO invoice = connect.selectInvoice(id_invoice);
        return invoice;
    }
}
