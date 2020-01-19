package com.example.demo.po;

import java.util.Date;

public class Order {
    private String vorderid;

    private Date ddate;

    private Integer vcorpid;

    private String vcorptitle;

    private Integer msummoney;

    private Integer mpredec;

    private Integer msumnet;

    private Integer dpaytime;

    private String vstate;

    private String vuserid;

    private String vtype;

    private String vname;

    private String vtel;

    private String vaddress;

    public String getVorderid() {
        return vorderid;
    }

    public void setVorderid(String vorderid) {
        this.vorderid = vorderid == null ? null : vorderid.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public Integer getVcorpid() {
        return vcorpid;
    }

    public void setVcorpid(Integer vcorpid) {
        this.vcorpid = vcorpid;
    }

    public String getVcorptitle() {
        return vcorptitle;
    }

    public void setVcorptitle(String vcorptitle) {
        this.vcorptitle = vcorptitle == null ? null : vcorptitle.trim();
    }

    public Integer getMsummoney() {
        return msummoney;
    }

    public void setMsummoney(Integer msummoney) {
        this.msummoney = msummoney;
    }

    public Integer getMpredec() {
        return mpredec;
    }

    public void setMpredec(Integer mpredec) {
        this.mpredec = mpredec;
    }

    public Integer getMsumnet() {
        return msumnet;
    }

    public void setMsumnet(Integer msumnet) {
        this.msumnet = msumnet;
    }

    public Integer getDpaytime() {
        return dpaytime;
    }

    public void setDpaytime(Integer dpaytime) {
        this.dpaytime = dpaytime;
    }

    public String getVstate() {
        return vstate;
    }

    public void setVstate(String vstate) {
        this.vstate = vstate == null ? null : vstate.trim();
    }

    public String getVuserid() {
        return vuserid;
    }

    public void setVuserid(String vuserid) {
        this.vuserid = vuserid == null ? null : vuserid.trim();
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype == null ? null : vtype.trim();
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
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
}