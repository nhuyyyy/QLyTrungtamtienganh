/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

public class phongthiDTO {
    private int phongthiID,cathiID;
    private String tenphongthi;

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

    public String getTenphongthi() {
        return tenphongthi;
    }

    public void setTenphongthi(String tenphongthi) {
        this.tenphongthi = tenphongthi;
    }

    public phongthiDTO(int phongthiID, int cathiID, String tenphongthi) {
        this.phongthiID = phongthiID;
        this.cathiID = cathiID;
        this.tenphongthi = tenphongthi;
    }

    public phongthiDTO() {
    }

}
