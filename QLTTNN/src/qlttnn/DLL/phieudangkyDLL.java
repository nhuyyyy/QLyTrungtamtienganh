/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DLL;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import qlttnn.DTO.phieudangkyDTO;

import qlttnn.MySQLConnect.MyDataAccess;

/**
 *
 * @author ADMIN
 */


    
  public class phieudangkyDLL{
    public List<phieudangkyDTO> docdulieu() throws Exception{
        ArrayList<phieudangkyDTO> ds = new ArrayList<phieudangkyDTO>();
        MyDataAccess my =new MyDataAccess("localhost","root","","ngoaingu");
        try{
            String qry = "select * from phieudangky";
			java.sql.ResultSet rs = my.executeQuery(qry);
			while(rs.next()){
                            phieudangkyDTO pdk = new phieudangkyDTO();
                            pdk.setTsid(rs.getInt(1));
                            pdk.setKhoathiID(rs.getInt(2));
                            pdk.setTrinhdo(rs.getString(3));
                            pdk.setNgaydangky(rs.getDate(4));
                          
                            ds.add(pdk);
                        }
        }catch(Exception e){
            System.err.println(e);
         JOptionPane.showMessageDialog(null,"Lỗi đọc Database");
        }
        finally{
            my.close();
        }
        return  ds;
    }
    public int them(phieudangkyDTO pdk){
         int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into phieudangky Value(";
			qry += "'" + pdk.getTsid() + "'";
			qry += ",'" + pdk.getKhoathiID() + "'";
                        qry += ",'" + pdk.getTrinhdo() + "'";
                        qry += ",'" + format.format(pdk.getNgaydangky()) + "'";
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
			String qry = "delete from thisinh where thi_sinh_id='" +ts_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
     public int sua(phieudangkyDTO pdk) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update phieudangky set ";
			qry += "khoa_thi_id='"+ pdk.getKhoathiID() + "'";
                        qry += ",trinh_do='"+ pdk.getTrinhdo() + "'";
                        qry += ",ngay_dang_ky='"+ dateFormat.format(pdk.getNgaydangky())+ "'";
                   
			qry += " where thi_sinh_id='" +  pdk.getTsid() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
     //tìm kiếm
       
      
    }
     

  
