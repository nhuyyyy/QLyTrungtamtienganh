/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DLL;

import qlttnn.MySQLConnect.MyDataAccess;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import qlttnn.DTO.*;
public class phongthiDLL {
 public ArrayList<phongthiDTO> docdulieu() throws Exception {
        ArrayList<phongthiDTO> ds = new ArrayList<phongthiDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
            String qry = "select * from phongthi";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
               phongthiDTO phongthi = new phongthiDTO();
                phongthi.setPhongthiID(rs.getInt(1));
                phongthi.setTenphongthi(rs.getString(2));
                phongthi.setCathiID(rs.getInt(3));
                phongthi.setKhoathiID(rs.getInt(4));
                phongthi.setTrinhdo(rs.getString(5));
                phongthi.setSoluong(rs.getInt(6));
                ds.add(phongthi);
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return ds;
    }
     public int them(phongthiDTO phongthi){
         int res = 0;
                    try {
                        
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into phongthi Value(";
			qry += "'" + phongthi.getPhongthiID() + "'";
                        qry += ",'" + phongthi.getTenphongthi() + "'";
                        qry += ",'" + phongthi.getCathiID() + "'";
                        qry += ",'" + phongthi.getKhoathiID() + "'";
                        qry += ",'" + phongthi.getTrinhdo() + "'";
                        qry += ",'" + phongthi.getSoluong() + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
      public int xoa(int phongthi_id) {
            int res = 0;
		try {
			String qry = "delete from phongthi where phong_thi_id='" +phongthi_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
      public int sua(phongthiDTO phongthi) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update phongthi set ";
			qry += "ten_phong_thi ='"+ phongthi.getTenphongthi() + "'";
                        qry += ",ca_thi_id'"+ phongthi.getCathiID() + "'";
                         qry += ",trinh_do'"+ phongthi.getTrinhdo() + "'";
                         qry += ",so_luong'"+ phongthi.getSoluong() + "'";
			qry += " where phong_thi_id='" + phongthi.getPhongthiID() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
}
