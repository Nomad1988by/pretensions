package com.example.pretensions.domain;

public class Lawyers {
    private Long id;
    private String kpl;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Lawyers [id=" + id + ", kpl=" + kpl + ", name=" + name + "]";
    }
    
    
}
