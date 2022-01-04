/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.List;
import qlttnn.DLL.phieudangkyDLL;
import qlttnn.DTO.phieudangkyDTO;
import qlttnn.DTO.phongthiDTO;

public class phieudangkyBLL {
  
    public static List<phieudangkyDTO> ds;

    public void docDuLieu() throws Exception {
      phieudangkyDLL data = new phieudangkyDLL();
        if (ds == null) {
            ds = data.docdulieu();
        }
    }

    public int them(phieudangkyDTO dd) {
        phieudangkyDLL dao = new phieudangkyDLL();
        int rs = dao.them(dd);
        if (rs == 1) {
            ds.add(dd);
        }
        return rs;
    }

    

    public qlttnn.DTO.phieudangkyDTO getPhieudangky (int ts_id) {
        for (phieudangkyDTO nv : ds) {
            if (nv.getTsid() == ts_id) {
                return nv;
            }
        }
        return null;
    }

    
}

        
