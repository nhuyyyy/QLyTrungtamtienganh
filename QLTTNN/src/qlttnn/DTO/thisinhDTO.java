
package qlttnn.DTO;

import java.util.Date;
import java.util.function.IntBinaryOperator;

public class thisinhDTO {
    private int tsID;
    private String hoten,email,sdt,noisinh,cmnd;
    private Date ngaysinh;

    
    public thisinhDTO(int tsID, String hoten, String email, String sdt, String noisinh, String cmnd, Date ngaysinh) {
        this.tsID = tsID;
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.noisinh = noisinh;
        this.cmnd = cmnd;
        this.ngaysinh = ngaysinh;
    }

    public thisinhDTO() {
    }
    

    public int getTsID() {
        return tsID;
    }

    public void setTsID(int tsID) {
        this.tsID = tsID;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
}
