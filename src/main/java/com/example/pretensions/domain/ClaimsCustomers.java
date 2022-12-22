package com.example.pretensions.domain;

import java.util.Date;

public class ClaimsCustomers {
    private Long id;
    private Long sysn;
    private String kpl;
    private String kpp;
    private Date dt;
    private String stp;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getSysn() {
        return sysn;
    }
    public void setSysn(Long sysn) {
        this.sysn = sysn;
    }
    public String getKpl() {
        return kpl;
    }
    public void setKpl(String kpl) {
        this.kpl = kpl;
    }
    public String getKpp() {
        return kpp;
    }
    public void setKpp(String kpp) {
        this.kpp = kpp;
    }
    public Date getDt() {
        return dt;
    }
    public void setDt(Date dt) {
        this.dt = dt;
    }
    public String getStp() {
        return stp;
    }
    public void setStp(String stp) {
        this.stp = stp;
    }
    @Override
    public String toString() {
        return "ClaimsCustomers [id=" + id + ", sysn=" + sysn + ", kpl=" + kpl + ", kpp=" + kpp + ", dt=" + dt
                + ", stp=" + stp + "]";
    }

    
}
