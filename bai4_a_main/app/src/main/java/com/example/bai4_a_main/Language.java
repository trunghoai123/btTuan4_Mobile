package com.example.bai4_a_main;
public class Language {
    private int id;
    private String name;
    private String shop_name;

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }


    public Language(int id, String name, String shop_name) {
        this.id = id;
        this.name = name;
        this.shop_name = shop_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
