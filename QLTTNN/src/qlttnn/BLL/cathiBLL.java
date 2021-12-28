/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.List;
import qlttnn.DTO.cathiDTO;
import qlttnn.DLL.cathiDLL;
public class cathiBLL {

    public static List<cathiDTO> ds;

    public void docDuLieu() throws Exception {
      cathiDLL data = new cathiDLL();
        if (ds == null) {
            ds = data.docdulieu();
        }
    }

    public int them(cathiDTO dd) {
        cathiDLL dao = new cathiDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }

    public int xoa(int vitri) {
             cathiDLL dao= new cathiDLL();
        int rs = dao.xoa(ds.get(vitri).getCathiID());
        if (rs == 1) {
            ds.remove(vitri);
        }
        return rs;
    }

    public int sua(int vitri, cathiDTO dd) {
           cathiDLL dao= new cathiDLL();
        int rs = dao.sua(dd);
        if (rs == 1) {
            ds.set(vitri, dd);
        }
        return rs;
    }

    public qlttnn.DTO.cathiDTO getCathi (int cathi_id) {
        for (cathiDTO nv : ds) {
            if (nv.getCathiID() == cathi_id) {
                return nv;
            }
        }
        return null;
    }

    public String remindCathiID() {// tự sinh mã
        int max = 0;
        String s = "";
        for (cathiDTO kh : ds) {
            int id = (kh.getCathiID());
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

