package com.errornetworks.login;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    int unsuccessfulAttempts = 1;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLogin = new javax.swing.JButton();
        jRememberMe = new javax.swing.JCheckBox();
        jForgotPassword = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Error Networks");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("fLogin"); // NOI18N
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("FreeMono", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");

        jUserName.setBackground(new java.awt.Color(204, 204, 204));
        jUserName.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        jUserName.setForeground(new java.awt.Color(0, 0, 0));
        jUserName.setCaretColor(new java.awt.Color(0, 0, 0));
        jUserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FreeMono", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLogin.setFont(new java.awt.Font("FreeMono", 3, 18)); // NOI18N
        jLogin.setForeground(new java.awt.Color(255, 0, 0));
        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jRememberMe.setBackground(new java.awt.Color(0, 0, 0));
        jRememberMe.setFont(new java.awt.Font("FreeMono", 3, 18)); // NOI18N
        jRememberMe.setForeground(new java.awt.Color(255, 255, 255));
        jRememberMe.setText("Remember Me");
        jRememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRememberMeActionPerformed(evt);
            }
        });

        jForgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        jForgotPassword.setFont(new java.awt.Font("FreeMono", 3, 18)); // NOI18N
        jForgotPassword.setForeground(new java.awt.Color(255, 0, 0));
        jForgotPassword.setText("Forgot Password ?");
        jForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jForgotPasswordActionPerformed(evt);
            }
        });

        jReset.setBackground(new java.awt.Color(255, 255, 255));
        jReset.setFont(new java.awt.Font("FreeMono", 3, 18)); // NOI18N
        jReset.setForeground(new java.awt.Color(255, 0, 0));
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/errornetworks/login/EN.png"))); // NOI18N

        jPassword.setBackground(new java.awt.Color(204, 204, 204));
        jPassword.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        jPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPassword.setCaretColor(new java.awt.Color(0, 0, 0));
        jPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRememberMe)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jReset)
                            .addGap(256, 256, 256)
                            .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(229, 229, 229)
                            .addComponent(jForgotPassword))))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jForgotPassword)
                    .addComponent(jRememberMe))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin)
                    .addComponent(jReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jForgotPasswordActionPerformed
        JOptionPane.showMessageDialog(this, "Contact the Administrator", "INFO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jForgotPasswordActionPerformed

    private void jRememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRememberMeActionPerformed
        
    }//GEN-LAST:event_jRememberMeActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        
        var UserName = jUserName.getText();
        var Password = jPassword.getText();
        
        if (UserName.equals("") || Password.equals("")) {                      
            JOptionPane.showMessageDialog(this, "Username or Password is not Entered", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (UserName.length()>15) {
            JOptionPane.showMessageDialog(this, "Username Character Limit Exceeded", "Info", JOptionPane.ERROR_MESSAGE);
        }

        if (Password.length()>15) {
            JOptionPane.showMessageDialog(this, "Password character Limit exceeded", "Info", JOptionPane.ERROR_MESSAGE);
        }
        
        if (UserName.equals("user") && Password.equals("pass")) {
           ErrorNetworksConsole console = new ErrorNetworksConsole();
           console.setVisible(true); 
        } else if (unsuccessfulAttempts==3 && !(UserName.equals("user") && Password.equals("User123"))) {
            jLogin.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Console has been locked due to many unsuccessful attempts. Contact the Administrator", "Console Locked", JOptionPane.ERROR_MESSAGE);
        } else {
            unsuccessfulAttempts++;
            JOptionPane.showMessageDialog(this, "Invalid Username or Password is Entered. You have " +(4-unsuccessfulAttempts)+ " Attempts Left", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        if (!jRememberMe.isSelected()) {
            jUserName.setText(null);
            jPassword.setText(null);
        }     
    }//GEN-LAST:event_jLoginActionPerformed

    private void jUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserNameActionPerformed
        
    }//GEN-LAST:event_jUserNameActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jUserName.setText(null);
        jPassword.setText(null);
    }//GEN-LAST:event_jResetActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jForgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JCheckBox jRememberMe;
    private javax.swing.JButton jReset;
    private javax.swing.JTextField jUserName;
    // End of variables declaration//GEN-END:variables
}
