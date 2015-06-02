/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ebbe
 */
public class InvoiceDTO {

    private String ID_invoice;
    private String filepath;
    private String additional_information;

    public InvoiceDTO(String ID_invoice, String filepath, String additional_information) {
        this.ID_invoice = ID_invoice;
        this.filepath = filepath;
        this.additional_information = additional_information;
    }

    public String getID_invoice() {
        return ID_invoice;
    }

    public void setID_invoice(String ID_invoice) {
        this.ID_invoice = ID_invoice;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" + "ID_invoice=" + ID_invoice + ", filepath=" + filepath + ", additional_information=" + additional_information + '}';
    }

}
