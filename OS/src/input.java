import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author muskaan
 */
public class input extends javax.swing.JFrame {

    /**
     * Creates new form input
     */
    public input(String id) {
        initComponents();
        this.getContentPane().setBackground(new Color(15, 173, 202));
        this.setSize(750, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        id_label.setText(id);
        id_label.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        sl1 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Input");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Enter quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 150, 40));

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wool", "Synthetics", "Cotton", "Sports", "Delicates" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Enter type of clothes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 190, 30));

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 50, 30));

        sl1.setMajorTickSpacing(5);
        sl1.setMaximum(50);
        sl1.setMinorTickSpacing(5);
        sl1.setPaintLabels(true);
        sl1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl1StateChanged(evt);
            }
        });
        getContentPane().add(sl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 280, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Time delay");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 150, 30));

        buttonGroup1.add(rb1);
        rb1.setText("No delay");
        getContentPane().add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setText("When energy consumption is lowest");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wm.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, 280));
        getContentPane().add(id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//CODE FOR I/O MANAGEMENT
double mul=0;
double wt;
boolean flag=false;
if(String.valueOf(cb1.getSelectedItem()).equals("Wool"))
    mul=1;
if(String.valueOf(cb1.getSelectedItem()).equals("Cotton"))
    mul=0.25;
if(String.valueOf(cb1.getSelectedItem()).equals("Delicates"))
    mul=0.5;
if(String.valueOf(cb1.getSelectedItem()).equals("Sports"))
    mul=0.4;
if(String.valueOf(cb1.getSelectedItem()).equals("Synthetics"))
    mul=0.75;
wt=mul*sl1.getValue();
if(wt>10)
    JOptionPane.showMessageDialog(null,"The drum is overloaded! Kindly remove some clothes!");
else if(wt<2)
    JOptionPane.showMessageDialog(null,"The drum is underloaded! Kindly put in some more clothes!");
else
{
    this.dispose();
    if(rb2.isSelected()==true)
    {
        flag=true;
    }
    else
        flag=false;
    new output(String.valueOf(cb1.getSelectedItem()),Integer.parseInt(l1.getText()),wt,id_label.getText(),flag).setVisible(true);
    //show output frame!!
}  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sl1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl1StateChanged
l1.setText(""+(sl1.getValue()));        // TODO add your handling code here:
    }//GEN-LAST:event_sl1StateChanged

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

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
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String id="";
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel id_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JSlider sl1;
    // End of variables declaration//GEN-END:variables
}
