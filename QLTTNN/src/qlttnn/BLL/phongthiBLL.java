/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.List;
import java.util.Map;
import qlttnn.DLL.phongthiDLL;
import qlttnn.DTO.phongthiDTO;

public class phongthiBLL {

    public static List<phongthiDTO> ds;

    public void docDuLieu() throws Exception {
        phongthiDLL data = new phongthiDLL();
        if (ds == null) {
            ds = data.docdulieu();
        }
    }

    public int them(phongthiDTO dd) {
        phongthiDLL dao = new phongthiDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }

    public int xoa(int vitri) {
        phongthiDLL dao = new phongthiDLL();
        int rs = dao.xoa(ds.get(vitri).getPhongthiID());
        if (rs == 1) {
            ds.remove(vitri);
        }
        return rs;
    }

    public int sua(int vitri, phongthiDTO dd) {
        phongthiDLL dao = new phongthiDLL();
        int rs = dao.sua(dd);
        if (rs == 1) {
            ds.set(vitri, dd);
        }
        return rs;
    }

    public qlttnn.DTO.phongthiDTO getPhongthi(int phongthi_id) {
        for (phongthiDTO nv : ds) {
            if (nv.getPhongthiID() == phongthi_id) {
                return nv;
            }
        }
        return null;
    }

    public String remindThisinhID() {// tự sinh mã
        int max = 0;
        String s = "";
        for (phongthiDTO kh : ds) {
            int id = (kh.getPhongthiID());
            if (id > max) {
                max = id;
            }
        }
        for (int i = 0; i < 3 - String.valueOf(max + 1).length(); i++) {
            s += "0";
        }
        return s + (max + 1);
    }

}
