package DTO;


public class PartnerDTO {
    String partner_No;
    String username;
    String password;
    String partner_name;
    String partner_mail;
    String partner_phone;
    String partner_address;

    public PartnerDTO(String partner_No, String username) {
        this.partner_No = partner_No;
        this.username = username;
    }
    
    public PartnerDTO(String partner_No, String username, String password) {
        this.partner_No = partner_No;
        this.username = username;
        this.password = password;
    }

    public PartnerDTO(String partner_name, String partner_mail, String partner_phone, String partner_address) {
        this.partner_name = partner_name;
        this.partner_mail = partner_mail;
        this.partner_phone = partner_phone;
        this.partner_address = partner_address;
    }

    public PartnerDTO(String partner_No, String partner_name, String partner_mail, String partner_phone, String partner_address) {
        this.partner_No = partner_No;
        this.partner_name = partner_name;
        this.partner_mail = partner_mail;
        this.partner_phone = partner_phone;
        this.partner_address = partner_address;
    }

    public PartnerDTO(String partner_No, String username, String password, String partner_name, String partner_mail, String partner_phone, String partner_address) {
        this.partner_No = partner_No;
        this.username = username;
        this.password = password;
        this.partner_name = partner_name;
        this.partner_mail = partner_mail;
        this.partner_phone = partner_phone;
        this.partner_address = partner_address;
    }

    public String getPartner_No() {
        return partner_No;
    }

    public void setPartner_No(String partner_No) {
        this.partner_No = partner_No;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
    }

    public String getPartner_mail() {
        return partner_mail;
    }

    public void setPartner_mail(String partner_mail) {
        this.partner_mail = partner_mail;
    }

    public String getPartner_phone() {
        return partner_phone;
    }

    public void setPartner_phone(String partner_phone) {
        this.partner_phone = partner_phone;
    }

    public String getPartner_address() {
        return partner_address;
    }

    public void setPartner_address(String partner_address) {
        this.partner_address = partner_address;
    }

    @Override
    public String toString() {
        return "PartnerDTO{" + "partner_No=" + partner_No + ", username=" + username + ", password=" + password + ", partner_name=" + partner_name + ", partner_mail=" + partner_mail + ", partner_phone=" + partner_phone + ", partner_address=" + partner_address + '}';
    }
    
}
