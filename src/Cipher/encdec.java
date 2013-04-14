//Project Cipher by KURMI && SOUMYADEEP..

package javaapplication2;

import java.awt.event.MouseEvent;
import javax.swing.*;

public class encdec extends javax.swing.JFrame {

    public JTextField fld;
    public static String store="", usernames[], user, lev;
    public encdec(String us,String nm[]) 
    {
      
        initComponents();
        usernames=nm;
        user=us;
        a.setText(us);
        for(int i=0;i<100;i++)
            System.out.println(usernames[i]);
        
        
    }
   
    void encodeone()
    {
        String a=inp.getText();
        String c="",b="";
        int i,l;
        l=a.length();
        a=a.toUpperCase();
        for(i=0;i<l;i++)
        {
            char ch=a.charAt(i);
            c+=String.valueOf((int)ch);
        }
        for(i=0;i<c.length();i++)
        {
            char ch=c.charAt(i);
            b=String.valueOf(ch)+b;
        }
        opt.setText(b);
    }
    
    void decodeone()
    {
        String a=inp.getText();
        String rev="",b="",nw="";
        int l,i,fl=0,x;
        char ch;
        l=a.length();
        for(i=l-1;i>=0;i--)
        {
            ch=a.charAt(i);
            rev+=String.valueOf(ch);
        }
        for(i=0;i<l;)
        {
            x=Integer.parseInt(rev.substring(i,i+2));
            if ((x>=97 && x<=99) || (x>=32 || x<=90) )
                i+=2;
            else if(x>=100 && x<=125)
            {
                b=rev.substring(i,i+3);
                x=Integer.parseInt(b);
                i+=3;
            }
            nw+=String.valueOf((char)x);
        }
        opt.setText(nw);
    }
    
    void encodetwo()
    {
        String at=inp.getText();
        int lenn=at.length();
        int ind=at.indexOf('#');
        String a=at.substring(0,ind);
        int pc=Integer.parseInt(at.substring((ind+1),lenn));
        int x=pc,y=pc,c=0,len,r,mr,i,j,cn=0;
        String str="";
        char ch=' ';
        len=a.length();
        while(x>0)
        {
            x/=10;
            c++;
        }
        r=(len%c==0)?(len/c):((len/c)+1);
        String ar[][]=new String[r][c];
        for(i=0;i<r;i++)
        for(j=0;j<c;j++)
            ar[i][j]="00";
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(cn<len)
                {
                    ch=a.charAt(cn++);
                    if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
                    ar[i][j]=String.valueOf(ch);
                    else
                    ar[i][j]=String.valueOf((int)ch);
                }
            }
        }
        while(y>0)
        {
            mr=(y%10)-1;
            for(i=0;i<r;i++)
            str+=ar[i][mr];
            y/=10;
        }//END OF WHILE
        String xxx=str+"#"+pc;
        opt.setText(xxx);
    }
    
    void decodetwo()
    {
        String a=inp.getText();
        int i,ind,r,c,len,cn=0,j,cl,l,as,x=0;
        String pc,st,strnw="",yx="";
        char ch,chr;
        len=a.length();
        ind=a.indexOf('#');
        st=a.substring(0,ind);
        pc=a.substring((ind+1),len);
        l=st.length();
        for(i=0;i<l;i++)
        {
            int cx=(int)st.charAt(i);
            if(cx>=48 && cx<=57)
            {   
                yx+=String.valueOf((char)Integer.parseInt(st.substring(i,i+2)));
                i++;
            }
                else
                yx+=String.valueOf(st.charAt(i));
        }
        l=yx.length();
        c=pc.length();
        r=(l/c);
        String ar[][]=new String[r][c];
        for(i=c-1;i>=0;i--)
        {
            ch=pc.charAt(i);
            cl=Integer.parseInt(String.valueOf(ch));
            for(j=0;j<r;j++)
                ar[j][cl-1]=String.valueOf(yx.charAt(cn++));
                
        }
            for(i=0;i<r;i++)
            for(j=0;j<c;j++)
            strnw+=ar[i][j];
            opt.setText(strnw);
    }
    
    void encodethree()
    {
        String st=inp.getText();
        int len=st.length(); int h=len;
        for(int u=0;u <3-(len%3); u++)
            st+=".";
         len=st.length();
         //System.out.println(h+"  "+st+" "+len);
        String xx="",nw="";
        char bsvalue[]={'A',  'B',  'C',  'D',  'E',  'F',  'G',
                        'H',  'I',  'J',  'K',  'L',  'M',  'N',
                        'O',  'P',  'Q',  'R',  'S',  'T',  'U', 
                        'V',  'W',  'X',  'Y',  'Z',
                        'a',  'b',  'c',  'd',  'e',  'f',  'g',
                        'h',  'i',  'j',  'k',  'l',  'm',  'n',
                        'o',  'p',  'q',  'r',  's',  't',  'u', 
                        'v',  'w',  'x',  'y',  'z',
                        '0',  '1',  '2',  '3',  '4',  '5', 
                        '6',  '7',  '8',  '9',  '.',  ','};
                        

        for(int i=0;i<len;i++)
        {
            char ch=st.charAt(i);
            int as=(int)ch;
            int ar[]={0,0,0,0,0,0,0,0},cn=7;
            while(as>0)
            {
                ar[cn--]=as%2;
                as/=2;
            }
            for(int j=0;j<8;j++)
                xx+=String.valueOf(ar[j]);
            nw+=xx;
            xx="";
        }
        String conv="";
        int ln=nw.length(),b=ln%6;
        for(int u=0;u<=b+1;u++)
            nw="0"+nw;
            ln+=b+2;
            int k=ln;
        for(;k>=5;k-=6)
        {
            String jj=nw.substring(k-6,k);
            int mm=Integer.valueOf(jj);
            int cnn=0,sm=0,r;
            while(mm>0)
            {
                r=mm%10;
                sm+=((int)Math.pow(2,cnn++))*r;
                mm/=10;
            }
            conv=String.valueOf(bsvalue[sm])+conv;
        }
        opt.setText(conv);
    }
    
    void decodethree()
    {
        
        String s=inp.getText();
        int l=s.length();
        char bsvalue[]={'A',  'B',  'C',  'D',  'E',  'F',  'G',
                        'H',  'I',  'J',  'K',  'L',  'M',  'N',
                        'O',  'P',  'Q',  'R',  'S',  'T',  'U', 
                        'V',  'W',  'X',  'Y',  'Z',
                        'a',  'b',  'c',  'd',  'e',  'f',  'g',
                        'h',  'i',  'j',  'k',  'l',  'm',  'n',
                        'o',  'p',  'q',  'r',  's',  't',  'u', 
                        'v',  'w',  'x',  'y',  'z',
                        '0',  '1',  '2',  '3',  '4',  '5', 
                        '6',  '7',  '8',  '9',  '.',  ','};
       
       String xx="",nw="";
       for(int j=0;j<l;j++)
       {
           int i=0;
           char ch=s.charAt(j);
           for(i=0;i<64;i++)
           {
               if(bsvalue[i]==ch)
               break;
           }
           int as=i;
           int ar[]={0,0,0,0,0,0},cn=5;
           while(as>0)
           {
               ar[cn--]=as%2;
               as/=2;
           }
           for(int k=0;k<6;k++)
               xx+=String.valueOf(ar[k]);
           nw+=xx;
           xx="";
       }
       String conv="";
       nw+="9";
       int ln=nw.length(),b=(ln-1)%8;
        for(int u=0;u<b;u++)
            nw="0"+nw;
       for(int k=ln-1;k>=7;k-=8)
       {
           int mm=Integer.valueOf(nw.substring(k-8,k));
           int cnn=0,sm=0,r;
           while(mm>0)
           {
               r=mm%10;
               sm+=((int)Math.pow(2,cnn++))*r;
               mm/=10;
           }
           conv=String.valueOf((char)sm)+conv;
       }
       opt.setText(conv);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        inp = new javax.swing.JTextArea();
        one = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        three = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        opt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        prw = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        box = new javax.swing.JComboBox();
        a = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        open = new javax.swing.JList();
        f = new javax.swing.JLabel();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenuItem4.setText("jMenuItem4");

        jPopupMenu2.setOpaque(false);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        inp.setColumns(20);
        inp.setRows(5);
        inp.setText("ENTER TEXT");
        jScrollPane1.setViewportView(inp);

        buttonGroup1.add(one);
        one.setText("Easy");
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });

        buttonGroup1.add(two);
        two.setText("Medium");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });

        buttonGroup1.add(three);
        three.setText("Hard");
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });

        opt.setColumns(20);
        opt.setRows(5);
        opt.setText("EDITED TEXT");
        jScrollPane2.setViewportView(opt);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jLabel2.setText("An S-K COLLABORATION");

        prw.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        prw.setText("Preview:-");

        level.setFont(new java.awt.Font("Tempus Sans ITC", 0, 32)); // NOI18N
        level.setText("______");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("ALERT:- THIS VERSION DOESNT CONSIST FILE-HANDLING TECHNIQUES,");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("\"Open\" & \"Save\" buttons are not yet active.");

        jSeparator3.setForeground(new java.awt.Color(51, 51, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 20));

        box.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Encrypt", "Decrypt" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        a.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a.setText("____");

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jLabel1.setText("Welcome,");

        open.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(open);

        f.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        f.setText("                                     ");

        jMenuBar6.setPreferredSize(new java.awt.Dimension(56, 30));

        jMenu11.setText("File");
        jMenu11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jMenu11.setPreferredSize(new java.awt.Dimension(50, 19));

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem2);

        jMenuItem7.setText("New");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseClicked(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenuBar6.add(jMenu11);

        jMenu12.setText("Edit                                                                      ");
        jMenu12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jMenu12.setPreferredSize(new java.awt.Dimension(500, 19));

        jMenuItem3.setText("Copy");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem3);

        jMenuItem5.setText("Cut");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem5);

        jMenuItem6.setText("Paste");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem6);

        jMenuBar6.add(jMenu12);

        jMenu3.setText("User");
        jMenu3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        jMenuItem9.setText("Help");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem8.setText("Logout");
        jMenuItem8.setName("l");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar6.add(jMenu3);

        setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prw, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(one)
                                .addGap(147, 147, 147)
                                .addComponent(two)
                                .addGap(135, 135, 135)
                                .addComponent(three)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(three)
                    .addComponent(two)
                    .addComponent(one)
                    .addComponent(f))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(level))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prw)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        // TODO add your handling code here:
        lev="easy";
        inp.setLineWrap(true);
        level.setText("Level- EASY ");
        inp.setText("Supports all characters \n:) \n\n Well almost all ;)..");
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
        lev="med";
        inp.setLineWrap(true);
        level.setText("Level- MEDIUM ");
        inp.setText("Enter message with policy number. \n Format:- I am a boy#1432 "
                + "\n POLICY NUMBER SHOULD BE OF DIGITS WIHOUT REPETATION WITHIN THE  LENGTH OF THE POLICY NUMBER."
                + "\nEg- 312, 4321, 15423 etc");
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        // TODO add your handling code here:
        lev="hard";
        inp.setLineWrap(true);
        inp.setText("Note:- Supports only numbers and letters.");
    }//GEN-LAST:event_threeMouseClicked

    private void jMenuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseClicked
        // TODO add your handling code here:
        inp.setText("");
        opt.setText("");
        level.setText("_________");
    }//GEN-LAST:event_jMenuItem7MouseClicked

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
        int slct=box.getSelectedIndex();
        opt.setLineWrap(true);
        if(slct==0)
        {
            
            prw.setText("Encryted Text is:-");
        if(one.isSelected())
            encodeone();
        if(two.isSelected())
            encodetwo();
        if(three.isSelected())
            encodethree();
        }
        
        else
        {
            prw.setText("Decryted Text is:-");
        if(one.isSelected())
            decodeone();
        if(two.isSelected())
            decodetwo();
        if(three.isSelected())
            decodethree();
        }
    }//GEN-LAST:event_boxActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        inp.setText("");
        opt.setText("");
        level.setText("_________");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        store=inp.getSelectedText();
        if(store==null)
            store=opt.getSelectedText();
        
        else
            store=inp.getSelectedText();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    


    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
        
        store=inp.getSelectedText();
        if(store==null)
        {
            store=opt.getSelectedText();
            opt.setText("");
        }
        
        else
        {
            store=inp.getSelectedText();
            inp.setText("");
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public void mouseEntered(MouseEvent e)
    {
        fld = (JTextField) e.getSource();
    }
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
      
            
            fld.setText(store);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new file(user, usernames, "save", lev).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        f.setText("Select file to be opened:-");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new help(usernames, user).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    
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
            java.util.logging.Logger.getLogger(encdec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encdec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encdec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encdec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JComboBox box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel f;
    private javax.swing.JTextArea inp;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel level;
    private javax.swing.JRadioButton one;
    private javax.swing.JList open;
    private javax.swing.JTextArea opt;
    private javax.swing.JLabel prw;
    private javax.swing.JRadioButton three;
    private javax.swing.JRadioButton two;
    // End of variables declaration//GEN-END:variables

    
    
}
