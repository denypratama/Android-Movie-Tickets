package com.example.UasAndroidDenyLaduni.Model;

public class Order {
    String orderId;
    String namaBioskop;
    String namaFilm;
    String jamTayang;
    String pilihanMakanan;
    String namaPembeli;


    public Order(String bioskop, String jam, String film, String makanan, String nama, String id){

    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getNamaBioskop() {
        return namaBioskop;
    }

    public void setNamaBioskop(String namaBioskop) {
        this.namaBioskop = namaBioskop;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

    public String getPilihanMakanan() {
        return pilihanMakanan;
    }

    public void setPilihanMakanan(String pilihanMakanan) {
        this.pilihanMakanan = pilihanMakanan;
    }
}
