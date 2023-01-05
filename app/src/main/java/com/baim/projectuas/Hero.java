package com.baim.projectuas;

public class Hero {
    private String name;
    private String detail;
    private String type;
    private String tahun;
    private String legal;
    private int photo;
    private int view;

    //    Nama
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    Type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //    Tahun
    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    //    Legal
    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }



    //    Detail
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    //    Photo
    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    // View Photo
    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
