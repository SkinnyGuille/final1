/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compra2.Vista;

import compra2.DataBase.ProductoDataBase;
import compra2.Entidades.Producto;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author RODRI
 */
public class PrincipalVista extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalVista
     */
    public PrincipalVista() {
        initComponents();
        minimoProducto ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        jMenu3.setText("Productos");

        jMenuItem1.setText("Crear Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Modificar Producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Alta/Baja de producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Proveedores");

        jMenuItem5.setText("Agregar proveedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Modificar proveedor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem4.setText("Alta/Baja de proveedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Compras");

        jMenuItem7.setText("Realizar compra");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Listas");

        jMenuItem9.setText("Listar compras a proveedor");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem11.setText("Listar por fecha");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Listar productos de una compra");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem10.setText("Producto mas vendido");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem13.setText("Listar productos por debajo del minimo");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem14.setText("Listar proveedores de producto");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Relacionar");

        jMenuItem8.setText("Producto a Proveedor");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CrearproductoVista ventanaInterna = new CrearproductoVista();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ModificarProductoVista ventanaInterna = new ModificarProductoVista();
        ventanaInterna.setVisible(true);
//        ventanaInterna.setLocationRelativeTo(jDesktopPane1);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AltaBajaProdcuto ventanaInterna = new AltaBajaProdcuto();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        RealizarComp ventanaInterna = new RealizarComp();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
          
       
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        RelacionarPaP ventanaInterna = new RelacionarPaP();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CrearProveedorVista ventanaInterna = new CrearProveedorVista ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
       ModificarProveedor ventanaInterna = new ModificarProveedor ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AltaBajaProveedor ventanaInterna = new AltaBajaProveedor();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
            jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
      ListarComprasAinProveedorDeterminado ventanaInterna = new ListarComprasAinProveedorDeterminado ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
           jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
      ListarProductosMasCompradosEntreFechas ventanaInterna = new ListarProductosMasCompradosEntreFechas ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
      ListarPorFecha ventanaInterna = new ListarPorFecha ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
             jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
      ListarProductosDeUnaCompra ventanaInterna = new ListarProductosDeUnaCompra ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
              jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
      ListarProductosPoDebajoDelMinimo ventanaInterna = new ListarProductosPoDebajoDelMinimo ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
                jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
      ListarProveedoresConProductoParticular ventanaInterna = new ListarProveedoresConProductoParticular ();
        ventanaInterna.setVisible(true);
         Dimension desktopSize = jDesktopPane1.getSize();

        jDesktopPane1.add(ventanaInterna);
        ventanaInterna.setLocation((jDesktopPane1.getWidth() - ventanaInterna.getWidth()) / 2, (jDesktopPane1.getHeight() - ventanaInterna.getHeight()) / 2);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
public void minimoProducto (){
    Producto producto=new Producto();
    ProductoDataBase pData=new ProductoDataBase();
    if(pData.listarProductosPorDejajoDelMinimo().isEmpty()){
        JOptionPane.showMessageDialog(this, "No hay productos por debajo del stock minimo");
    }else{
 
     JOptionPane.showMessageDialog(this, "Tiene productos por dejajo del stock minimo. Verifique en Listar productos por debajo del minimo");
        
    }
    
}


}