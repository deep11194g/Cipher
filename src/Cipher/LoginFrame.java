package Cipher;

import java.io.*;
import javax.swing.*;
import java.awt.*;

public class LoginFrame extends javax.swing.JFrame {

    public String user = "";
    public String name[] = new String[100];
    public String password[] = new String[100];
    public int count;
    public int flag;
    //variable to check validity

    public LoginFrame() {
        initComponents();
        for (int i = 0; i < 100; i++) {
            name[i] = "";
            password[i] = "";
        }
        count = 0;

        File uploadfolder = new File("Cipher_logs");
        if (!uploadfolder.exists()) {
            uploadfolder.mkdir();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usr = new javax.swing.JLabel();
        username_login = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        pass_login = new javax.swing.JPasswordField();
        signin_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        set = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signup_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_new = new javax.swing.JTextField();
        pass_new = new javax.swing.JPasswordField();
        avl = new javax.swing.JLabel();
        check_button = new javax.swing.JButton();
        pr = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        pass2_new = new javax.swing.JPasswordField();
        mtch = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        usr.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        usr.setText("Username:-");

        username_login.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        username_login.setForeground(new java.awt.Color(204, 204, 204));
        username_login.setText("Previously registered");
        username_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_loginMouseClicked(evt);
            }
        });

        pass.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        pass.setText("PASSWORD:-");

        pass_login.setText("jPasswordField1");
        pass_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_loginMouseClicked(evt);
            }
        });

        signin_button.setText("Enter");
        signin_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_buttonMouseClicked(evt);
            }
        });

        clear_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear_button.setText("CLEAR");
        clear_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_buttonMouseClicked(evt);
            }
        });

        set.setText("__");

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("    SIGN-IN");

        signup_button.setText("SignUp...");
        signup_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_buttonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN-UP");

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Desired Username:-");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("PASSWORD:-");

        username_new.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        username_new.setForeground(new java.awt.Color(204, 204, 204));
        username_new.setText("Eg:-abc");
        username_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_newMouseClicked(evt);
            }
        });

        pass_new.setText("jPasswordField2");
        pass_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_newMouseClicked(evt);
            }
        });

        avl.setText("__");

        check_button.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        check_button.setText("Check Availality");
        check_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_buttonMouseClicked(evt);
            }
        });

        pr.setBackground(new java.awt.Color(153, 0, 51));
        pr.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        pr.setText("__");

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("RE-ENTER PASSWORD:-");

        pass2_new.setText("jPasswordField1");
        pass2_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass2_newMouseClicked(evt);
            }
        });

        mtch.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        mtch.setText("__");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        jLabel8.setText("Username/Password Policy:-  1. LENGTH SHOUD NOT BE GREATER THAN 8");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        jLabel9.setText("2. SPECIAL CHARACTERS LIKE '-'  '.'  ','  '+'  '-'  ';'  ':'  ARE NOT ALLOWED");

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cipher v1.0.0");

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 2, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright Reserved");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pass_new, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(pass2_new))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mtch, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signup_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(check_button)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(username_new, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_login, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pass_login)
                            .addComponent(signin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(pass_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signin_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtch, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pass2_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signup_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//check whether entered username is already present or not
    public void check_validity() {
        flag = 1;
        String x = username_new.getText();
        String y = new String(pass_new.getPassword());
        int cnt = 0;
        try {
            FileReader fin = new FileReader("Cipher_logs/Filenames");
            BufferedReader in = new BufferedReader(fin);

            String str;
            while ((str = in.readLine()) != null) {
                int ind = str.indexOf('+');
                String na = str.substring(0, ind);
                String pa = str.substring(ind + 1);
                name[cnt++] = na;
                password[cnt++] = pa;

            }
            in.close();

        } catch (Exception e) {
            System.err.println(e);
        }

        for (int i = 0; i < 10; i++) {
            if (x.equals(name[i])) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            avl.setText("Not Available");
        } else {
            avl.setText("Available");
        }
    }
    private void check_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_buttonMouseClicked
        // TODO add your handling code here:
        check_validity();

    }//GEN-LAST:event_check_buttonMouseClicked

    //function to check whether entered username is a valid one
    boolean check(String s) {
        int j, ln;
        ln = s.length();
        for (j = 0; j < ln; j++) {
            if (s.charAt(j) == '+' || s.charAt(j) == '\n') {
                return (false);
            } else if (ln > 8) {
                return (false);
            }
        }
        return (true);
    }

    private void signup_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_buttonMouseClicked
        // TODO add your handling code here:
        check_validity();
        if (count < 100) {
            try {
                String x = username_new.getText();
                String y = new String(pass_new.getPassword());
                String y2 = new String(pass2_new.getPassword());



                String fname = ("Cipher_logs/Filenames");
                FileWriter fw = new FileWriter(fname, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);

                if (flag == 1 && y.compareTo(y2) == 0 && check(y) == true && check(x) == true) {

                    pr.setText("Succesfully registerd");
                    mtch.setText("");
                    count++;
                    out.println(x + "+" + y);
                    out.close();
                } else {
                    if (y.compareTo(y2) != 0) {
                        mtch.setText("The Passwords do not match");
                    }
                    if (check(y) == false || check(x) == false) {
                        mtch.setText("Check format for username/password ");
                    }
                    pr.setText("Re-enter");
                    avl.setText("Please dont be stubborn");
                }
            } catch (Exception e) {
                pr.setText("ERROR!! Change File Permissions ");
            }
        } else {
            pr.setText("Memory full !!");
            avl.setText("No more Registrations :(");
        }
    }//GEN-LAST:event_signup_buttonMouseClicked

    private void clear_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_buttonMouseClicked
        // TODO add your handling code here:
        username_login.setText("");
        pass_login.setText("");
        username_new.setText("");
        pass_new.setText("");
        set.setText("__");
        avl.setText("__");
        pr.setText("__");
    }//GEN-LAST:event_clear_buttonMouseClicked

    private void signin_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_buttonMouseClicked
        // TODO add your handling code here:

        int flg = -1;
        String xx = username_login.getText();
        String yy = new String(pass_login.getPassword());

        if (check(xx) == true && check(yy) == true) {
            try {
                FileReader fin = new FileReader("Cipher_logs/Filenames");
                BufferedReader in = new BufferedReader(fin);

                String str = "";
                while ((str = in.readLine()) != null) {
                    int ind = str.indexOf('+');
                    String na = str.substring(0, ind);
                    String pa = str.substring(ind + 1);
                    if (xx.equals(na) && yy.equals(pa)) {
                        flg = 1;
                    }
                }

                if (flg == -1) {
                    set.setText("Check Username/Password");
                } else {
                    user = xx;
                    set.setText("Login Succesfull");

                    dispose();
                    new MainFrame(user).setVisible(true);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            if (check(xx) == false) {
                set.setText("Check format for username/password ");
            }
            if (check(xx) == false) {
                set.setText("Check format for username/password ");
            }
        }
    }//GEN-LAST:event_signin_buttonMouseClicked

    private void username_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_newMouseClicked
        // TODO add your handling code here:
        username_new.setText("");
    }//GEN-LAST:event_username_newMouseClicked

    private void pass_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_newMouseClicked
        // TODO add your handling code here:
        pass_new.setText("");
    }//GEN-LAST:event_pass_newMouseClicked

    private void pass_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_loginMouseClicked
        // TODO add your handling code here:
        pass_login.setText("");
    }//GEN-LAST:event_pass_loginMouseClicked

    private void username_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_loginMouseClicked
        // TODO add your handling code here:
        username_login.setText("");
    }//GEN-LAST:event_username_loginMouseClicked

    private void pass2_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2_newMouseClicked
        // TODO add your handling code here:
        pass2_new.setText("");
    }//GEN-LAST:event_pass2_newMouseClicked

    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avl;
    private javax.swing.JButton check_button;
    private javax.swing.JButton clear_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel mtch;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField pass2_new;
    private javax.swing.JPasswordField pass_login;
    private javax.swing.JPasswordField pass_new;
    private javax.swing.JLabel pr;
    private javax.swing.JLabel set;
    private javax.swing.JButton signin_button;
    private javax.swing.JButton signup_button;
    private javax.swing.JTextField username_login;
    private javax.swing.JTextField username_new;
    private javax.swing.JLabel usr;
    // End of variables declaration//GEN-END:variables
}
