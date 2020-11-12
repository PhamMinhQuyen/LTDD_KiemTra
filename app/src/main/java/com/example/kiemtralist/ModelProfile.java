package com.example.kiemtralist;

public class ModelProfile {


    int id;
    String sdt,diachi;

    public ModelProfile(){}

    public ModelProfile(int id, String sdt, String diachi) {
        this.id = id;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
