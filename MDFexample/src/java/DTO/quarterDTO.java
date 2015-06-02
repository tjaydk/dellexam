/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Asnorrason
 */
public class quarterDTO {
    
    private String quarter_Name;
    private String quarter_Startdate;
    private String quarter_Enddate;

    public quarterDTO(String quarter_Name, String quarter_Startdate, String quarter_Enddate) {
        this.quarter_Name = quarter_Name;
        this.quarter_Startdate = quarter_Startdate;
        this.quarter_Enddate = quarter_Enddate;
    }

    public String getQuarter_Name() {
        return quarter_Name;
    }

    public void setQuarter_Name(String quarter_Name) {
        this.quarter_Name = quarter_Name;
    }

    public String getQuarter_Startdate() {
        return quarter_Startdate;
    }

    public void setQuarter_Startdate(String quarter_Startdate) {
        this.quarter_Startdate = quarter_Startdate;
    }

    public String getQuarter_Enddate() {
        return quarter_Enddate;
    }

    public void setQuarter_Enddate(String quarter_Enddate) {
        this.quarter_Enddate = quarter_Enddate;
    }

    @Override
    public String toString() {
        return "quarterDTO{" + "quarter_Name=" + quarter_Name + ", quarter_Startdate=" + quarter_Startdate + ", quarter_Enddate=" + quarter_Enddate + '}';
    }

}