/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofindeciclo;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson
 */
public class Formulasdefisica extends javax.swing.JFrame {

    /**
     * Creates new form Formulasdefisica
     */
    public Formulasdefisica() {
        initComponents();
        setTitle("FORMULAS DE FISICA 1.0 ");
        this.setLocationRelativeTo(null);
        
    }
     public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/image1.png"));
       return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgform = new javax.swing.ButtonGroup();
        jCPanel1 = new com.bolivia.panel.JCPanel();
        jPanel3 = new javax.swing.JPanel();
        jCPanel2 = new com.bolivia.panel.JCPanel();
        jrbfuerza = new javax.swing.JRadioButton();
        jrbmasa = new javax.swing.JRadioButton();
        rbaceleracion = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jCPanel3 = new com.bolivia.panel.JCPanel();
        jrbvelocidadinicial = new javax.swing.JRadioButton();
        jrbvelocidadfinal = new javax.swing.JRadioButton();
        jrbaceleracion = new javax.swing.JRadioButton();
        jrbtiempo = new javax.swing.JRadioButton();
        btrsalir = new org.edisoncor.gui.button.ButtonRound();
        btringresar = new org.edisoncor.gui.button.ButtonRound();
        btracerca = new org.edisoncor.gui.button.ButtonRound();
        jPanel1 = new javax.swing.JPanel();
        jrbsumadegaus = new javax.swing.JRadioButton();
        jrbarea = new javax.swing.JRadioButton();
        jrbvolumen = new javax.swing.JRadioButton();
        jCPanel4 = new com.bolivia.panel.JCPanel();
        jCPanel5 = new com.bolivia.panel.JCPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jCPanel1.setdarker(false);
        jCPanel1.setFirstColor(new java.awt.Color(204, 204, 255));
        jCPanel1.setSecondColor(new java.awt.Color(255, 255, 255));
        jCPanel1.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);
        jCPanel1.setVisibleLogo(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ELIJA UNA OPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jCPanel2.setdarker(false);
        jCPanel2.setFirstColor(new java.awt.Color(204, 204, 255));
        jCPanel2.setSecondColor(new java.awt.Color(255, 255, 255));
        jCPanel2.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);
        jCPanel2.setVisibleLogo(false);

        jbgform.add(jrbfuerza);
        jrbfuerza.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbfuerza.setForeground(new java.awt.Color(0, 51, 153));
        jrbfuerza.setText("FUERZA");

        jbgform.add(jrbmasa);
        jrbmasa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbmasa.setForeground(new java.awt.Color(0, 51, 153));
        jrbmasa.setText("MASA");

        jbgform.add(rbaceleracion);
        rbaceleracion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbaceleracion.setForeground(new java.awt.Color(0, 51, 153));
        rbaceleracion.setText("ACELERACION");

        javax.swing.GroupLayout jCPanel2Layout = new javax.swing.GroupLayout(jCPanel2);
        jCPanel2.setLayout(jCPanel2Layout);
        jCPanel2Layout.setHorizontalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbaceleracion)
                    .addComponent(jrbmasa)
                    .addComponent(jrbfuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jCPanel2Layout.setVerticalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jrbfuerza)
                .addGap(18, 18, 18)
                .addComponent(jrbmasa)
                .addGap(18, 18, 18)
                .addComponent(rbaceleracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jCPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 170));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ELIJA UNA OPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jCPanel3.setdarker(false);
        jCPanel3.setFirstColor(new java.awt.Color(204, 204, 255));
        jCPanel3.setSecondColor(new java.awt.Color(255, 255, 255));
        jCPanel3.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);
        jCPanel3.setVisibleLogo(false);

        jbgform.add(jrbvelocidadinicial);
        jrbvelocidadinicial.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbvelocidadinicial.setForeground(new java.awt.Color(0, 51, 153));
        jrbvelocidadinicial.setText("VELOCIDAD INICIAL");

        jbgform.add(jrbvelocidadfinal);
        jrbvelocidadfinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbvelocidadfinal.setForeground(new java.awt.Color(0, 51, 153));
        jrbvelocidadfinal.setText("VELOCIDAD FINAL");
        jrbvelocidadfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbvelocidadfinalActionPerformed(evt);
            }
        });

        jbgform.add(jrbaceleracion);
        jrbaceleracion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbaceleracion.setForeground(new java.awt.Color(0, 51, 153));
        jrbaceleracion.setText("ACELERACION");

        jbgform.add(jrbtiempo);
        jrbtiempo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbtiempo.setForeground(new java.awt.Color(0, 51, 153));
        jrbtiempo.setText("TIEMPO");

        javax.swing.GroupLayout jCPanel3Layout = new javax.swing.GroupLayout(jCPanel3);
        jCPanel3.setLayout(jCPanel3Layout);
        jCPanel3Layout.setHorizontalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbaceleracion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbtiempo)
                    .addComponent(jrbvelocidadfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbvelocidadinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jCPanel3Layout.setVerticalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel3Layout.createSequentialGroup()
                .addComponent(jrbtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbaceleracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jrbvelocidadfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbvelocidadinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.add(jCPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 210, 210));

        btrsalir.setBackground(new java.awt.Color(204, 204, 255));
        btrsalir.setForeground(new java.awt.Color(0, 51, 153));
        btrsalir.setText("SALIR");
        btrsalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btrsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrsalirActionPerformed(evt);
            }
        });

        btringresar.setBackground(new java.awt.Color(204, 204, 255));
        btringresar.setForeground(new java.awt.Color(0, 51, 153));
        btringresar.setText("INGRESAR");
        btringresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btringresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btringresarActionPerformed(evt);
            }
        });

        btracerca.setBackground(new java.awt.Color(204, 204, 255));
        btracerca.setForeground(new java.awt.Color(0, 51, 153));
        btracerca.setText("ACERA DE");
        btracerca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btracerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btracercaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbgform.add(jrbsumadegaus);
        jrbsumadegaus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbsumadegaus.setForeground(new java.awt.Color(0, 51, 153));
        jrbsumadegaus.setText("SUMA GAUSIANA");
        jPanel1.add(jrbsumadegaus, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 55, 190, -1));

        jbgform.add(jrbarea);
        jrbarea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbarea.setForeground(new java.awt.Color(0, 51, 153));
        jrbarea.setText("AREA DEL TRIANGULO");
        jPanel1.add(jrbarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 110, 190, 30));

        jbgform.add(jrbvolumen);
        jrbvolumen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbvolumen.setForeground(new java.awt.Color(0, 51, 153));
        jrbvolumen.setText("VOLUMEN DEL CILINDRO");
        jPanel1.add(jrbvolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 175, -1, 30));

        jCPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ELIJA UNA OPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jCPanel4.setdarker(false);
        jCPanel4.setFirstColor(new java.awt.Color(204, 204, 255));
        jCPanel4.setSecondColor(new java.awt.Color(255, 255, 255));
        jCPanel4.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);
        jCPanel4.setVisibleLogo(false);

        javax.swing.GroupLayout jCPanel4Layout = new javax.swing.GroupLayout(jCPanel4);
        jCPanel4.setLayout(jCPanel4Layout);
        jCPanel4Layout.setHorizontalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        jCPanel4Layout.setVerticalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        jPanel1.add(jCPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 260));

        javax.swing.GroupLayout jCPanel1Layout = new javax.swing.GroupLayout(jCPanel1);
        jCPanel1.setLayout(jCPanel1Layout);
        jCPanel1Layout.setHorizontalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btrsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btringresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btracerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jCPanel1Layout.setVerticalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btringresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btracerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btrsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jCPanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fisica.jpg"))); // NOI18N
        jCPanel5.setUseMode(com.bolivia.panel.USEMODE.IMAGE_TRANSPARENCY);
        jCPanel5.setVisibleLogo(false);

        javax.swing.GroupLayout jCPanel5Layout = new javax.swing.GroupLayout(jCPanel5);
        jCPanel5.setLayout(jCPanel5Layout);
        jCPanel5Layout.setHorizontalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jCPanel5Layout.setVerticalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jCPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jCPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbvelocidadfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbvelocidadfinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbvelocidadfinalActionPerformed

    private void btringresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btringresarActionPerformed
        // TODO add your handling code here:
        if(jrbaceleracion.isSelected()){
            Aceleracion ObjForm =new Aceleracion();
            ObjForm.setVisible(true);
            dispose();
        }else{
            if(jrbarea.isSelected()){
                Areatriangulo ObjForm =new Areatriangulo();
                ObjForm.setVisible(true);
                dispose();
            }else{
                if(jrbfuerza.isSelected()){
                    Fuerza ObjForm =new Fuerza();
                    ObjForm.setVisible(true);
                    dispose();
                }else{
                    if(jrbsumadegaus.isSelected()){
                        Sumadegauss ObjForm =new Sumadegauss();
                        ObjForm.setVisible(true);
                        dispose();
                    }else{
                        if(jrbtiempo.isSelected()){
                            Tiempo ObjForm =new Tiempo();
                            ObjForm.setVisible(true);
                            dispose();
                        }else{
                            if(jrbvelocidadfinal.isSelected()){
                                Velocidadfinal ObjForm =new Velocidadfinal();
                                ObjForm.setVisible(true);
                                dispose();
                            }else{
                                if(jrbvelocidadinicial.isSelected()){
                                    Velocidadinicial ObjForm =new Velocidadinicial();
                                    ObjForm.setVisible(true);
                                    dispose();
                                }else{
                                    if(jrbvolumen.isSelected()){
                                        Volumencilindro ObjForm =new Volumencilindro();
                                        ObjForm.setVisible(true);
                                        dispose();
                                    }else{
                                        if(rbaceleracion.isSelected()){
                                            AceleracionF ObjForm = new AceleracionF();
                                            ObjForm.setVisible(true);
                                            dispose();
                                        }else{
                                            if(jrbmasa.isSelected()){
                                                Masa ObjForm = new Masa();
                                                ObjForm.setVisible(true);
                                                dispose();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btringresarActionPerformed

    private void btrsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrsalirActionPerformed
        // TODO add your handling code here:
        dispose();
        JOptionPane.showMessageDialog(this, "Gracias por usar el programa");
    }//GEN-LAST:event_btrsalirActionPerformed

    private void btracercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btracercaActionPerformed
        // TODO add your handling code here:
        if (btracerca == btracerca) {
            Acerca ObjForm = new Acerca();
            ObjForm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btracercaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulasdefisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulasdefisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulasdefisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulasdefisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulasdefisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound btracerca;
    private org.edisoncor.gui.button.ButtonRound btringresar;
    private org.edisoncor.gui.button.ButtonRound btrsalir;
    private com.bolivia.panel.JCPanel jCPanel1;
    private com.bolivia.panel.JCPanel jCPanel2;
    private com.bolivia.panel.JCPanel jCPanel3;
    private com.bolivia.panel.JCPanel jCPanel4;
    private com.bolivia.panel.JCPanel jCPanel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup jbgform;
    private javax.swing.JRadioButton jrbaceleracion;
    private javax.swing.JRadioButton jrbarea;
    private javax.swing.JRadioButton jrbfuerza;
    private javax.swing.JRadioButton jrbmasa;
    private javax.swing.JRadioButton jrbsumadegaus;
    private javax.swing.JRadioButton jrbtiempo;
    private javax.swing.JRadioButton jrbvelocidadfinal;
    private javax.swing.JRadioButton jrbvelocidadinicial;
    private javax.swing.JRadioButton jrbvolumen;
    private javax.swing.JRadioButton rbaceleracion;
    // End of variables declaration//GEN-END:variables

}
