/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DLL;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import qlttnn.DTO.danhsachphongthiDTO;
import qlttnn.MySQLConnect.MyDataAccess;

public class dachsachphongthiDLL {
 public ArrayList<danhsachphongthiDTO> docdulieu() throws Exception {
        ArrayList<danhsachphongthiDTO> ds = new ArrayList<danhsachphongthiDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
            String qry = "select * from danhsachphongthi";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                danhsachphongthiDTO dspt = new danhsachphongthiDTO();
                dspt.setTsID(rs.getInt(1));
                dspt.setPhongthiID(rs.getInt(2));
                dspt.setSbd(rs.getString(3));
                dspt.setNghe(rs.getFloat(4));
                dspt.setNoi(rs.getFloat(5));
                dspt.setDoc(rs.getFloat(6));
                dspt.setViet(rs.getFloat(7));
                dspt.setStt(rs.getInt(8));
                ds.add(dspt);
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return ds;
    }
     public int them(danhsachphongthiDTO dspt){
         int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into danhsachphongthi Value(";
			qry += "'" + dspt.getTsID() + "'";
                        qry += ",'" + dspt.getPhongthiID() + "'";
                          qry += ",'" + dspt.getSbd() + "'";
                            qry += ",'" + dspt.getNghe() + "'";
                              qry += ",'" + dspt.getNoi() + "'";
                                qry += ",'" + dspt.getDoc() + "'";
                                  qry += ",'" + dspt.getViet() + "'";
                                  qry += ",'" + dspt.getStt() + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
      public int xoa(int ts_id) {
            int res = 0;
		try {
			String qry = "delete from danhsachphongthi where thi_sinh_id='" + ts_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
      public int sua(danhsachphongthiDTO dspt) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update danhsachphongthi set ";
			qry += "phong_thi_id ='"+  dspt.getPhongthiID()+ "'";
                        qry += "so_bao_danh ='"+  dspt.getSbd()+ "'";
                        qry += "nghe ='"+  dspt.getNghe()+ "'";
                        qry += "noi ='"+  dspt.getNoi()+ "'";
                        qry += "doc ='"+  dspt.getDoc()+ "'";
                        qry += "viet ='"+  dspt.getViet()+ "'";
                         qry += "stt ='"+  dspt.getStt()+ "'";
			qry += " where thi_sinh_id='" + dspt.getTsID() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
      public ArrayList<danhsachphongthiDTO> docdulieuphongthi(Map<String,String> nv) throws Exception {
        ArrayList<danhsachphongthiDTO> ds = new ArrayList<danhsachphongthiDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
             StringBuffer query = new StringBuffer("Select * from danhsachphongthi where 1=1");
                       if(nv.get("maphongthi")!= null && !nv.get("maphongthi").equals("")){
                            query.append(" and phong_thi_id = "+nv.get("maphongthi"));
                        }
            System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
            while (rs.next()) {
                danhsachphongthiDTO dspt = new danhsachphongthiDTO();
                dspt.setTsID(rs.getInt(1));
                dspt.setPhongthiID(rs.getInt(2));
                dspt.setSbd(rs.getString(3));
                dspt.setNghe(rs.getFloat(4));
                dspt.setNoi(rs.getFloat(5));
                dspt.setDoc(rs.getFloat(6));
                dspt.setViet(rs.getFloat(7));
                dspt.setStt(rs.getInt(8));
                ds.add(dspt);
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return ds;
    }
}
