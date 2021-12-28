/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.DLL;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import qlttnn.DTO.ketquathiDTO;
import qlttnn.MySQLConnect.MyDataAccess;

public class ketquathiDLL{
    public ArrayList<ketquathiDTO> docdulieu() throws Exception{
        ArrayList<ketquathiDTO> ds = new ArrayList<ketquathiDTO>();
        MyDataAccess my =new MyDataAccess("localhost","root","","ngoaingu");
        try{
            String qry = "select * from ket_qua_thi";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()){
                            ketquathiDTO kq  = new ketquathiDTO();
                            kq.setKqthiID(rs.getInt(1));
                            kq.setDoc(rs.getFloat(2));
                            kq.setNghe(rs.getFloat(3));
                            kq.setNoi(rs.getFloat(4));
                            kq.setTrungbinh(rs.getFloat(5));
                            kq.setViet(rs.getFloat(6));
                            kq.setXeploai(rs.getString(7));
                            kq.setTsIS(rs.getInt(7));
                            ds.add(kq);
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
    public int them(ketquathiDTO kq){
         int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into ket_qua_thi Value(";
			qry += "'" + kq.getKqthiID() + "'";
			qry += ",'" + kq.getDoc() + "'";
                        qry += ",'" + kq.getNghe() + "'";
                        qry += ",'" + kq.getNoi() + "'";
                        qry += ",'" + kq.getTrungbinh() + "'";
                        qry += ",'" + kq.getViet() + "'";
                        qry += ",'" + kq.getXeploai() + "'";
                        qry += ",'" + kq.getTsIS() + "'";
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
			String qry = "delete from ket_qua_thi where ket_qua_thi_id='" +ts_id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
     public int sua(ketquathiDTO kqt) {
                int res = 0;
		try {
                        
			String qry = "Update thi_sinh set ";
			qry += "doc'"+ kqt.getDoc() + "'";
                        qry += ",nghe='"+ kqt.getNghe()+ "'";
                        qry += ",noi='"+ kqt.getNoi() + "'";
                        qry += ",trung_binh='"+ kqt.getTrungbinh() + "'";
                        qry += ",viet='"+ kqt.getViet() + "'";
                        qry += ",xep_loai='"+ kqt.getXeploai() + "'";
                        qry += ",trung_binh='"+ kqt.getTsIS() + "'";
			qry += " where ket_qua_thi_id='" + kqt.getKqthiID() + "'";
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
