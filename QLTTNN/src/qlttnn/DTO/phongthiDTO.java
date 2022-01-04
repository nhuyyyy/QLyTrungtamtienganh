/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

public class phongthiDTO {
    private int phongthiID,cathiID,khoathiID,soluong;
    private String tenphongthi,trinhdo;

    public phongthiDTO() {
    }

    public phongthiDTO(int phongthiID, int cathiID, int khoathiID, int soluong, String tenphongthi, String trinhdo) {
        this.phongthiID = phongthiID;
        this.cathiID = cathiID;
        this.khoathiID = khoathiID;
        this.soluong = soluong;
        this.tenphongthi = tenphongthi;
        this.trinhdo = trinhdo;
    }

    public int getPhongthiID() {
        return phongthiID;
    }

    public void setPhongthiID(int phongthiID) {
        this.phongthiID = phongthiID;
    }

    public int getCathiID() {
        return cathiID;
    }

    public void setCathiID(int cathiID) {
        this.cathiID = cathiID;
    }

    public int getKhoathiID() {
        return khoathiID;
    }

    public void setKhoathiID(int khoathiID) {
        this.khoathiID = khoathiID;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTenphongthi() {
        return tenphongthi;
    }

    public void setTenphongthi(String tenphongthi) {
        this.tenphongthi = tenphongthi;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

}