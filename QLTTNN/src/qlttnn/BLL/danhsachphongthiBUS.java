/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

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

    

}