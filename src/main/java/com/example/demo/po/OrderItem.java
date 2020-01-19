package com.example.demo.po;

import java.util.Date;

public class OrderItem {
    private String uuid;

    private String vorderid;

    private Date ddate;

    private Integer vgoodsid;

    private String vgoodstitle;

    private String vspec;

    private String vunit;

    private Integer mprice;

    private Integer mamount;

    private Integer mmoney;

    private String vimage;

    private Integer vsupplierid;

    private String vsuppliertitle;

    private String vuserid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

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

    public Integer getVgoodsid() {
        return vgoodsid;
    }

    public void setVgoodsid(Integer vgoodsid) {
        this.vgoodsid = vgoodsid;
    }

    public String getVgoodstitle() {
        return vgoodstitle;
    }

    public void setVgoodstitle(String vgoodstitle) {
        this.vgoodstitle = vgoodstitle == null ? null : vgoodstitle.trim();
    }

    public String getVspec() {
        return vspec;
    }

    public void setVspec(String vspec) {
        this.vspec = vspec == null ? null : vspec.trim();
    }

    public String getVunit() {
        return vunit;
    }

    public void setVunit(String vunit) {
        this.vunit = vunit == null ? null : vunit.trim();
    }

    public Integer getMprice() {
        return mprice;
    }

    public void setMprice(Integer mprice) {
        this.mprice = mprice;
    }

    public Integer getMamount() {
        return mamount;
    }

    public void setMamount(Integer mamount) {
        this.mamount = mamount;
    }

    public Integer getMmoney() {
        return mmoney;
    }

    public void setMmoney(Integer mmoney) {
        this.mmoney = mmoney;
    }

    public String getVimage() {
        return vimage;
    }

    public void setVimage(String vimage) {
        this.vimage = vimage == null ? null : vimage.trim();
    }

    public Integer getVsupplierid() {
        return vsupplierid;
    }

    public void setVsupplierid(Integer vsupplierid) {
        this.vsupplierid = vsupplierid;
    }

    public String getVsuppliertitle() {
        return vsuppliertitle;
    }

    public void setVsuppliertitle(String vsuppliertitle) {
        this.vsuppliertitle = vsuppliertitle == null ? null : vsuppliertitle.trim();
    }

    public String getVuserid() {
        return vuserid;
    }

    public void setVuserid(String vuserid) {
        this.vuserid = vuserid == null ? null : vuserid.trim();
    }
}