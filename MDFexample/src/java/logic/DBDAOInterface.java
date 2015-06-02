/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import DTO.MdfDTO;
import DTO.PartnerDTO;
import DTO.quarterDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public interface DBDAOInterface {

//    LOGIN
    String tryLogin(String user, String pass) throws SQLException;
    
//    SELECTS
    ResultSet SelectFromDB(String variable, String table) throws SQLException;
    String SelectPartnerNoFromDB(String variable, String table) throws SQLException;
    ArrayList<CampaignDTO> SelectPendingCampaignDB(String variable, String table) throws SQLException;
    ArrayList<CampaignDTO> SelectPendingCampaignForPartnerDB(String variable, String table) throws SQLException;
    ArrayList<quarterDTO> SelectQuartersFromDB() throws SQLException;
    PartnerDTO selectPartnerInfo(String user) throws SQLException;

//    ADD/INSERTS
    void addMdfRequestToDatabase(MdfDTO mdf, CampaignDTO camp, String sub_date, String comp_add, String cont_name, String cont_email, String comp_name, String cont_phone, String prog_date, String estim_att, String start_time, String venue_name, String end_time, String venue_add, String f_to_f, String tradeshows, String mul_touch_camp, String door_opener_camp, String third_party_camp, String direct_mail, String blitz_camp, String decsrip_agenda, String diss_st1, String diss_st2, String diss_st3, String diss_st4, String diss_st5, String diss_st6, String diss_ser1, String diss_ser2, String diss_ser3, String diss_ser4, String diss_net1, String diss_net2, String diss_sol1, String diss_sol2, String diss_sol3, String diss_sol4, String diss_sol5, String diss_sol6, String diss_text, String target1, String target2, String target3, String add_totcost, String add_totmdf, String add_reimbursement, String add_partici, String add_contri, String add_opp, String add_revenue) throws SQLException;
    void insertCampaignToDatabase(String campaign_no, String campaign_name, String partner_no, String id_mdf) throws SQLException;
    void insertDB(String insert) throws SQLException;
    void insertPartnerToDatabase(PartnerDTO partner) throws SQLException;


//    UPDATES
    void updateDB(String updateVarAndTable) throws SQLException;
    void updateExistingPartner(PartnerDTO partner) throws SQLException;
    void updateFactura(String Filepath, String add_info, String Id_factura) throws SQLException;
    void updateInvoiceToDatabase(String Filepath, String add_info, String Id_invoice) throws SQLException;
    void updatePoERequestToDatabase(String campaign_type, String activity, String date, String recipients, String uni_open_hits, String uni_clicks, String add_info, String filepath, String poe_id) throws SQLException;
    
}
