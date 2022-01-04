/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.ArrayList;
import java.util.List;

import qlttnn.DLL.ketquathiDLL;
import qlttnn.DTO.ketquathiDTO;

public class ketquathiBLL {
public static List<ketquathiDTO> ds;

    public void docDuLieu() throws Exception  {
      ketquathiDLL dao= new ketquathiDLL();
       ds = new ArrayList<>();
       ds = dao.docdulieu();
    }
public List<ketquathiDTO> getList(){
    return  ds;
}
    public int them(ketquathiDTO dd) {
        ketquathiDLL dao= new ketquathiDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }

    public int xoa(int vitri) {
             ketquathiDLL dao= new ketquathiDLL();
        int rs = dao.xoa(ds.get(vitri).getKqthiID());
        if (rs == 1) {
            ds.remove(vitri);
        }
        return rs;
    }

    public int sua(int vitri, ketquathiDTO dd) {
           ketquathiDLL dao= new ketquathiDLL();
        int rs = dao.sua(dd);
        if (rs == 1) {
            ds.set(vitri, dd);
        }
        return rs;
    }

   public List<ketquathiDTO> getListKQ(int maTs) {
        ArrayList<ketquathiDTO> dskq = new ArrayList<>();
        for(ketquathiDTO ct : ds) {
            if( ct.getTsIS() == maTs) {
            } else {
                dskq.add(ct);
            }
        }
        return dskq; 
    }
    
    public String remindKQID() {// tự sinh mã
        int max = 0;
        String s = "";
        for (ketquathiDTO kh : ds) {
            int id = (kh.getKqthiID());
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
