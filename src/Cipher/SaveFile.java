
package Cipher;

import java.io.*;

public class SaveFile extends javax.swing.JFrame {

   public static  int cnt=0;
   public static String user, level, text_content;
   public SaveFile(String us, String lev, String text) {
        initComponents();
        user=us;
        level=lev;
        text_content=text;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        ok_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        alert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Enter File Name:-");

        ok_button.setText("OK");
        ok_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_buttonMouseClicked(evt);
            }
        });

        back_button.setText("Back to Editor");
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        alert.setText("___");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alert)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ok_button)
                                .addGap(18, 18, 18)
                                .addComponent(back_button)))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_button)
                    .addComponent(back_button))
                .addGap(18, 18, 18)
                .addComponent(alert)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_back_buttonMouseClicked
    
    //valiadate filename
    static boolean check(String st) {
        int l=st.length(), fl=0;
        
        for(int i=0;i<l;i++) {
            char ch=st.charAt(i);
            if(ch=='+') {
                fl=1;
                break;
            }
        }
        if(!"".equals(st) && l>0 && l<=5 && fl==0)
            return(true);
        else
            return(false);
    }
    
    
    private void ok_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_buttonMouseClicked
        // TODO add your handling code here:
        String s=name_text.getText();
        
        try {
                String fname=("D:/Cipher/"+user+"_files.txt");
                FileWriter fw=new FileWriter(fname,true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter out=new PrintWriter(bw);
                out.println(s+'+'+user+'+'+level);
                out.close();
            } catch(Exception e){
                alert.setText("ERROR!!Change settings");
            }
        
        if(check(s)) {    
            int f=0,c=0; 
            String fin=s+'+'+user+'+'+level;
            try {
                String fname=("D:/Cipher/"+fin+".txt");
                FileWriter fw=new FileWriter(fname,true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter out=new PrintWriter(bw);
                out.println(text_content);
                out.close();
            } catch(Exception e){
                alert.setText("ERROR!!Change settings");
            }
            dispose();
        }
        else
            alert.setText("Invalid Filename");
        
    }//GEN-LAST:event_ok_buttonMouseClicked

    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SaveFile(user, level, text_content).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name_text;
    private javax.swing.JButton ok_button;
    // End of variables declaration//GEN-END:variables
}
