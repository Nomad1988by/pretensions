package com.example.pretensions.domain;

public class DirectoryPP {
    private Long id;
    private String kpr;
    private String name;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getKpr() {
        return kpr;
    }
    public void setKpr(String kpr) {
        this.kpr = kpr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "DirectoryPP [id=" + id + ", kpr=" + kpr + ", name=" + name + "]";
    }
    
}
