/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.List;
import qlttnn.DLL.khoathiDLL;
import qlttnn.DTO.khoathiDTO;

public class khoathiBLL {
  public static List<khoathiDTO> ds;

    public void docDuLieu() throws Exception {
      khoathiDLL data = new khoathiDLL();
        if (ds == null) {
            ds = data.docdulieu();
        }
    }

    public int them(khoathiDTO dd) {
        khoathiDLL dao = new khoathiDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }

    public int xoa(int vitri) {
           khoathiDLL dao = new khoathiDLL();
        int rs = dao.xoa(ds.get(vitri).getKhoathiID());
        if (rs == 1) {
            ds.remove(vitri);
        }
        return rs;
    }

    public int sua(int vitri, khoathiDTO dd) {
             khoathiDLL dao = new khoathiDLL();
        int rs = dao.sua(dd);
        if (rs == 1) {
            ds.set(vitri, dd);
        }
        return rs;
    }

    public qlttnn.DTO.khoathiDTO getKhoathi (int khoathi_id) {
        for (khoathiDTO nv : ds) {
            if (nv.getKhoathiID()  == khoathi_id) {
                return nv;
            }
        }
        return null;
    }

    public String remindKhoathiID() {// tự sinh mã
        int max = 0;
        String s = "";
        for (khoathiDTO kh : ds) {
            int id = (kh.getKhoathiID());
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
