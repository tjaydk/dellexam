/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.FacturaDTO;
import DTO.InvoiceDTO;
import DTO.MdfDTO;
import DTO.PartnerDTO;
import DTO.PoEDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public interface DBViewDAOInterface {


//    SELECTS
    ArrayList<PartnerDTO> selectCurrentsPartners() throws SQLException;
    FacturaDTO selectFactura(String id_factura) throws SQLException;
    InvoiceDTO selectInvoice(String id_invoice) throws SQLException;
    MdfDTO selectMdf(String id_MDF) throws SQLException;
    PoEDTO selectPoe(String id_POE) throws SQLException;
    
//    MISC
    void insertDeclineMDFDescription(String mdf, String desc) throws SQLException;
}
