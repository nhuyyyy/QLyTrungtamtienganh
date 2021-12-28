/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

public class cathiDTO {
    private int cathiID;
    private String giothi;

    public cathiDTO(int cathiID, String giothi) {
        this.cathiID = cathiID;
        this.giothi = giothi;
    }

    public cathiDTO() {
    }

    public int getCathiID() {
        return cathiID;
    }

    public void setCathiID(int cathiID) {
        this.cathiID = cathiID;
    }

    public String getGiothi() {
        return giothi;
    }

    public void setGiothi(String giothi) {
        this.giothi = giothi;
    }
    
}
