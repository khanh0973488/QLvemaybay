/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package qlvembay;


import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author khanh ngu
 */
public class TK extends javax.swing.JInternalFrame {

    /**
     * Creates new form TK
     */
    public TK() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    private Connection getConnect() {
        try {
        // Thay đổi thông tin kết nối theo cấu hình của bạn
        String url = "jdbc:mysql://127.0.0.1:3306/qlvemaybay";
        String user = "root";
        String password = "";

        // Tạo kết nối
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Kết nối thành công đến cơ sở dữ liệu!");
        return connection;
    } catch (SQLException ex) {
        System.err.println("Lỗi kết nối đến cơ sở dữ liệu: " + ex.getMessage());
        return null;
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtcccd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        txttenkh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtim = new javax.swing.JTable();

        jLabel2.setText("Mã khách hàng:");

        jLabel4.setText("CCCD:");

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ và tên:");

        tbtim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID vé", "Hãng bay", "Ngày đặt vé", "Điểm đi", "Điểm đến", "Ngày bay", "Giờ bay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbtim);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txttenkh, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(txtMaKhachHang))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(btnTim)))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTim))
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        try (Connection connection = getConnect()) {
            // Kiểm tra nếu kết nối thành công
            if (connection != null) {
                String idkh = txtMaKhachHang.getText();
                String tenkh = txttenkh.getText();
                String cccd = txtcccd.getText();

                String query = "SELECT ve_dat.id, ve_dat.hang_bay, ve_dat.ngay_dat, ve_dat.diem_di, ve_dat.diem_den, ve_dat.ngay_bay, ve_dat.gio_bay " +
                "FROM ve_dat " +
                "JOIN khach_hang ON ve_dat.id_khach_hang = khach_hang.id " +
                "WHERE khach_hang.id = ? OR khach_hang.ten = ? OR khach_hang.CCCD = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, idkh);
                    preparedStatement.setString(2, tenkh);
                    preparedStatement.setString(3, cccd);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) tbtim.getModel();
                    model.setRowCount(0); // Xóa tất cả các dòng hiện tại trong bảng

                    while (resultSet.next()) {
                        Object[] row = {
                            resultSet.getInt("id"),
                            resultSet.getString("hang_bay"),
                            resultSet.getDate("ngay_dat"),
                            resultSet.getString("diem_di"),
                            resultSet.getString("diem_den"),
                            resultSet.getDate("ngay_bay"),
                            resultSet.getTime("gio_bay")
                        };

                        model.addRow(row);
                    }

                    if (model.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin chuyến bay", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }

                    // Đóng ResultSet và PreparedStatement sau khi sử dụng
                    resultSet.close();
                    preparedStatement.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Lỗi khi truy vấn cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TK.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbtim;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtcccd;
    private javax.swing.JTextField txttenkh;
    // End of variables declaration//GEN-END:variables
}
