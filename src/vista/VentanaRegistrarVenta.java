/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.RegVentaController;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaRegistrarVenta extends javax.swing.JFrame {

    RegVentaController regC;

    public VentanaRegistrarVenta() {

        initComponents();
        regC = new RegVentaController(this);

        botonRegistrar.setActionCommand("registrar");
        botonRegistrar.addActionListener((ActionListener) regC);

    }

    public void setRegC(RegVentaController regC) {
        this.regC = regC;
    }

    public void setBotonRegistrar(JButton botonRegistrar) {
        this.botonRegistrar = botonRegistrar;
    }

    public void setLabelFecha(JLabel labelFecha) {
        this.labelFecha = labelFecha;
    }

    public void setLabelMonto(JLabel labelMonto) {
        this.labelMonto = labelMonto;
    }

    public void setLabelSucursal(JLabel labelSucursal) {
        this.labelSucursal = labelSucursal;
    }

    public void setLabelVendedor(JLabel labelVendedor) {
        this.labelVendedor = labelVendedor;
    }

    public void setTfFecha(JTextField tfFecha) {
        this.tfDia = tfFecha;
    }

    public void setTfMonto(JTextField tfMonto) {
        this.tfMonto = tfMonto;
    }

    public void setJcVendedor(JComboBox<String> jcVendedor) {
        this.jcVendedor = jcVendedor;
    }

    public RegVentaController getRc() {
        return regC;
    }

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }

    public JComboBox<String> getJcVendedor() {
        return jcVendedor;
    }

    public JLabel getLabelFecha() {
        return labelFecha;
    }

    public JLabel getLabelMonto() {
        return labelMonto;
    }

    public JLabel getLabelSucursal() {
        return labelSucursal;
    }

    public JLabel getLabelVendedor() {
        return labelVendedor;
    }

    public JTextField getTfFecha() {
        return tfDia;
    }

    public JTextField getTfMonto() {
        return tfMonto;
    }

    public JComboBox<String> getJcSucursal() {
        return jcSucursal;
    }

    public void setJcSucursal(JComboBox<String> jcSucursal) {
        this.jcSucursal = jcSucursal;
    }

    public JTextField getTfAño() {
        return tfAño;
    }

    public void setTfAño(JTextField tfAño) {
        this.tfAño = tfAño;
    }

    public JTextField getTfDia() {
        return tfDia;
    }

    public void setTfDia(JTextField tfDia) {
        this.tfDia = tfDia;
    }

    public JTextField getTfMes() {
        return tfMes;
    }

    public void setTfMes(JTextField tfMes) {
        this.tfMes = tfMes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelVendedor = new javax.swing.JLabel();
        labelSucursal = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelMonto = new javax.swing.JLabel();
        jcVendedor = new javax.swing.JComboBox<>();
        tfDia = new javax.swing.JTextField();
        tfMonto = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        tfMes = new javax.swing.JTextField();
        tfAño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcSucursal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Regsitrar Venta");

        labelVendedor.setText("Vendedor:");

        labelSucursal.setText("Sucursal:");

        labelFecha.setText("Fecha:");

        labelMonto.setText("Monto:");

        botonRegistrar.setText("Registrar");

        jLabel1.setText("DD/MM/AAAA");

        jLabel2.setText("$");

        jcSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johnson", "Paris", "Paris Portal", "Falabella", "ABCDIN", "Hites", "Ripley", "Ripley Portal" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(botonRegistrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelMonto)
                        .addComponent(labelFecha)
                        .addComponent(labelSucursal)
                        .addComponent(labelVendedor)))
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfMonto)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jcVendedor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVendedor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSucursal)
                    .addComponent(jcSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMonto)
                    .addComponent(tfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addComponent(botonRegistrar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jcSucursal;
    private javax.swing.JComboBox<String> jcVendedor;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMonto;
    private javax.swing.JLabel labelSucursal;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfMonto;
    // End of variables declaration//GEN-END:variables
}