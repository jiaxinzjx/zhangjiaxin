package com.example.demo.po;

public class User {
    private String vuserid;

    private String vnickname;

    private String vusername;

    private String vpassword;

    private String vtel;

    private String vaddress;

    private Integer vcorpid;

    private String vcompany;

    private String vidcard;

    public String getVuserid() {
        return vuserid;
    }

    public void setVuserid(String vuserid) {
        this.vuserid = vuserid == null ? null : vuserid.trim();
    }

    public String getVnickname() {
        return vnickname;
    }

    public void setVnickname(String vnickname) {
        this.vnickname = vnickname == null ? null : vnickname.trim();
    }

    public String getVusername() {
        return vusername;
    }

    public void setVusername(String vusername) {
        this.vusername = vusername == null ? null : vusername.trim();
    }

    public String getVpassword() {
        return vpassword;
    }

    public void setVpassword(String vpassword) {
        this.vpassword = vpassword == null ? null : vpassword.trim();
    }

    public String getVtel() {
        return vtel;
    }

    public void setVtel(String vtel) {
        this.vtel = vtel == null ? null : vtel.trim();
    }

    public String getVaddress() {
        return vaddress;
    }

    public void setVaddress(String vaddress) {
        this.vaddress = vaddress == null ? null : vaddress.trim();
    }

    public Integer getVcorpid() {
        return vcorpid;
    }

    public void setVcorpid(Integer vcorpid) {
        this.vcorpid = vcorpid;
    }

    public String getVcompany() {
        return vcompany;
    }

    public void setVcompany(String vcompany) {
        this.vcompany = vcompany == null ? null : vcompany.trim();
    }

    public String getVidcard() {
        return vidcard;
    }

    public void setVidcard(String vidcard) {
        this.vidcard = vidcard == null ? null : vidcard.trim();
    }
}