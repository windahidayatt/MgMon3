package com.example.mgmon3;

public class transaksi {
    private String jenis_transaksi;
    private String tanggal_transaksi;
    private String label_transaksi;
    private double jumlah_transaksi;

    public transaksi(String jenis_transaksi, String tanggal_transaksi, String label_transaksi, double jumlah_transaksi) {
        this.jenis_transaksi = jenis_transaksi;
        this.tanggal_transaksi = tanggal_transaksi;
        this.label_transaksi = label_transaksi;
        this.jumlah_transaksi = jumlah_transaksi;
    }

    public String getJenis_transaksi() {
        return jenis_transaksi;
    }

    public void setJenis_transaksi(String jenis_transaksi) {
        this.jenis_transaksi = jenis_transaksi;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public String getLabel_transaksi() {
        return label_transaksi;
    }

    public void setLabel_transaksi(String label_transaksi) {
        this.label_transaksi = label_transaksi;
    }

    public double getJumlah_transaksi() {
        return jumlah_transaksi;
    }

    public void setJumlah_transaksi(double jumlah_transaksi) {
        this.jumlah_transaksi = jumlah_transaksi;
    }
}
