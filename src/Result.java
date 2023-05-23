/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Result.java
 *
 * Created on feb 10, 2013, 12:38:39 AM
 */

/**
 *
 * @author megha
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
public class Result extends javax.swing.JFrame {
    float result;
    String ID;
    /** Creates new form Result */
    public Result() {
        initComponents();
    }
    public Result(float res, String id)
    {
        initComponents();
        result = res;
        ID = id;
        Score.setText(res + "%");
        try {

            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "123");
            Statement stmt = conn.createStatement();
            String sql = "select * from Result where ID = '" + ID + "'";
            ResultSet rs = stmt.executeQuery(sql);
            Object[] newrow = new Object[5];
            newrow[0] = "MAX MARKS";
            rs.next();
            for(int i=1; i<=2;i++) {
                newrow[i] = rs.getString(i+1);
            }
            DefaultTableModel tm = (DefaultTableModel)scoreTBL.getModel();
            tm.addRow(newrow);
        }
         catch (Exception e) { JOptionPane.showMessageDialog(null,"" + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreTBL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BackBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result Time");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YOUR SCORE :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        Score.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 0));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, 40));

        scoreTBL.setBackground(new java.awt.Color(246, 236, 249));
        scoreTBL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(255, 0, 255)));
        scoreTBL.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        scoreTBL.setForeground(new java.awt.Color(0, 0, 204));
        scoreTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SUBJECT", "IT", "GK"}
            },
            new String [] {
                "", "", ""
            }
        ));
        scoreTBL.setOpaque(false);
        scoreTBL.setRowHeight(36);
        jScrollPane1.setViewportView(scoreTBL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 530, 80));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESULT TIME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        BackBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        BackBTN.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        BackBTN.setForeground(new java.awt.Color(255, 102, 0));
        BackBTN.setText("<HTML><PRE>TAKE ANOTHER<BR>    QUIZ</PRE></HTML>");
        BackBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        BackBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 150, 50));

        exitBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        exitBTN.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 102, 0));
        exitBTN.setText("EXIT");
        exitBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 90, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        new Menu(ID).setVisible(true);
        this.setVisible(false);
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "123");
            Statement stmt = conn.createStatement();
            String sql;
            sql = "update result set ipresult = '0', gkresult = '0' where id ='" + ID + "';";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            }
        catch( Exception e)
        {
             JOptionPane.showMessageDialog(null,"" + e);
        }
}//GEN-LAST:event_BackBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
           this.dispose();
           try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "123");
            Statement stmt = conn.createStatement();
            String sql;
            sql = "update result set ipresult = '0', gkresult = '0' where id ='" + ID + "';";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            }
        catch( Exception e)
        {
             JOptionPane.showMessageDialog(null,"" + e);
        }
}//GEN-LAST:event_exitBTNActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JLabel Score;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scoreTBL;
    // End of variables declaration//GEN-END:variables

}
