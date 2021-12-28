/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DLL;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import qlttnn.DTO.danhsachphongthiDTO;
import qlttnn.MySQLConnect.MyDataAccess;

public class dachsachphongthiDLL {
 public ArrayList<danhsachphongthiDTO> docdulieu() throws Exception {
        ArrayList<danhsachphongthiDTO> ds = new ArrayList<danhsachphongthiDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
            String qry = "select * from danh_sach_phong_thi";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                danhsachphongthiDTO dspt = new danhsachphongthiDTO();
                dspt.setTsID(rs.getInt(1));
                dspt.setPhongthiID(rs.getInt(2));

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
			String qry = "Insert into danh_sach_phong_thi Value(";
			qry += "'" + dspt.getTsID() + "'";
                        qry += ",'" + dspt.getPhongthiID() + "'";
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
			String qry = "delete from danh_sach_phong_thi where ts_id='" + ts_id + "'";
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
			String qry = "Update danh_sach_phong_thi set ";
			qry += "phong_thi_id ='"+  dspt.getPhongthiID()+ "'";
			qry += " where ts_id='" + dspt.getTsID() + "'";
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
