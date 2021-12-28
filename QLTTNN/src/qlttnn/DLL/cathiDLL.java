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

public class cathiDLL {

    public ArrayList<cathiDTO> docdulieu() throws Exception {
        ArrayList<cathiDTO> ds = new ArrayList<cathiDTO>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "ngoaingu");
        try {
            String qry = "select * from ca_thi";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                cathiDTO cathi = new cathiDTO();
                cathi.setCathiID(rs.getInt(1));
                cathi.setGiothi(rs.getString(2));

                ds.add(cathi);
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return ds;
    }
     public int them(cathiDTO cathi){
         int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into ca_thi Value(";
			qry += "'" + cathi.getCathiID() + "'";
                        qry += ",'" + cathi.getGiothi() + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
      public int xoa(int cathi_id) {
            int res = 0;
		try {
			String qry = "delete from ca_thi where ca_thi_id='" +cathi_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
      public int sua(cathiDTO cathi) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update ca_thi set ";
			qry += "gio_thi='"+ cathi.getGiothi() + "'";
			qry += " where ca_thi_id='" + cathi.getCathiID() + "'";
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
