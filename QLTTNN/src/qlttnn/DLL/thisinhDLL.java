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
import qlttnn.DTO.thisinhDTO;
public class thisinhDLL {
    public ArrayList<thisinhDTO> docdulieu() throws Exception{
        ArrayList<thisinhDTO> ds = new ArrayList<thisinhDTO>();
        MyDataAccess my =new MyDataAccess("localhost","root","","ngoaingu");
        try{
            String qry = "select * from thisinh";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()){
                            thisinhDTO thisinh = new thisinhDTO();
                            thisinh.setTsID(rs.getInt(1));
                            thisinh.setCmnd(rs.getString(2));
                            thisinh.setEmail(rs.getString(3));
                            thisinh.setHoten(rs.getString(4));
                            thisinh.setNgaysinh(rs.getDate(5));
                            thisinh.setNoisinh(rs.getString(6));
                            thisinh.setSdt(rs.getString(7));
                            ds.add(thisinh);
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
    public int them(thisinhDTO thisinh){
         int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","ngoaingu");
			String qry = "Insert into thisinh Value(";
			qry += "'" + thisinh.getTsID() + "'";
			qry += ",'" + thisinh.getCmnd() + "'";
                        qry += ",'" + thisinh.getEmail() + "'";
                        qry += ",'" + thisinh.getHoten() + "'";
                        qry += ",'" + format.format(thisinh.getNgaysinh()) + "'";
                        qry += ",'" + thisinh.getNoisinh() + "'";
                        qry += ",'" + thisinh.getSdt() + "'";
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
     public int sua(thisinhDTO thisinh) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update thisinh set ";
			qry += "cmnd='"+ thisinh.getCmnd() + "'";
                        qry += ",email='"+ thisinh.getEmail() + "'";
                        qry += ",ho_ten='"+ thisinh.getHoten() + "'";
                        qry += ",ngay_sinh='"+ dateFormat.format(thisinh.getNgaysinh())+ "'";
                        qry += ",noi_sinh='"+ thisinh.getNoisinh() + "'";
                        qry += ",sdt='"+ thisinh.getSdt() + "'";
			qry += " where thi_sinh_id='" + thisinh.getTsID() + "'";
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
        public List<thisinhDTO> getThisinh(Map<String,String> nv) throws Exception{
        ArrayList<thisinhDTO> ds = new ArrayList<thisinhDTO>();
        MyDataAccess my =new MyDataAccess("localhost","root","","ngoaingu");
        try{
            StringBuffer query = new StringBuffer("Select * from thisinh where 1=1");
                        if(nv.get("thisinhID")!= null && !nv.get("thisinhID").equals("")){
                            query.append(" and thi_sinh_id = "+nv.get("thisinhID"));
                        }
                        if(nv.get("hotenthisinh")!= null&& !nv.get("hotenthisinh").equals("")){
                            query.append(" and ho_ten = '"+nv.get("hotenthisinh")+"'");
                            
                        }
                        System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
			while(rs.next()){
                            thisinhDTO thisinh = new thisinhDTO();
                            thisinh.setTsID(rs.getInt(1));
                            thisinh.setCmnd(rs.getString(2));
                            thisinh.setEmail(rs.getString(3));
                            thisinh.setHoten(rs.getString(4));
                            thisinh.setNgaysinh(rs.getDate(5));
                            thisinh.setNoisinh(rs.getString(6));
                            thisinh.setSdt(rs.getString(7));
                            ds.add(thisinh);
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
     
}
