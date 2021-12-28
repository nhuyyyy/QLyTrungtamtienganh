/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;


public class sobaodanhDTO {
    private  String sbdID;
    private int tsID;

    public sobaodanhDTO(String sbdID, int tsID) {
        this.sbdID = sbdID;
        this.tsID = tsID;
    }

    public sobaodanhDTO() {
    }

    public String getSbdID() {
        return sbdID;
    }

    public void setSbdID(String sbdID) {
        this.sbdID = sbdID;
    }

    public int getTsID() {
        return tsID;
    }

    public void setTsID(int tsID) {
        this.tsID = tsID;
    }
    
    
}
