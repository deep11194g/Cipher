

package javaapplication2;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class login extends javax.swing.JFrame 
{
    public String user="";
    public String name[]=new String[100];
    public String password[]=new String[100];
    public int count;
    
    public login() 
    {
        initComponents();
        for(int i=0;i<10;i++)
        {
            name[i]="";
            password[i]="";
        }
        count=0;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usr = new javax.swing.JLabel();
        inusr = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        inpass = new javax.swing.JPasswordField();
        entr = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        set = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        upusr = new javax.swing.JTextField();
        uppass = new javax.swing.JPasswordField();
        avl = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pr = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        uppass2 = new javax.swing.JPasswordField();
        mtch = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usr.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        usr.setText("Username:-");

        inusr.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        inusr.setForeground(new java.awt.Color(204, 204, 204));
        inusr.setText("Previously registered");
        inusr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inusrMouseClicked(evt);
            }
        });

        pass.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        pass.setText("PASSWORD:-");

        inpass.setText("jPasswordField1");
        inpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inpassMouseClicked(evt);
            }
        });

        entr.setText("Enter");
        entr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrMouseClicked(evt);
            }
        });

        clr.setText("Clear");
        clr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrMouseClicked(evt);
            }
        });

        set.setText("__");

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("------LOGIN-----");

        jButton1.setText("SignUp...");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("-----NEW USER??-----");

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Desired Username:-");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("PASSWORD:-");

        upusr.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        upusr.setForeground(new java.awt.Color(204, 204, 204));
        upusr.setText("Eg:-abc");
        upusr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upusrMouseClicked(evt);
            }
        });

        uppass.setText("jPasswordField2");
        uppass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uppassMouseClicked(evt);
            }
        });

        avl.setText("__");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton2.setText("Check Availality");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        pr.setBackground(new java.awt.Color(153, 0, 51));
        pr.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        pr.setText("__");

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("RE-ENTER PASSWORD:-");

        uppass2.setText("jPasswordField1");
        uppass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uppass2MouseClicked(evt);
            }
        });

        mtch.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        mtch.setText("__");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        jLabel8.setText("Username/Password Policy:-  1. LENGTH SHOUD NOT BE GREATER THAN 8");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        jLabel9.setText("2. SPECIAL CHARACTERS LIKE '-'  '.'  ','  '+'  '-'  ';'  ':'  ARE NOT ALLOWED");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uppass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(upusr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(entr)
                                    .addComponent(inusr)
                                    .addComponent(inpass)
                                    .addComponent(uppass2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mtch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(inpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(entr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(clr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(upusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avl)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uppass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mtch, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uppass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int fl;

public void func()
{
    fl=1;
        String x=upusr.getText();
        String y=new String(uppass.getPassword());
        int cnt=0;
        try
            {
                FileReader fin=new FileReader("C:\\Windows\\ciphernames.txt");
                BufferedReader in=new BufferedReader(fin);
                
                String str="";
                while((str=in.readLine())!= null)
                {
                    int ind=str.indexOf('+');
                    String na=str.substring(0,ind);
                    String pa=str.substring(ind+1);
                    name[cnt++]=na;
                    password[cnt++]=pa;
                    
                }
                in.close();
                
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        
        for(int i=0;i<10;i++)
        {
            if(x.equals(name[i]))
            {
                fl=0;
                break;
            }
        }
        if(fl==0)
            avl.setText("Not Available");
        else
            avl.setText("Available");
}
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        func();
        
    }//GEN-LAST:event_jButton2MouseClicked
    
    boolean check(String s)
    {
        int j,ln;
        ln=s.length();
        for(j=0;j<ln;j++)
        {
            if(s.charAt(j)=='+' || s.charAt(j)=='\n')
                return(false);
            else if (ln>8)
                return(false);
            
        }
        return(true);
    }
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        func();
        if(count<100)
        {
            try
            {
                String x=upusr.getText();
                String y=new String(uppass.getPassword());
                String y2=new String(uppass2.getPassword());
                
                
                
                String fname=("C:\\Windows\\ciphernames.txt");
                FileWriter fw=new FileWriter(fname,true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter out=new PrintWriter(bw);
        
                 if(fl==1 && y.compareTo(y2)==0 && check(y)==true && check(x)==true)
                 {
                    
                    pr.setText("Succesfully registerd");
                    mtch.setText("");
                    count++;
                    out.println(x+"+"+y);
                    out.close();
                }
        
                else    
                {
                    if(y.compareTo(y2)!=0)
                        mtch.setText("The Passwords do not match");
                    if(check(y)==false || check(x)==false)
                        mtch.setText("Check format for username/password ");
                    pr.setText("Re-enter");
                    avl.setText("Please dont be stubborn");
                }
        
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        }
        else
        {
            pr.setText("Memory full !!");
            avl.setText("No more Registrations :(");
        }
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void clrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrMouseClicked
        // TODO add your handling code here:
        inusr.setText("");
        inpass.setText("");
        upusr.setText("");
        uppass.setText("");
        set.setText("__");
        avl.setText("__");
        pr.setText("__");
    }//GEN-LAST:event_clrMouseClicked

    private void entrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrMouseClicked
        // TODO add your handling code here:
        
        int flg=-1;
        String xx=inusr.getText();      
        String yy=new String(inpass.getPassword());
        
        if(check(xx)==true && check(yy)==true)
        {
            try
            {
                FileReader fin=new FileReader("C:\\Windows\\ciphernames.txt");
                BufferedReader in=new BufferedReader(fin);
                
                String str="";
                while((str=in.readLine())!= null)
                {
                    int ind=str.indexOf('+');
                    String na=str.substring(0,ind);
                    String pa=str.substring(ind+1);
                    if(xx.equals(na) && yy.equals(pa))
                        flg=1;
                }
                
                if(flg==-1)
                    set.setText("Check Username/Password");
                else
                {
                    user=xx;   
                    set.setText("Login Succesfull");
                    
                    dispose();
                    new encdec(user, name).setVisible(true);
                       
                }
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
            
        }
        else
        {
            if(check(xx)==false)
                set.setText("Check format for username/password ");
            if(check(xx)==false)
                set.setText("Check format for username/password ");
        }
    }//GEN-LAST:event_entrMouseClicked

    private void upusrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upusrMouseClicked
        // TODO add your handling code here:
        upusr.setText("");
    }//GEN-LAST:event_upusrMouseClicked

    private void uppassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uppassMouseClicked
        // TODO add your handling code here:
        uppass.setText("");
    }//GEN-LAST:event_uppassMouseClicked

    private void inpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inpassMouseClicked
        // TODO add your handling code here:
        inpass.setText("");
    }//GEN-LAST:event_inpassMouseClicked

    private void inusrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inusrMouseClicked
        // TODO add your handling code here:
        inusr.setText("");
    }//GEN-LAST:event_inusrMouseClicked

    private void uppass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uppass2MouseClicked
        // TODO add your handling code here:
        uppass2.setText("");
    }//GEN-LAST:event_uppass2MouseClicked

    
    
    public static void main(String args[]) 
    {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater (new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avl;
    private javax.swing.JButton clr;
    private javax.swing.JButton entr;
    private javax.swing.JPasswordField inpass;
    private javax.swing.JTextField inusr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mtch;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel pr;
    private javax.swing.JLabel set;
    private javax.swing.JPasswordField uppass;
    private javax.swing.JPasswordField uppass2;
    private javax.swing.JTextField upusr;
    private javax.swing.JLabel usr;
    // End of variables declaration//GEN-END:variables
}
