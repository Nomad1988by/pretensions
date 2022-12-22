package com.example.pretensions.domain;

public class DirectoryMV {
    private Long id;
    private String kmc;
    private String name;
    
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "DirectoryMV [id=" + id + ", kmc=" + kmc + ", name=" + name + "]";
    }
     
}
