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
public class FacturaDTO {

    private String ID_factura;
    private String filepath;
    private String additional_information;

    public FacturaDTO(String ID_factura, String filepath, String additional_information) {
        this.ID_factura = ID_factura;
        this.filepath = filepath;
        this.additional_information = additional_information;
    }

    public String getID_factura() {
        return ID_factura;
    }

    public void setID_factura(String ID_factura) {
        this.ID_factura = ID_factura;
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
        return "FacturaDTO{" + "ID_factura=" + ID_factura + ", filepath=" + filepath + ", additional_information=" + additional_information + '}';
    }

}
