/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import DTO.FacturaDTO;
import DTO.InvoiceDTO;
import DTO.MdfDTO;
import DTO.PartnerDTO;
import DTO.PoEDTO;
import DTO.quarterDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public interface ControlDAOInterface {
    
//    LOGIN
    String login(String user, String pass) throws SQLException;
    
//    FETCH DATA FROM DB
    FacturaDTO fetchFactura(String id_factura);
    InvoiceDTO fetchInvoice(String id_invoice);
    MdfDTO fetchMdf(String id_MDF);
    PoEDTO fetchPoe(String id_POE);
    String fetchPartnerNo(String username) throws SQLException;
    ArrayList<PartnerDTO> fetchCurrentsPartners();
    ArrayList<CampaignDTO> fetchPendingCampaigns() throws SQLException;
    ArrayList<CampaignDTO> fetchPendingCampaignsForPartner(String partner) throws SQLException;
    ArrayList<CampaignDTO> fetchPendingCampaigns(String partner) throws SQLException;
    ArrayList<quarterDTO> fetchQuarters() throws SQLException;
    
//    ADD DATA TO DB
    void addMdfRequestToDatabase(MdfDTO mdf, CampaignDTO camp);
    void addCampaignToDatabase(MdfDTO mdf, CampaignDTO camp);
    void addPoERequestToDatabase(PoEDTO poe);
    void addInvoiceToDatabase(InvoiceDTO invoice);
    void addFacturaToDatabase(FacturaDTO factura);
    
//    UPDATE STATUS
    void updateCampaignStatusAfterMdf(String id_MDF) throws SQLException;
    void updateCampaignStatusAfterMdfDecline(String id_MDF) throws SQLException;
    void updateCampaignStatusAfterPoeUpload(String id_POE) throws SQLException;
    void updateCampaignStatusAfterPoeDecline(String id_POE) throws SQLException;
    void updateCampaignStatusAfterPoe(String id_POE) throws SQLException;
    void updateCampaignStatusAfterInvoiceUpload(String id_invoice) throws SQLException;
    void updateCampaignStatusAfterInvoice(String id_invoice) throws SQLException;
    void updateCampaignStatusAfterFacturaUpload(String id_factura) throws SQLException;
    
//    ADD DECLINE NOTES
    void addDeclineMDFDescription(String mdf, String desc);
    
    
}
