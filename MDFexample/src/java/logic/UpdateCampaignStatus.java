/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.SQLException;

/**
 *
 * @author Ebbe
 */
public class UpdateCampaignStatus {

    DBDAO connect = new DBDAO();
    private String upd;
    
    public void updateCampaignStatusAfterMdf(String id_MDF) throws SQLException {
        
            upd = "CAMPAIGN SET C_STATUS = 1 WHERE ID_MDF =" + id_MDF;
            connect.updateDB(upd);
    }

    public void updateCampaignStatusAfterMdfDecline(String id_MDF) throws SQLException {
        
            upd = "CAMPAIGN SET C_STATUS = 7 WHERE ID_MDF =" + id_MDF;
            connect.updateDB(upd);
            
    }

    public void updateCampaignStatusAfterPoeUpload(String id_POE) throws SQLException {
        
            upd = "CAMPAIGN SET C_STATUS = 2 WHERE ID_POE =" + id_POE;
            connect.updateDB(upd);
            
    }
     public void updateCampaignStatusAfterPoeDecline(String id_POE) throws SQLException {
            upd = "CAMPAIGN SET C_STATUS = 1 WHERE ID_POE =" + id_POE;
            connect.updateDB(upd);
            
    }
    

    public void updateCampaignStatusAfterPoe(String id_POE) throws SQLException {
            upd = "CAMPAIGN SET C_STATUS = 3 WHERE ID_POE =" + id_POE;
            connect.updateDB(upd);

    }

    public void updateCampaignStatusAfterInvoiceUpload(String id_invoice) throws SQLException {
            upd = "CAMPAIGN SET C_STATUS = 4 WHERE ID_INVOICE =" + id_invoice;
            connect.updateDB(upd);
            
    }

    public void updateCampaignStatusAfterInvoice(String id_invoice) throws SQLException {
            upd = "CAMPAIGN SET C_STATUS = 5 WHERE ID_INVOICE =" + id_invoice;
            connect.updateDB(upd);
            
    }

    public void updateCampaignStatusAfterFacturaUpload(String id_factura) throws SQLException {
            upd = "CAMPAIGN SET C_STATUS = 6 WHERE ID_FACTURA =" + id_factura;
            connect.updateDB(upd);
            
    }

}