package com.example.pretensions.domain;

import java.util.Date;

public class ListClaims {
    private Long id;
    private String kmc;
    private Date dtv;
    private Date dtg;
    private String kpr;
    private Long krn;
    private Long kole;
    private String kmg;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getKmc() {
        return kmc;
    }
    public void setKmc(String kmc) {
        this.kmc = kmc;
    }
    public Date getDtv() {
        return dtv;
    }
    public void setDtv(Date dtv) {
        this.dtv = dtv;
    }
    public Date getDtg() {
        return dtg;
    }
    public void setDtg(Date dtg) {
        this.dtg = dtg;
    }
    public String getKpr() {
        return kpr;
    }
    public void setKpr(String kpr) {
        this.kpr = kpr;
    }
    public Long getKrn() {
        return krn;
    }
    public void setKrn(Long krn) {
        this.krn = krn;
    }
    public Long getKole() {
        return kole;
    }
    public void setKole(Long kole) {
        this.kole = kole;
    }
    public String getKmg() {
        return kmg;
    }
    public void setKmg(String kmg) {
        this.kmg = kmg;
    }
    @Override
    public String toString() {
        return "ListClaims [id=" + id + ", kmc=" + kmc + ", dtv=" + dtv + ", dtg=" + dtg + ", kpr=" + kpr + ", krn="
                + krn + ", kole=" + kole + ", kmg=" + kmg + "]";
    }

    
}
