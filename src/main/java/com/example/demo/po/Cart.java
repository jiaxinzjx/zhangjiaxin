package com.example.demo.po;

public class Cart {
    private String vcid;

    private Integer vgoodsid;

    private Integer mamount;

    private Integer msummoney;

    private String vuserid;

    public String getVcid() {
        return vcid;
    }

    public void setVcid(String vcid) {
        this.vcid = vcid == null ? null : vcid.trim();
    }

    public Integer getVgoodsid() {
        return vgoodsid;
    }

    public void setVgoodsid(Integer vgoodsid) {
        this.vgoodsid = vgoodsid;
    }

    public Integer getMamount() {
        return mamount;
    }

    public void setMamount(Integer mamount) {
        this.mamount = mamount;
    }

    public Integer getMsummoney() {
        return msummoney;
    }

    public void setMsummoney(Integer msummoney) {
        this.msummoney = msummoney;
    }

    public String getVuserid() {
        return vuserid;
    }

    public void setVuserid(String vuserid) {
        this.vuserid = vuserid == null ? null : vuserid.trim();
    }
}