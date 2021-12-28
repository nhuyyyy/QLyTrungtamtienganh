/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

public class danhsachphongthiDTO {
    private int tsID,phongthiID;

    public danhsachphongthiDTO() {
    }

    public danhsachphongthiDTO(int tsID, int phongthiID) {
        this.tsID = tsID;
        this.phongthiID = phongthiID;
    }

    public int getTsID() {
        return tsID;
    }

    public void setTsID(int tsID) {
        this.tsID = tsID;
    }

    public int getPhongthiID() {
        return phongthiID;
    }

    public void setPhongthiID(int phongthiID) {
        this.phongthiID = phongthiID;
    }
    
    
    
}
