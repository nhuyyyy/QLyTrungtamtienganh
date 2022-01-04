/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

import java.util.Date;

public class phieudangkyDTO {
    private int tsid,khoathiID;
    private  String trinhdo;
    private Date ngaydangky;

    public phieudangkyDTO(int tsid, int khoathiID, String trinhdo, Date ngaydangky) {
        this.tsid = tsid;
        this.khoathiID = khoathiID;
        this.trinhdo = trinhdo;
        this.ngaydangky = ngaydangky;
    }

    public phieudangkyDTO() {
    }

    public int getTsid() {
        return tsid;
    }

    public void setTsid(int tsid) {
        this.tsid = tsid;
    }

    public int getKhoathiID() {
        return khoathiID;
    }

    public void setKhoathiID(int khoathiID) {
        this.khoathiID = khoathiID;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public Date getNgaydangky() {
        return ngaydangky;
    }

    public void setNgaydangky(Date ngaydangky) {
        this.ngaydangky = ngaydangky;
    }
    
}
