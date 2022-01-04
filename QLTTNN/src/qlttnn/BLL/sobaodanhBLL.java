/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.List;
import qlttnn.DLL.sobaodanhDLL;
import qlttnn.DTO.sobaodanhDTO;

public class sobaodanhBLL {
  public static List<sobaodanhDTO> ds;

    public void docDuLieu() throws Exception {
     sobaodanhDLL data = new sobaodanhDLL();
        if (ds == null) {
            ds = data.docdulieu();
        }
    }

    public int them(sobaodanhDTO dd) {
         sobaodanhDLL dao = new sobaodanhDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }



    public int sua(int vitri, sobaodanhDTO dd) {
             sobaodanhDLL dao = new sobaodanhDLL();
        int rs = dao.sua(dd);
        if (rs == 1) {
            ds.set(vitri, dd);
        }
        return rs;
    }




}
