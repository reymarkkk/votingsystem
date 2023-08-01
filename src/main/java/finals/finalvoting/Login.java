/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finals.finalvoting;

import DataFiles.UserAccessObject;
import DataFiles.UserTransferObject;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author REYMARK
 */
public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //loginEmailField.setpref
        loginEmailField.setHint("Email");
        loginPasswordField.setHint("Password");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginLoginButton = new javax.swing.JButton();
        loginRegisterButton = new javax.swing.JButton();
        loginShowPasswordCheckBox = new javax.swing.JCheckBox();
        loginPasswordField = new CustomTextField.MyPasswordField();
        loginEmailField = new CustomTextField.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voting System - Login Form");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(28, 33, 32));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLoginButton.setBackground(new java.awt.Color(255, 87, 87));
        loginLoginButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        loginLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginLoginButton.setText("Login");
        loginLoginButton.setBorder(null);
        loginLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 110, 40));

        loginRegisterButton.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        loginRegisterButton.setText("Register");
        loginRegisterButton.setBorder(null);
        loginRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRegisterButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 110, 40));

        loginShowPasswordCheckBox.setBackground(new java.awt.Color(28, 33, 32));
        loginShowPasswordCheckBox.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        loginShowPasswordCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        loginShowPasswordCheckBox.setText("Show Password");
        loginShowPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginShowPasswordCheckBoxActionPerformed(evt);
            }
        });
        loginPanel.add(loginShowPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 140, -1));

        loginPasswordField.setCaretColor(new java.awt.Color(255, 255, 255));
        loginPasswordField.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-password-20.png"))); // NOI18N
        loginPasswordField.setSelectedTextColor(new java.awt.Color(28, 33, 32));
        loginPanel.add(loginPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 230, -1));

        loginEmailField.setCaretColor(new java.awt.Color(255, 255, 255));
        loginEmailField.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-email-20.png"))); // NOI18N
        loginEmailField.setSelectedTextColor(new java.awt.Color(28, 33, 32));
        loginPanel.add(loginEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/votinglogo2.png"))); // NOI18N
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, 80));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VOTING");
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 40));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SYSTEM");
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 150, 40));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));
        loginPanel.getAccessibleContext().setAccessibleName("Voting System - Login Form");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButtonActionPerformed
        // TODO add your handling code here:
        String email = loginEmailField.getText();
        String password = String.valueOf(loginPasswordField.getPassword());
        
        UserAccessObject userAccessObject = new UserAccessObject();
        
        if (email.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(loginPanel, "Can't process empty fields. Please complete the form.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if(userAccessObject.validateUser(email, password)){
                JOptionPane.showMessageDialog(loginPanel, "Login successfully!", "Success", JOptionPane.PLAIN_MESSAGE);
                UserTransferObject user = userAccessObject.getAllUserData(email, password);
                
                if(user.getRole().equals("voter")){
                    VoterDashboard voterDash = new VoterDashboard(user);
                    voterDash.setVisible(true);
                    this.dispose();
                } else {
                    // Open the dashboard passing the user details
                    AdminDashboard adminDash = new AdminDashboard(user);
                    adminDash.setVisible(true);
                    this.dispose();
                }
                
            } else {
                JOptionPane.showMessageDialog(loginPanel, "User does not exist or credentials do not match", "Erorr", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void loginRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisterButtonActionPerformed
        // TODO add your handling code here:
        Register registerPage = new Register();
        registerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginRegisterButtonActionPerformed

    private void loginShowPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginShowPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if(loginShowPasswordCheckBox.isSelected()){
            loginPasswordField.setEchoChar((char)0);
        }
        else{
            loginPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_loginShowPasswordCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private CustomTextField.MyTextField loginEmailField;
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JPanel loginPanel;
    private CustomTextField.MyPasswordField loginPasswordField;
    private javax.swing.JButton loginRegisterButton;
    private javax.swing.JCheckBox loginShowPasswordCheckBox;
    // End of variables declaration//GEN-END:variables
}