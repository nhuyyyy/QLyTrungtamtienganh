/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import qlttnn.DLL.thisinhDLL;
import qlttnn.DTO.thisinhDTO;

public class thisinhBLL {
    public static List<thisinhDTO> ds;
     public void docDuLieu() throws Exception{
         thisinhDLL data = new thisinhDLL();
       if(ds == null){
           ds = data.docdulieu();
       }
   }
       public void listSP() throws Exception {
        thisinhDLL data = new thisinhDLL();
        ds = new ArrayList<>();
        ds = data.docdulieu();
    }
      public void docduLieusearch(Map<String,String> nv) throws Exception{
      thisinhDLL dao = new thisinhDLL();
       
                ds = dao.getThisinh(nv);
             
}
     
    public int them(thisinhDTO dd) {
      thisinhDLL dao = new thisinhDLL();
       int rs = dao.them(dd);
       if(rs == 1)
       {
           ds.add(dd);
       }
       return rs;
    }
      public int xoa(int vitri)
   {
        thisinhDLL dao = new thisinhDLL();
       int rs = dao.xoa(ds.get(vitri).getTsID());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
         public int sua(int vitri, thisinhDTO dd)
   {
      thisinhDLL dao = new thisinhDLL();
       int rs = dao.sua(dd);
       if(rs == 1)
       {
           ds.set(vitri, dd);
       }
       return rs;
   }
     public qlttnn.DTO.thisinhDTO getThisinh(int ts_id)
    {
        for(thisinhDTO nv: ds)
        {
            if(nv.getTsID() == ts_id)
                   return nv;
        }
        return null;
    }
      public String remindMathisinh() {
        int max = 0;
        String s ="";
        for(thisinhDTO kh : ds) {
            int id = (kh.getTsID());
            if(id > max) {
                max = id;
            }
        }
        for(int i = 0 ; i < 3-String.valueOf(max+1).length(); i++) {
            s+="0";
        }
        return s+(max+1);
   }
            public List<thisinhDTO> getthisinhsearch(Map<String,String> nv) throws Exception{
             thisinhDLL dao = new thisinhDLL();
              List<thisinhDTO> dsnv = dao.getThisinh(nv);
              return dsnv;
}
}
