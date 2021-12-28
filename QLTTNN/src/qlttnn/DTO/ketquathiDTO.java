/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DTO;

public class ketquathiDTO {
    private int kqthiID,tsIS;
    private float doc,nghe,noi,viet,trungbinh;
    private String xeploai;

    public int getTsIS() {
        return tsIS;
    }

    public void setTsIS(int tsIS) {
        this.tsIS = tsIS;
    }

    public ketquathiDTO(int kqthiID, int tsIS, float doc, float nghe, float noi, float viet, float trungbinh, String xeploai) {
        this.kqthiID = kqthiID;
        this.tsIS = tsIS;
        this.doc = doc;
        this.nghe = nghe;
        this.noi = noi;
        this.viet = viet;
        this.trungbinh = trungbinh;
        this.xeploai = xeploai;
    }

    public ketquathiDTO() {
    }


    public int getKqthiID() {
        return kqthiID;
    }

    public void setKqthiID(int kqthiID) {
        this.kqthiID = kqthiID;
    }

    public float getDoc() {
        return doc;
    }

    public void setDoc(float doc) {
        this.doc = doc;
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

    public float getViet() {
        return viet;
    }

    public void setViet(float viet) {
        this.viet = viet;
    }

    public float getTrungbinh() {
        return trungbinh;
    }

    public void setTrungbinh(float trungbinh) {
        this.trungbinh = trungbinh;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }
    
}
