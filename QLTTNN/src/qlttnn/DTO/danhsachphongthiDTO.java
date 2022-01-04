/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

public class danhsachphongthiDTO {
    private int tsID,phongthiID,stt;
    private float nghe,noi,doc,viet;
    private String sbd;

    public danhsachphongthiDTO() {
    }

    public danhsachphongthiDTO(int tsID, int phongthiID, int stt, float nghe, float noi, float doc, float viet, String sbd) {
        this.tsID = tsID;
        this.phongthiID = phongthiID;
        this.stt = stt;
        this.nghe = nghe;
        this.noi = noi;
        this.doc = doc;
        this.viet = viet;
        this.sbd = sbd;
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

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public float getNghe() {
        return nghe;
    }

    public void setNghe(float nghe) {
        this.nghe = nghe;
    }

    public float getNoi() {
        return noi;
    }

    public void setNoi(float noi) {
        this.noi = noi;
    }

    public float getDoc() {
        return doc;
    }

    public void setDoc(float doc) {
        this.doc = doc;
    }

    public float getViet() {
        return viet;
    }

    public void setViet(float viet) {
        this.viet = viet;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

}