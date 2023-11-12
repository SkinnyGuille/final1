/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package compra2.Vista;
import compra2.Vista.PrincipalVista;
import compra2.DataBase.CompraDataBase;
import compra2.DataBase.DetalleCompraDataBase;
import compra2.DataBase.ProductoDataBase;
import compra2.DataBase.ProveedorDataBase;
import compra2.DataBase.RelacionPaP;
import compra2.Entidades.Compra;
import compra2.Entidades.DetalleCompra;
import compra2.Entidades.Producto;
import compra2.Entidades.Proveedor;
import compra2.Entidades.RelacionProductoProveedor;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RODRI
 */
public class RealizarComp extends javax.swing.JInternalFrame {

       private Integer cantidad=0;
    Compra x=new Compra();
     DetalleCompra dc=new DetalleCompra();
     
    private Producto p=new Producto();
    private Proveedor pv=new Proveedor();
    private ProductoDataBase pData=new ProductoDataBase();
    private ProveedorDataBase pvData=new ProveedorDataBase();
    private RelacionPaP r=new RelacionPaP();
    private DefaultTableModel modelo= new DefaultTableModel(){
     public boolean isCellEditable(int fila, int columna){ 
           return false; 

        }
};
    public RealizarComp() {
        initComponents();
          cabeceraTabla();
        cargarComboProductos();
        cargarComboProveedores();
        cargarComboCantidad();
        llenarTabla();
//      jcCantidad.setSelectedItem(null);
//        jcProductos.setSelectedItem(null);
//        jcProveedor.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JDesktopPane();
        jcCantidad = new javax.swing.JComboBox<>();
        jcProductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcProveedor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jcCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCantidadActionPerformed(evt);
            }
        });

        jcProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductosActionPerformed(evt);
            }
        });

        jLabel2.setText("Producto");

        jLabel3.setText("Proveedor");

        jcProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProveedorActionPerformed(evt);
            }
        });

        jButton1.setText("Confirme compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jButton3.setText("Reiniciar");

        jLabel4.setText("Realice la seleccion en la tabla");

        jLabel1.setText("Seleccione el producto que desea comprar ");

        jLabel5.setText("Cantidad de productos a comprar:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        contenedor.setLayer(jcCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jcProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jcProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(86, 86, 86)
                                .addComponent(jButton2)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jcCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCantidadActionPerformed

        cantidad=(Integer) jcCantidad.getSelectedItem();
        int fila = jTable1.getSelectedRow();
        try{
            modelo.setValueAt(cantidad, fila, 5);
            int id=(int) jTable1.getValueAt(fila, 0);
            System.out.println(id);
            ProveedorDataBase p=new ProveedorDataBase();
            Proveedor pv=new Proveedor();

            pv=( p.buscarProveedor(id));
            x.setProveedor(pv);
            x.setFecha(LocalDate.now());
            x.setEstado(true);

//            llenarTabla();
            jTable1.setRowSelectionInterval(fila, fila);
            
            Producto w=new Producto();
            int idProducto=(Integer)jTable1.getValueAt(fila, 1);
            System.out.println(idProducto);
            w=pData.buscarProducto(idProducto);
             dc.setProducto(w);
            dc.setCantidad(cantidad);
            dc.setCompra(x);
            dc.setEstado(true);
            Double precio = (Double) jTable1.getValueAt(fila,4 );
            dc.setPrecioCosto(cantidad*precio);
                       modelo.setValueAt(cantidad*precio, fila, 6);

            System.out.println(w);
        }catch(Exception e){

        }
    }//GEN-LAST:event_jcCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DetalleCompraDataBase z=new DetalleCompraDataBase();
        CompraDataBase c=new CompraDataBase();
        Producto producto=new Producto();
        ProductoDataBase pData=new ProductoDataBase();
        c.crearCompra(x);
        z.crearDetalleCompra(dc);
        pData.modificarProductoStock(p, p.getStock()+cantidad, p.getIdProducto());
        
             
        contenedor.repaint();
        DetalleComp ventanaInterna = new DetalleComp();
        ventanaInterna.setVisible(true);
        ventanaInterna.setSize(contenedor.getWidth(), contenedor.getHeight());
        ventanaInterna.setLocation(0, 0);
        contenedor.add(ventanaInterna);
        
        contenedor.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductosActionPerformed
       //llenar tabla con productos elegidos
       borrarlista();
       try{
      ProveedorDataBase x =new ProveedorDataBase();
       p=(Producto) jcProductos.getSelectedItem();
        for (RelacionProductoProveedor o : r.listarrelacionActivas()) {
            if(p.getIdProducto()==o.getProducto().getIdProducto()){
              cantidad=  (Integer) jcCantidad.getSelectedItem();
              
                if(cantidad==0){
            modelo.addRow(new Object[]{
              o.getProveedor().getIdProveedor(),o.getProducto().getIdProducto(),  o.getProducto().getNombreProducto(),o.getProveedor().getRazonSocial(),o.getProducto().getPrecioActual(), cantidad, "Seleccione una cantidad" });}
           else{  modelo.addRow(new Object[]{
            o.getProveedor().getIdProveedor(),  o.getProducto().getIdProducto(), o.getProducto().getNombreProducto(),o.getProveedor().getRazonSocial(),o.getProducto().getPrecioActual(),cantidad, cantidad*o.getProducto().getPrecioActual()});}
        
            }
        }
       }catch(NullPointerException e){
           llenarTabla();
       }
    }//GEN-LAST:event_jcProductosActionPerformed

    private void jcProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProveedorActionPerformed
        // llenar tabla con productos del proveedor elegido
          borrarlista();
       try{
      ProveedorDataBase x =new ProveedorDataBase();
       pv=(Proveedor) jcProveedor.getSelectedItem();
        for (RelacionProductoProveedor o : r.listarrelacionActivas()) {
            if(p.getIdProducto()==o.getProducto().getIdProducto() && pv.getIdProveedor()==o.getProveedor().getIdProveedor()){
              cantidad=   (Integer) jcCantidad.getSelectedItem();
              
               
           modelo.addRow(new Object[]{
            o.getProveedor().getIdProveedor(),  o.getProducto().getIdProducto(), o.getProducto().getNombreProducto(),o.getProveedor().getRazonSocial(),o.getProducto().getPrecioActual(),cantidad, cantidad*o.getProducto().getPrecioActual()});}
        
            
        }
       }catch(NullPointerException e){
           llenarTabla();
       }
    }//GEN-LAST:event_jcProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Integer> jcCantidad;
    private javax.swing.JComboBox<Producto> jcProductos;
    private javax.swing.JComboBox<Proveedor> jcProveedor;
    // End of variables declaration//GEN-END:variables

public void cargarComboProductos(){
    for (RelacionProductoProveedor o : r.listarrelacionActivas()) {
        Producto p=new Producto();
//        p=o.getProducto();
        jcProductos.addItem(o.getProducto());
    }
}
public void cargarComboProveedores(){
     for (RelacionProductoProveedor o : r.listarrelacionActivas()) {
         Proveedor pv=new Proveedor();
//        pv=o.getProveedor();
        jcProveedor.addItem(o.getProveedor());
    }
}
public void cargarComboCantidad(){
 
      for (int i = 0; i < 10; i++) {
        jcCantidad.addItem(i);
    }
  
    
    } 
public void cabeceraTabla(){
     ArrayList<Object> col=new ArrayList();
        col.add("Id Proveedor");
        col.add("Id Producto");
        col.add("Producto");
        col.add("Proveedor");
        col.add("Precio Unitario");
        col.add("Cantidad");
        col.add("Precio Total");
       
        for(Object o:col){
            modelo.addColumn(o);
        }
        jTable1.setModel(modelo);
}
public void llenarTabla(){
     RelacionPaP x=new RelacionPaP();
     
     try{
     
        borrarlista();
        for (RelacionProductoProveedor p : x.listarrelacionActivas()) {
           if(cantidad==0){
            modelo.addRow(new Object[]{
              p.getProveedor(),p.getProducto(),  p.getProducto(),p.getProveedor(),p.getProducto(), cantidad, "Seleccione una cantidad" });}
           else{  modelo.addRow(new Object[]{
            p.getProveedor().getIdProveedor(),  p.getProducto().getIdProducto(), p.getProducto().getNombreProducto(),p.getProveedor().getRazonSocial(),p.getProducto().getPrecioActual(),cantidad, cantidad*p.getProducto().getPrecioActual()});}
        
    }
     }catch(NumberFormatException e){
         JOptionPane.showMessageDialog(this, "Parece haber un error en los datos ingresados");
     }catch(NullPointerException e){
          JOptionPane.showMessageDialog(this, "Debe seleccionar todos los campos");
     }
}
  public void borrarlista(){
    int a=modelo.getRowCount()-1;
    for(int i=a;i>=0;i--){
        modelo.removeRow(i);
    }
      }
}
