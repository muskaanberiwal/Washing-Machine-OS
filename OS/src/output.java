
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author muskaan
 */
public class output extends javax.swing.JFrame {

    /**
     * Creates new form output
     */
    public output(String type_,int qty,double wt,String id,boolean flag) {
        initComponents();
        this.getContentPane().setBackground(new Color(15, 173, 202));
        this.setSize(750, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);
        tf5.setText(type_);
        tf1.setText(""+wt+" kgs");
        type_label.setVisible(false);
        type_label.setText(type_);
        wt_label1.setVisible(false);
        wt_label1.setText(""+wt);
        id_label.setText(id);
        id_label.setVisible(false);
        flag_rb.setVisible(false);
        flag_rb.setSelected(flag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        type_label = new javax.swing.JLabel();
        wt_label1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        id_label = new javax.swing.JLabel();
        flag_rb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Temperature");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Spin Frequency");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Duration");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Wash Settings");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 190, 30));

        tf2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 150, 30));

        tf3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 150, 30));

        tf4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 150, 30));

        tf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Weight");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 190, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Type of clothes");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 190, 30));

        tf5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 150, 30));
        getContentPane().add(type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 80, 20));
        getContentPane().add(wt_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Energy required");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 190, 30));

        tf6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });
        getContentPane().add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wm.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 450, 280));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Start wash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 150, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Add user");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 150, 40));
        getContentPane().add(id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        getContentPane().add(flag_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
double energy;

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
File file=new File("C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\file.csv");
if(file.exists()==false){
try
{
    FileWriter writer=new FileWriter(file);
    writer.append("ID,Type,Weight,Temperature,Spin Frequency,Duration,Energy Required,Date,Time\n");
    writer.close();
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
}

        int temp=0;
int spin=0;
int dur=0;
double wt=Double.parseDouble(wt_label1.getText());
if(type_label.getText().equals("Cotton"))
{
    temp=40;
    spin=1400;
    if(wt>=2.0 || wt<=4.0)
        dur=20;
    if(wt>4.0 || wt<=6.0)
        dur=25;
    if(wt>6.0 || wt<=8.0)
        dur=30;
    if(wt>8.0 || wt<=10.0)
        dur=35;
}
if(type_label.getText().equals("Wool"))
{
    temp=20;
    spin=1000;
    if(wt>=2.0 || wt<=4.0)
        dur=15;
    if(wt>4.0 || wt<=6.0)
        dur=20;
    if(wt>6.0 || wt<=8.0)
        dur=25;
    if(wt>8.0 || wt<=10.0)
        dur=30;

}
if(type_label.getText().equals("Delicates"))
{
    temp=15;
    spin=600;
    if(wt>=2.0 || wt<=4.0)
        dur=10;
    if(wt>4.0 || wt<=6.0)
        dur=12;
    if(wt>6.0 || wt<=8.0)
        dur=14;
    if(wt>8.0 || wt<=10.0)
        dur=16;
}
if(type_label.getText().equals("Sports"))
{
    temp=25;
    spin=800;
    if(wt>=2.0 || wt<=4.0)
        dur=25;
    if(wt>4.0 || wt<=6.0)
        dur=30;
    if(wt>6.0 || wt<=8.0)
        dur=35;
    if(wt>8.0 || wt<=10.0)
        dur=40;
}
if(type_label.getText().equals("Synthetics"))
{
    temp=30;
    spin=1300;
    if(wt>=2.0 || wt<=4.0)
        dur=22;
    if(wt>4.0 || wt<=6.0)
        dur=26;
    if(wt>6.0 || wt<=8.0)
        dur=30;
    if(wt>8.0 || wt<=10.0)
        dur=34;
}

energy=spin*0.4+temp*15+dur*10;
tf2.setText(""+temp+" degrees");
tf4.setText(""+dur+" minutes");
tf3.setText(""+spin+" rpm");
tf6.setText(""+energy+" Watts");
DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
   LocalDateTime now = LocalDateTime.now();
   String date=df.format(now);
   String time=tf.format(now);
try
{
    FileWriter writer=new FileWriter(file,true);
    writer.append(""+tf5.getText()+","+wt+","+temp+","+spin+","+dur+","+energy+","+date+","+time+"\n");
    writer.close();
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}

// TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(flag_rb.isSelected()==false){
        String ID=id_label.getText();
        String url = "jdbc:sqlite:C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\washing_database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql = "INSERT INTO processes VALUES('" + ID + "'," + energy + ");";
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Successfully added");
            JOptionPane.showMessageDialog(null, "You have been succesfully registered");
            this.dispose();
            new process().setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}
else
{
    String ID=id_label.getText();
        String url = "jdbc:sqlite:C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\washing_database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql = "INSERT INTO waiting VALUES('" + ID + "'," + energy + ");";
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Successfully added");
            JOptionPane.showMessageDialog(null, "You have been succesfully registered");
            this.dispose();
            new process().setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(flag_rb.isSelected()==false){
        String ID=id_label.getText();
        String url = "jdbc:sqlite:C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\washing_database.db";
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection(url);
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        String sql = "INSERT INTO processes VALUES('" + ID + "'," + energy + ");";
        try 
        {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Successfully added");
            JOptionPane.showMessageDialog(null, "You have been succesfully registered");
            this.dispose();
            new login().setVisible(true);
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
}
else
{
    String ID=id_label.getText();
        String url = "jdbc:sqlite:C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\washing_database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql = "INSERT INTO waiting VALUES('" + ID + "'," + energy + ");";
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Successfully added");
            JOptionPane.showMessageDialog(null, "You have been succesfully registered");
            this.dispose();
            new login().setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String type_="";
        int qty=0;
        String id="";
        double wt=0.0;
        boolean flag=false;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new output(type_,qty,wt,id,flag).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton flag_rb;
    private javax.swing.JLabel id_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JLabel type_label;
    private javax.swing.JLabel wt_label1;
    // End of variables declaration//GEN-END:variables
}
