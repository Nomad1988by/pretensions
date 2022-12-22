package com.example.pretensions.domain;

public class Shops {
    private Long id;
    private String kpl;
    private String kpp;
    private String name;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Shops [id=" + id + ", kpl=" + kpl + ", kpp=" + kpp + ", name=" + name + "]";
    }
    
}
