/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

import java.util.Date;


public class khoathiDTO {
    private int khoathiID;
    private String tenkhoathi;
    private Date ngaythi;

    public khoathiDTO(int khoathiID, String tenkhoathi, Date ngaythi) {
        this.khoathiID = khoathiID;
        this.tenkhoathi = tenkhoathi;
        this.ngaythi = ngaythi;
    }

    public khoathiDTO() {
    }

    public int getKhoathiID() {
        return khoathiID;
    }

    public void setKhoathiID(int khoathiID) {
        this.khoathiID = khoathiID;
    }

    public String getTenkhoathi() {
        return tenkhoathi;
    }

    public void setTenkhoathi(String tenkhoathi) {
        this.tenkhoathi = tenkhoathi;
    }

    public Date getNgaythi() {
        return ngaythi;
    }

    public void setNgaythi(Date ngaythi) {
        this.ngaythi = ngaythi;
    }
    
}
