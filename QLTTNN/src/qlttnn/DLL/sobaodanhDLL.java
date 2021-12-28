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
import qlttnn.DTO.sobaodanhDTO;
public class sobaodanhDLL {
 public ArrayList<sobaodanhDTO> docdulieu() throws Exception {
        ArrayList<sobaodanhDTO> ds = new ArrayList<sobaodanhDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
            String qry = "select * from so_bao_danh";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                sobaodanhDTO sbd = new sobaodanhDTO();
                sbd.setSbdID(rs.getString(1));
                sbd.setTsID(rs.getInt(2));

                ds.add(sbd);
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return ds;
    }
     public int them(sobaodanhDTO sbd){
         int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into so_bao_danh Value(";
			qry += "'" + sbd.getSbdID() + "'";
                        qry += ",'" + sbd.getTsID() + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
      public int xoa(int sbd_id) {
            int res = 0;
		try {
			String qry = "delete from so_bao_danh where so_bao_danh_id='" + sbd_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
      public int sua(sobaodanhDTO sbd) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update ca_thi set ";
			qry += "ts_id='"+ sbd.getTsID() + "'";
			qry += " where so_bao_danh_id='" + sbd.getSbdID() + "'";
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

