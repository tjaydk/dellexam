/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dennis
 */
public class CampaignDTO {
    private String campaign_No;
    private String campaign_Name;
    private String partner_No;
    private String id_MDF;
    private String id_POE;
    private String id_invoice;
    private String id_factura;
    private String c_Status;

    public CampaignDTO(String campaign_Name, String partner_No) {
        this.campaign_Name = campaign_Name;
        this.partner_No = partner_No;
    }

    public CampaignDTO(String campaign_No, String campaign_Name, String partner_No, String id_MDF, String id_POE, String id_invoice, String id_factura, String c_Status) {
        this.campaign_No = campaign_No;
        this.campaign_Name = campaign_Name;
        this.partner_No = partner_No;
        this.id_MDF = id_MDF;
        this.id_POE = id_POE;
        this.id_invoice = id_invoice;
        this.id_factura = id_factura;
        this.c_Status = c_Status;
    }

    public String getCampaign_No() {
        return campaign_No;
    }

    public void setCampaign_No(String campaign_No) {
        this.campaign_No = campaign_No;
    }

    public String getCampaign_Name() {
        return campaign_Name;
    }

    public void setCampaign_Name(String campaign_Name) {
        this.campaign_Name = campaign_Name;
    }

    public String getPartner_No() {
        return partner_No;
    }

    public void setPartner_No(String partner_No) {
        this.partner_No = partner_No;
    }

    public String getId_MDF() {
        return id_MDF;
    }

    public void setId_MDF(String id_MDF) {
        this.id_MDF = id_MDF;
    }

    public String getId_POE() {
        return id_POE;
    }

    public void setId_POE(String id_POE) {
        this.id_POE = id_POE;
    }

    public String getId_invoice() {
        return id_invoice;
    }

    public void setId_invoice(String id_invoice) {
        this.id_invoice = id_invoice;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public String getC_Status() {
        return c_Status;
    }

    public void setC_Status(String c_Status) {
        this.c_Status = c_Status;
    }

    @Override
    public String toString() {
        return "CampaignDTO{" + "campaign_No=" + campaign_No + ", campaign_Name=" + campaign_Name + ", partner_No=" + partner_No + ", id_MDF=" + id_MDF + ", id_POE=" + id_POE + ", id_invoice=" + id_invoice + ", id_factura=" + id_factura + ", c_Status=" + c_Status + '}';
    }

    public CampaignDTO() {
    }
    
    
}
