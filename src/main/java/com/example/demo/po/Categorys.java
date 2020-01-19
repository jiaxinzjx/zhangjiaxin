package com.example.demo.po;

public class Categorys {
    private Integer vcategoryid;

    private String vcategorytitle;

    private Integer vbigcategoryid;

    private String vbigcategorytitle;

    public Integer getVcategoryid() {
        return vcategoryid;
    }

    public void setVcategoryid(Integer vcategoryid) {
        this.vcategoryid = vcategoryid;
    }

    public String getVcategorytitle() {
        return vcategorytitle;
    }

    public void setVcategorytitle(String vcategorytitle) {
        this.vcategorytitle = vcategorytitle == null ? null : vcategorytitle.trim();
    }

    public Integer getVbigcategoryid() {
        return vbigcategoryid;
    }

    public void setVbigcategoryid(Integer vbigcategoryid) {
        this.vbigcategoryid = vbigcategoryid;
    }

    public String getVbigcategorytitle() {
        return vbigcategorytitle;
    }

    public void setVbigcategorytitle(String vbigcategorytitle) {
        this.vbigcategorytitle = vbigcategorytitle == null ? null : vbigcategorytitle.trim();
    }
}