/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlttnn.GUI;

import java.util.ArrayList;
import qlttnn.BLL.NavigationBUS;
import qlttnn.DTO.ListDTO;

/**
 *
 * @author ADMIN
 */
public class MenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuGUI
     */
    public MenuGUI() {
     initComponents();
        NavigationBUS nav = new NavigationBUS(jPnCon);
        nav.setView(tourjPanel, TourjLabel);
        ArrayList<ListDTO> listItem = new ArrayList<>();
        listItem.add (new ListDTO ("thisinh", thisinhJp,thisinhjl));
       
        nav.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnDangXuat2 = new javax.swing.JButton();
        tourjPanel = new javax.swing.JPanel();
        TourjLabel = new javax.swing.JLabel();
        thisinhJp = new javax.swing.JPanel();
        thisinhjl = new javax.swing.JLabel();
        phongthijp = new javax.swing.JPanel();
        phongthijl = new javax.swing.JLabel();
        khoathijp = new javax.swing.JPanel();
        khoathijl = new javax.swing.JLabel();
        cathijp = new javax.swing.JPanel();
        cathijl = new javax.swing.JLabel();
        NVjPanel = new javax.swing.JPanel();
        NVjLabel = new javax.swing.JLabel();
        TKjPanel5 = new javax.swing.JPanel();
        TKjLabel = new javax.swing.JLabel();
        LTjPanel = new javax.swing.JPanel();
        TKjLabel1 = new javax.swing.JLabel();
        jPnCon = new javax.swing.JPanel();
        DDjPanel = new javax.swing.JPanel();
        DDjLabell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(249, 247, 241));

        btnDangXuat2.setBackground(new java.awt.Color(131, 51, 233));
        btnDangXuat2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangXuat2.setText("Đăng xuất");
        btnDangXuat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuat2ActionPerformed(evt);
            }
        });

        tourjPanel.setBackground(new java.awt.Color(180, 159, 220));

        TourjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TourjLabel.setText("Quản lý Tour");

        javax.swing.GroupLayout tourjPanelLayout = new javax.swing.GroupLayout(tourjPanel);
        tourjPanel.setLayout(tourjPanelLayout);
        tourjPanelLayout.setHorizontalGroup(
            tourjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tourjPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(TourjLabel)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        tourjPanelLayout.setVerticalGroup(
            tourjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tourjPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(TourjLabel)
                .addGap(19, 19, 19))
        );

        thisinhJp.setBackground(new java.awt.Color(180, 159, 220));

        thisinhjl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thisinhjl.setText("Quản lý Thí sinh");

        javax.swing.GroupLayout thisinhJpLayout = new javax.swing.GroupLayout(thisinhJp);
        thisinhJp.setLayout(thisinhJpLayout);
        thisinhJpLayout.setHorizontalGroup(
            thisinhJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisinhJpLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(thisinhjl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thisinhJpLayout.setVerticalGroup(
            thisinhJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisinhJpLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(thisinhjl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        phongthijp.setBackground(new java.awt.Color(180, 159, 220));

        phongthijl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phongthijl.setText("Quản lý phòng thi");

        javax.swing.GroupLayout phongthijpLayout = new javax.swing.GroupLayout(phongthijp);
        phongthijp.setLayout(phongthijpLayout);
        phongthijpLayout.setHorizontalGroup(
            phongthijpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phongthijpLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(phongthijl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        phongthijpLayout.setVerticalGroup(
            phongthijpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phongthijpLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(phongthijl)
                .addGap(19, 19, 19))
        );

        khoathijp.setBackground(new java.awt.Color(180, 159, 220));

        khoathijl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        khoathijl.setText("Quản lý khóa thi");

        javax.swing.GroupLayout khoathijpLayout = new javax.swing.GroupLayout(khoathijp);
        khoathijp.setLayout(khoathijpLayout);
        khoathijpLayout.setHorizontalGroup(
            khoathijpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khoathijpLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(khoathijl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        khoathijpLayout.setVerticalGroup(
            khoathijpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khoathijpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(khoathijl)
                .addGap(29, 29, 29))
        );

        cathijp.setBackground(new java.awt.Color(180, 159, 220));

        cathijl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cathijl.setText("Quản lý ca thi");

        javax.swing.GroupLayout cathijpLayout = new javax.swing.GroupLayout(cathijp);
        cathijp.setLayout(cathijpLayout);
        cathijpLayout.setHorizontalGroup(
            cathijpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cathijpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cathijl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        cathijpLayout.setVerticalGroup(
            cathijpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cathijpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cathijl)
                .addGap(29, 29, 29))
        );

        NVjPanel.setBackground(new java.awt.Color(180, 159, 220));

        NVjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NVjLabel.setText("Số báo danh");

        javax.swing.GroupLayout NVjPanelLayout = new javax.swing.GroupLayout(NVjPanel);
        NVjPanel.setLayout(NVjPanelLayout);
        NVjPanelLayout.setHorizontalGroup(
            NVjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NVjPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(NVjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NVjPanelLayout.setVerticalGroup(
            NVjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NVjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NVjLabel)
                .addGap(20, 20, 20))
        );

        TKjPanel5.setBackground(new java.awt.Color(180, 159, 220));

        TKjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TKjLabel.setText("Quản lý điểm");

        javax.swing.GroupLayout TKjPanel5Layout = new javax.swing.GroupLayout(TKjPanel5);
        TKjPanel5.setLayout(TKjPanel5Layout);
        TKjPanel5Layout.setHorizontalGroup(
            TKjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TKjPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TKjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TKjPanel5Layout.setVerticalGroup(
            TKjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TKjPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TKjLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        LTjPanel.setBackground(new java.awt.Color(180, 159, 220));

        TKjLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TKjLabel1.setText("Đăng ký thi");

        javax.swing.GroupLayout LTjPanelLayout = new javax.swing.GroupLayout(LTjPanel);
        LTjPanel.setLayout(LTjPanelLayout);
        LTjPanelLayout.setHorizontalGroup(
            LTjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LTjPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TKjLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LTjPanelLayout.setVerticalGroup(
            LTjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LTjPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(TKjLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnConLayout = new javax.swing.GroupLayout(jPnCon);
        jPnCon.setLayout(jPnConLayout);
        jPnConLayout.setHorizontalGroup(
            jPnConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        jPnConLayout.setVerticalGroup(
            jPnConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        DDjPanel.setBackground(new java.awt.Color(180, 159, 220));

        DDjLabell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DDjLabell.setText("Quản lý địa điểm");

        javax.swing.GroupLayout DDjPanelLayout = new javax.swing.GroupLayout(DDjPanel);
        DDjPanel.setLayout(DDjPanelLayout);
        DDjPanelLayout.setHorizontalGroup(
            DDjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDjPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(DDjLabell)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DDjPanelLayout.setVerticalGroup(
            DDjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDjPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(DDjLabell)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tourjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DDjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDangXuat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LTjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TKjPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NVjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(khoathijp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cathijp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(phongthijp, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(thisinhJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPnCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tourjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thisinhJp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(phongthijp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(cathijp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(khoathijp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NVjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TKjPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LTjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DDjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDangXuat2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPnCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuat2ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnDangXuat2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DDjLabell;
    private javax.swing.JPanel DDjPanel;
    private javax.swing.JPanel LTjPanel;
    private javax.swing.JLabel NVjLabel;
    private javax.swing.JPanel NVjPanel;
    private javax.swing.JLabel TKjLabel;
    private javax.swing.JLabel TKjLabel1;
    private javax.swing.JPanel TKjPanel5;
    private javax.swing.JLabel TourjLabel;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDangXuat1;
    private javax.swing.JButton btnDangXuat2;
    private javax.swing.JLabel cathijl;
    private javax.swing.JPanel cathijp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPnCon;
    private javax.swing.JLabel khoathijl;
    private javax.swing.JPanel khoathijp;
    private javax.swing.JLabel phongthijl;
    private javax.swing.JPanel phongthijp;
    private javax.swing.JPanel thisinhJp;
    private javax.swing.JLabel thisinhjl;
    private javax.swing.JPanel tourjPanel;
    // End of variables declaration//GEN-END:variables
}
