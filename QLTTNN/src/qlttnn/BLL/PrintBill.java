/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlttnn.DTO.thisinhDTO;

/**
 *
 * @author ADMIN
 */
public class PrintBill {
     private String file;// = "./report/test.pdf";
    private ArrayList<thisinhDTO> cthd = new ArrayList<thisinhDTO>();
    private thisinhDTO ts;
    private BaseFont bf;
    private thisinhBLL bus = new thisinhBLL();
    public PrintBill() throws Exception {
            bus.listSP();
    }
    public PrintBill(thisinhDTO ts,ArrayList<thisinhDTO> cthd)  {
         try {
             this.ts= ts;
             file = Hander.getFullPath("report/bill"+ts.getTsID()+".pdf");
             System.out.println(file);
             this.cthd = cthd;
             bus.listSP();
         } catch (Exception ex) {
             Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void print() {
        String uderline = "*";
        try {
            //Tạo Font
            bf = BaseFont.createFont("./font/times.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            
            // Tạo tài liệu
            Document bill = new Document(PageSize.A4, 15, 15, 10, 10);
            
            String line = "";
            for(int i = 0 ; i < bill.getPageSize().getWidth()/5; i++){
                line += uderline;
            }
            //Tạo đối tượng writter
            PdfWriter.getInstance(bill, new FileOutputStream(file));
            
            //Mở document
            bill.open();
            
            Paragraph header = new Paragraph("Đăng ký dự thi",new Font(bf,35));
            header.setAlignment(1);
            bill.add(header);
            
            Paragraph info = new Paragraph("Mã thí sinh : "+ts+"          ",new Font(bf,15));
            bill.add(info);
            
            Paragraph l = new Paragraph(line);
            l.setAlignment(1);
            bill.add(l);
            
            String[] cellHeader = {"","CMND","Email","Họ tên","Nơi sinh","SDT"};
            
            PdfPTable t = new PdfPTable(cellHeader.length);
            t.setSpacingAfter(10);
            t.setSpacingBefore(10);
            int[] relativeWidths = {20,80,10,40};
            t.setWidths(relativeWidths);
            
            for(String s : cellHeader){
                t.addCell(createCell(s, new Font(bf,13)));
            }    
            for(thisinhDTO ct : cthd){
                t.addCell( createCell(String.valueOf(ct.getTsID())));
                t.addCell( createCell(String.valueOf(ct.getCmnd())));
                t.addCell( createCell(ct.getEmail()) );
                t.addCell( createCell(ct.getHoten()) );
                t.addCell( createCell(String.valueOf(ct.getNoisinh())));
                 t.addCell( createCell(String.valueOf(ct.getSdt())));
                
            }
            bill.add(t);
            
            bill.add(l);
            
           
            
            
            bill.close();
            
                    
            JOptionPane.showMessageDialog(null, "In hoàn tất");
            System.out.println("Done");
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    public PdfPCell createCell(String s) {
        PdfPCell cell = new PdfPCell(new Phrase(s,new Font(bf,13)));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(10);
        
        return cell;
    }
    public PdfPCell createCell(String s,Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(s,font));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(10);
        return cell;
    }
}
