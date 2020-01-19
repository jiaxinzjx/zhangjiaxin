package com.example.demo.po;

public class Goods {
    private Integer vgoodsid;

    private String vgoodstitle;

    private String vspec;

    private String vunit;

    private Integer vcategoryid;

    private String vcategorytitle;

    private Integer vsupplierid;

    private String vsuppliertitle;

    private Integer mprices;

    private Integer mpricep;

    private Integer mcost;

    private Integer mlimit;

    private String vstate;

    private String vproperty;

    private String vmemo;

    private String vimage;

    private String vurl;

    private Integer mamount;

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

    public Integer getMprices() {
        return mprices;
    }

    public void setMprices(Integer mprices) {
        this.mprices = mprices;
    }

    public Integer getMpricep() {
        return mpricep;
    }

    public void setMpricep(Integer mpricep) {
        this.mpricep = mpricep;
    }

    public Integer getMcost() {
        return mcost;
    }

    public void setMcost(Integer mcost) {
        this.mcost = mcost;
    }

    public Integer getMlimit() {
        return mlimit;
    }

    public void setMlimit(Integer mlimit) {
        this.mlimit = mlimit;
    }

    public String getVstate() {
        return vstate;
    }

    public void setVstate(String vstate) {
        this.vstate = vstate == null ? null : vstate.trim();
    }

    public String getVproperty() {
        return vproperty;
    }

    public void setVproperty(String vproperty) {
        this.vproperty = vproperty == null ? null : vproperty.trim();
    }

    public String getVmemo() {
        return vmemo;
    }

    public void setVmemo(String vmemo) {
        this.vmemo = vmemo == null ? null : vmemo.trim();
    }

    public String getVimage() {
        return vimage;
    }

    public void setVimage(String vimage) {
        this.vimage = vimage == null ? null : vimage.trim();
    }

    public String getVurl() {
        return vurl;
    }

    public void setVurl(String vurl) {
        this.vurl = vurl == null ? null : vurl.trim();
    }

    public Integer getMamount() {
        return mamount;
    }

    public void setMamount(Integer mamount) {
        this.mamount = mamount;
    }
}