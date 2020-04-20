import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.getContentPane().setBackground(new Color(15, 173, 202));
        this.setSize(750, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pf1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, 30));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wm.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, 280));
        getContentPane().add(pf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 140, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 150, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton2.setText("New User?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String ID=t1.getText();
char[] password= pf1.getPassword();
String pass="";
String database_password ="";
for(int i =0;i<password.length;i++)
{
    pass=pass+password[i];
}
String url = "jdbc:sqlite:C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\washing_database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql = "SELECT password from members where id='"+ID+"'";
        try{
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            database_password = rs.getString("password") ;
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if(database_password.equals(pass))
        {
            JOptionPane.showMessageDialog(null,"Login successful");
            int n=JOptionPane.showConfirmDialog(null, "Would you like to see all previous washes?");
            if(n==0)
            {
                //take the user to view washes
                try{
                File file=new File("C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\file.csv");
                Desktop desktop = Desktop.getDesktop();
                if(file.exists()) desktop.open(file);
                else
                {
                    JOptionPane.showMessageDialog(null,"You are the first user!");
                }
                }
                catch(Exception e)
                {
                    System.out.println("Exception: "+e.getMessage());
                }
            }
            else
            {
                try{
                    File file=new File("C:\\Users\\HP\\Desktop\\Muskaan\\Notes\\Year 2\\Sem 4\\OS\\Project\\MY_OS\\file.csv");
                    if(file.exists()==true){
                    FileWriter writer =new FileWriter(file,true);
                    writer.append(""+ID+",");
                    writer.close();
                    }
                    else
                    {
                        FileWriter writer=new FileWriter(file);
                        writer.append("ID,Type,Weight,Temperature,Spin Frequency,Duration,Energy Required,Date,Time\n");
                        writer.append(""+ID+",");
                        writer.close();
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                this.dispose();
                new input(ID).setVisible(true);
            
            }
         }
        else
        {
            JOptionPane.showMessageDialog(null,"Login unsuccessful\nPlease enter valid ID and password");
            t1.setText(null);
            pf1.setText(null);

        }               // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new Register().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
   // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
