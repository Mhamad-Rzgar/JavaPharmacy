package ProfilePackage;

import Logic.DBAction;
import Models.LoginModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

//    private UserDetail userDetail;
    public Login() {
//        this.userDetail = userDetail;
        initComponents();
        this.getContentPane().setBackground(Color.decode("#DCE7F7"));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 5, dim.height / 5);
        
        LoginBtn.setBackground(Color.decode("#1BADDE"));
        LoginBtn.setForeground(Color.white);
        LoginBtn.setBorder(null);
        
        RegisterLbl.setForeground(Color.decode("#F2AB44"));
        
        passTxt.setBackground(Color.decode("#fefefe"));
        userTxt.setBackground(Color.decode("#fefefe"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        RegisterLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 500));
        setPreferredSize(new java.awt.Dimension(777, 500));
        getContentPane().setLayout(null);

        LoginBtn.setText("Login");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginBtnMouseExited(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn);
        LoginBtn.setBounds(50, 300, 240, 25);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("UserName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 180, 60, 15);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 220, 60, 15);

        userTxt.setBorder(null);
        getContentPane().add(userTxt);
        userTxt.setBounds(130, 180, 160, 15);

        passTxt.setBorder(null);
        getContentPane().add(passTxt);
        passTxt.setBounds(130, 220, 160, 15);

        jPanel1.setBackground(new java.awt.Color(27, 173, 222));
        jPanel1.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePackage/GRAPHICS.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 50, 300, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 0, 440, 540);

        RegisterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RegisterLbl.setText("Create New Account");
        RegisterLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterLblMouseExited(evt);
            }
        });
        getContentPane().add(RegisterLbl);
        RegisterLbl.setBounds(50, 330, 240, 15);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Rudaw", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("چوونە ژوورەوە");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 110, 240, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed

        try {
            
            LoginModel login = new LoginModel(userTxt.getText(), new String(passTxt.getPassword()));
            
            boolean isLogin = DBAction.loginUser(login);
            
            if (isLogin) {
                Home home = new Home();
                home.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "User name yan Password halaya");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_LoginBtnActionPerformed

    private void RegisterLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLblMouseClicked
        new Register().show();
        this.dispose();
    }//GEN-LAST:event_RegisterLblMouseClicked

    private void RegisterLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLblMouseEntered

        RegisterLbl.setForeground(Color.decode("#9CAC82"));
    }//GEN-LAST:event_RegisterLblMouseEntered

    private void RegisterLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLblMouseExited
        RegisterLbl.setForeground(Color.decode("#F2AB44"));
    }//GEN-LAST:event_RegisterLblMouseExited

    private void LoginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseExited
        LoginBtn.setBackground(Color.decode("#1BADDE"));
    }//GEN-LAST:event_LoginBtnMouseExited

    private void LoginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseEntered
        LoginBtn.setBackground(Color.decode("#76CEEB"));
    }//GEN-LAST:event_LoginBtnMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel RegisterLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
