
package qlttnn.DLL;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import qlttnn.DTO.khoathiDTO;
import qlttnn.MySQLConnect.MyDataAccess;

public class khoathiDLL {
 public ArrayList<khoathiDTO> docdulieu() throws Exception {
        ArrayList<khoathiDTO> ds = new ArrayList<khoathiDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
            String qry = "select * from khoathi";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                khoathiDTO khoathi = new khoathiDTO();
               khoathi.setKhoathiID(rs.getInt(1));
                khoathi.setNgaythi(rs.getDate(2));
                khoathi.setTenkhoathi(rs.getString(3));

                ds.add(khoathi);
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return ds;
    }
     public int them(khoathiDTO khoathi){
         int res = 0;
                    try {
                         SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into khoathi Value(";
			qry += "'" + khoathi.getKhoathiID() + "'";
                        qry += ",'" + khoathi.getTenkhoathi() + "'";
                        qry += ",'" +  format.format(khoathi.getKhoathiID()) + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
      public int xoa(int khoathi_id) {
            int res = 0;
		try {
			String qry = "delete from khoathi where phong_thi_id='" +khoathi_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
      public int sua(khoathiDTO khoathi) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update phong_thi set ";
			qry += "ngay_bat_dau='"+ dateFormat.format(khoathi.getNgaythi())+ "'";
                        qry += ",ten_khoa='"+ khoathi.getTenkhoathi() + "'";
			qry += " where khoa_thi_id='" + khoathi.getKhoathiID() + "'";
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
