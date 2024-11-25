/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.RegistroEleccion;
import Modelo.Eleccion;
import javax.swing.JOptionPane;

/**
 *
 * @author vleos
 */
public class CrearElecciones extends javax.swing.JFrame {

    /**
     * Creates new form Crear_elecciones
     */
    RegistroEleccion objRegistroEleccion;
    public CrearElecciones() {
        initComponents();
    }
    
    public CrearElecciones(RegistroEleccion registroeleccion) {
        initComponents();
        this.objRegistroEleccion = registroeleccion;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtdia = new javax.swing.JTextField();
        cbxtipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttoncrear = new javax.swing.JButton();
        buttoncancelar = new javax.swing.JButton();
        txtaño = new javax.swing.JTextField();
        txtmes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Crear eleccion");

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal", "Nacional", "Referendum" }));
        cbxtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtipoActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha:");

        jLabel3.setText("Tipo:");

        buttoncrear.setText("Crear");
        buttoncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncrearActionPerformed(evt);
            }
        });

        buttoncancelar.setText("Cancelar");
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("DD/MM/YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(buttoncrear)
                        .addGap(59, 59, 59)
                        .addComponent(buttoncancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoncancelar)
                    .addComponent(buttoncrear))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxtipoActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttoncancelarActionPerformed
private void limpiar() {
    
        this.txtdia.setText("");
        this.txtmes.setText("");
        this.txtaño.setText("");
        
        this.cbxtipo.setSelectedIndex(0);
    }
    private void buttoncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncrearActionPerformed
         try {
        
        String diaStr = this.txtdia.getText().trim();
        String mesStr = this.txtmes.getText().trim();
        String anioStr = this.txtaño.getText().trim();
        
        
        if (diaStr.isEmpty() || mesStr.isEmpty() || anioStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor completar espacios", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int dia, mes, anio;
        
        try {
            
            dia = Integer.parseInt(diaStr);
            mes = Integer.parseInt(mesStr);
            anio = Integer.parseInt(anioStr);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Los campos de fecha deben contener solo números enteros", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        if (dia < 1 || dia > 31) {
            JOptionPane.showMessageDialog(this, 
                "El día debe estar entre 1 y 31", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(this, 
                "El mes debe estar entre 1 y 12", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (anio < 2000 || anio > 2100) {
            JOptionPane.showMessageDialog(this, 
                "El año debe estar entre 2000 y 2100", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validar días según el mes
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                JOptionPane.showMessageDialog(this, 
                    "Este mes solo tiene 30 días", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (mes == 2) {
            
            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            
            if (esBisiesto && dia > 29) {
                JOptionPane.showMessageDialog(this, 
                    "Febrero en año bisiesto solo tiene 29 días", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            } else if (!esBisiesto && dia > 28) {
                JOptionPane.showMessageDialog(this, 
                    "Febrero en año no bisiesto solo tiene 28 días", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        
        String fecha = dia + "/" + mes + "/" + anio;
        String tipo = String.valueOf(this.cbxtipo.getSelectedItem());
        Eleccion objEleccion = new Eleccion(fecha, tipo);
        
        if (this.objRegistroEleccion.agregar(objEleccion)) {
            JOptionPane.showMessageDialog(this, "Elección registrada con éxito!");
            this.limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Error en el registro!");
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error en el procesamiento de datos: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_buttoncrearActionPerformed

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
            java.util.logging.Logger.getLogger(CrearElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearElecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JButton buttoncrear;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtmes;
    // End of variables declaration//GEN-END:variables
}
