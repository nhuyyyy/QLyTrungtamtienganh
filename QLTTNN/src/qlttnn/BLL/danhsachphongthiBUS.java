/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.ArrayList;
import java.util.List;
import qlttnn.DLL.dachsachphongthiDLL;
import qlttnn.DTO.danhsachphongthiDTO;

public class danhsachphongthiBUS {
  public static List<danhsachphongthiDTO> ds;

    public void docDuLieu() throws Exception {
      dachsachphongthiDLL dao= new dachsachphongthiDLL();
        if (ds == null) {
            ds = dao.docdulieu();
        }
    }
public List<danhsachphongthiDTO> getList(){
    return  ds;
}

   public List<danhsachphongthiDTO> getListKQ(int maphongthi) {
        ArrayList<danhsachphongthiDTO> dskq = new ArrayList<>();
        for(danhsachphongthiDTO ct : ds) {
            if( ct.getPhongthiID() == maphongthi) {
            } else {
                dskq.add(ct);
            }
        }
        return dskq; 
    }
    public int them(danhsachphongthiDTO dd) {
        dachsachphongthiDLL dao= new dachsachphongthiDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }

    public int xoa(int vitri) {
             dachsachphongthiDLL dao= new dachsachphongthiDLL();
        int rs = dao.xoa(ds.get(vitri).getTsID());
        if (rs == 1) {
            ds.remove(vitri);
        }
        return rs;
    }

    public int sua(int vitri, danhsachphongthiDTO dd) {
          dachsachphongthiDLL dao= new dachsachphongthiDLL();
        int rs = dao.sua(dd);
        if (rs == 1) {
            ds.set(vitri, dd);
        }
        return rs;
    }

    public qlttnn.DTO.danhsachphongthiDTO getDSPT (int ts_id) {
        for (danhsachphongthiDTO nv : ds) {
            if (nv.getTsID() == ts_id) {
                return nv;
            }
        }
        return null;
    }

     public String remindSTT() {// tự sinh mã
        int max = 0;
        String s = "";
        for (danhsachphongthiDTO kh : ds) {
            int id = (kh.getStt());
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