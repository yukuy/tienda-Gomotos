/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorProveedor;
import static Modelo.ConexionBD.conexion;
//import Controlador.ProveedorEliminar;
import Modelo.Proveedor;
import java.sql.SQLException;
import java.util.Iterator;
import javax.swing.InputMap;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHONNY
 */
public class FRProveedor extends javax.swing.JInternalFrame {
    
    ControladorProveedor controller = new ControladorProveedor();
    //ProveedorEliminar controlar = new ProveedorEliminar();

    /**
     * Creates new form Proveedor1
     */
    public FRProveedor()  {
        
            initComponents();          
            TXTidproveedor.setValue(0);
            TXTidproveedor.setVisible(false);
            Limpiar();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBLProveedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        TXTnombre = new javax.swing.JTextField();
        TXTidproveedor = new javax.swing.JFormattedTextField();
        TXTdocumento = new javax.swing.JTextField();
        LBLTelefono = new javax.swing.JLabel();
        LBLBuscar = new javax.swing.JLabel();
        TXTtelefono = new javax.swing.JTextField();
        TXTbuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BTinsertar = new javax.swing.JButton();
        BTmodificar = new javax.swing.JButton();
        BTeliminar = new javax.swing.JButton();
        BTcerrar = new javax.swing.JButton();
        BTbuscar = new javax.swing.JButton();
        btid = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario Proveedor ");

        TBLProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idProveedor", "Nombre", "Documento", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLProveedor);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        LBLNombre.setText("Nombre");

        LBLDocumento.setText("Documento");
        LBLDocumento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LBLDocumentoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        TXTnombre.setText("Esceriba nombre");
        TXTnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTnombreFocusGained(evt);
            }
        });
        TXTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnombreActionPerformed(evt);
            }
        });

        TXTidproveedor.setText("0");
        TXTidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTidproveedorActionPerformed(evt);
            }
        });

        TXTdocumento.setText("Escriba documento");
        TXTdocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTdocumentoFocusGained(evt);
            }
        });

        LBLTelefono.setText("Telefono");

        LBLBuscar.setText("Buscar");

        TXTtelefono.setText("Escriba el telefono");
        TXTtelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTtelefonoFocusGained(evt);
            }
        });
        TXTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtelefonoActionPerformed(evt);
            }
        });

        TXTbuscar.setText("Buscar por texto ");
        TXTbuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTbuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTbuscarFocusLost(evt);
            }
        });
        TXTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLNombre)
                        .addGap(18, 18, 18)
                        .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(TXTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLTelefono)
                                .addGap(18, 18, 18)
                                .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLDocumento)
                        .addGap(18, 18, 18)
                        .addComponent(TXTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre)
                    .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLTelefono)
                    .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDocumento)
                    .addComponent(TXTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLBuscar)
                    .addComponent(TXTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        BTinsertar.setText("Insertar");
        BTinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTinsertarActionPerformed(evt);
            }
        });

        BTmodificar.setText("Modificar");
        BTmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTmodificarActionPerformed(evt);
            }
        });

        BTeliminar.setText("Eliminar");
        BTeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTeliminarActionPerformed(evt);
            }
        });

        BTcerrar.setText("Cerrar");
        BTcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcerrarActionPerformed(evt);
            }
        });

        BTbuscar.setText("buscar ");
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        btid.setText("BuscarID");
        btid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTinsertar)
                .addGap(18, 18, 18)
                .addComponent(BTmodificar)
                .addGap(34, 34, 34)
                .addComponent(BTeliminar)
                .addGap(18, 18, 18)
                .addComponent(BTcerrar)
                .addGap(18, 18, 18)
                .addComponent(BTbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btid)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTinsertar)
                    .addComponent(BTmodificar)
                    .addComponent(BTeliminar)
                    .addComponent(BTcerrar)
                    .addComponent(BTbuscar)
                    .addComponent(btid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTidproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTidproveedorActionPerformed

    private void TXTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtelefonoActionPerformed

    private void BTinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTinsertarActionPerformed
        // TODO add your handling code here:
        controller.controlarAccion(evt, obtenerProveedor());
        Limpiar();
    }//GEN-LAST:event_BTinsertarActionPerformed

    private void BTcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcerrarActionPerformed
        // TODO add your handling code here:
        doDefaultCloseAction();
    }//GEN-LAST:event_BTcerrarActionPerformed

    private void BTmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTmodificarActionPerformed
        // TODO add your handling code here:
        controller.controlarAccion(evt, obtenerProveedor());
        Limpiar();
        
    }//GEN-LAST:event_BTmodificarActionPerformed

    private void BTeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTeliminarActionPerformed
        System.out.println("antes del controlador "+evt.getActionCommand());
        controller.controlarAccion(evt, obtenerProveedor());
        Limpiar();
        
    }//GEN-LAST:event_BTeliminarActionPerformed

    private void TBLProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLProveedorMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() ==2){
            int fila = TBLProveedor.rowAtPoint(evt.getPoint());
            if (fila>-1 ){
            TXTidproveedor.setValue((Integer) TBLProveedor.getValueAt(fila, 0));
            TXTnombre.setText((String) TBLProveedor.getValueAt(fila, 1));
            TXTdocumento.setText((String) TBLProveedor.getValueAt(fila, 2));
            TXTtelefono.setText((String) TBLProveedor.getValueAt(fila, 3));
            BTmodificar.setEnabled(true);
            BTeliminar.setEnabled(true);
        }
        }
    }//GEN-LAST:event_TBLProveedorMouseClicked

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
        // TODO add your handling code here:
        llenarTablaConBusqueda(TXTbuscar.getText());
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void TXTbuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTbuscarFocusGained
        // TODO add your handling code here:
        TXTbuscar.setText("");
        if (TXTbuscar.getText().equals("Escriba texto a buscar")){
            TXTbuscar.setText("");
        }
    }//GEN-LAST:event_TXTbuscarFocusGained

    private void TXTbuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTbuscarFocusLost
        // TODO add your handling code here:
        if (TXTbuscar.getText().isEmpty()){
            TXTbuscar.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTbuscarFocusLost

    private void TXTnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTnombreFocusGained
        // TODO add your handling code here:
        TXTnombre.setText("");
    }//GEN-LAST:event_TXTnombreFocusGained

    private void TXTdocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTdocumentoFocusGained
        // TODO add your handling code here:
        TXTdocumento.setText("");
    }//GEN-LAST:event_TXTdocumentoFocusGained

    private void TXTtelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTtelefonoFocusGained
        // TODO add your handling code here:
        TXTtelefono.setText("");
    }//GEN-LAST:event_TXTtelefonoFocusGained

    private void TXTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnombreActionPerformed

    private void TXTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTbuscarActionPerformed

    private void LBLDocumentoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LBLDocumentoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_LBLDocumentoAncestorAdded

    private void btidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btidActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscar;
    private javax.swing.JButton BTcerrar;
    private javax.swing.JButton BTeliminar;
    private javax.swing.JButton BTinsertar;
    private javax.swing.JButton BTmodificar;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBLTelefono;
    private javax.swing.JTable TBLProveedor;
    private javax.swing.JTextField TXTbuscar;
    private javax.swing.JTextField TXTdocumento;
    private javax.swing.JFormattedTextField TXTidproveedor;
    private javax.swing.JTextField TXTnombre;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JButton btid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Limpiar(){
        TXTidproveedor.setValue(0);
        TXTnombre.setText("Escriba nombre");
        TXTdocumento.setText("Escriba documento");
        TXTtelefono.setText("Escribre telefono");
        BTmodificar.setEnabled(false);
        BTeliminar.setEnabled(false);
        llenarTabla();
    }

   private void llenarTabla() {
    Proveedor unproveedor = new Proveedor(conexion);
    DefaultTableModel tabla = (DefaultTableModel) TBLProveedor.getModel(); 
    Object[] filaproveedor = new Object[TBLProveedor.getColumnCount()]; // una fila 
    tabla.setRowCount(0); // vaciar tabla
    try {
        Iterator<Proveedor> itproveedor = unproveedor.listarProveedore(); //listado de proveedores
        while (itproveedor.hasNext()) { //llenamos cada fila
            unproveedor = itproveedor.next();
            filaproveedor[0] = unproveedor.getIdProveedor();
            filaproveedor[1] = unproveedor.getNombre();
            filaproveedor[2] = unproveedor.getDocumento();
            filaproveedor[3] = unproveedor.getTelefono();
            tabla.addRow(filaproveedor); //Agregamos una fila
            }
        } catch (SQLException ex) {
        ex.printStackTrace(); // Manejo de la excepción
        // Aquí puedes agregar más acciones para manejar la excepción, como mostrar un mensaje de error al usuario.
        }
    }
        
    

    private Proveedor obtenerProveedor() {
        Proveedor elproveedor = new Proveedor(conexion);
        elproveedor.setIdProveedor((Integer) TXTidproveedor.getValue());
        elproveedor.setNombre( TXTnombre.getText());
        elproveedor.setDocumento( TXTdocumento.getText()); 
        elproveedor.setTelefono( TXTtelefono.getText());
        return elproveedor;
    }

    private void llenarTablaConBusqueda(String busquda) {
       Proveedor unproveedor = new Proveedor(conexion);
       DefaultTableModel tabla = (DefaultTableModel)TBLProveedor.getModel();
       Iterator<Proveedor> itproveedor = unproveedor.buscar(busquda);
       Object[] filaproveedor = new Object[TBLProveedor.getColumnCount()];
       tabla.setRowCount(0);
       while (itproveedor.hasNext()){
           unproveedor = itproveedor.next();
           filaproveedor[0] = unproveedor.getIdProveedor();
           filaproveedor[1] = unproveedor.getNombre();
           filaproveedor[2] = unproveedor.getDocumento();
           filaproveedor[3] = unproveedor.getTelefono();
           ((DefaultTableModel) TBLProveedor.getModel()).addRow(filaproveedor);
       }
    }

//    private boolean Proveedor1aID(Int elId) {
//       Proveedor unproveedor = new Proveedor(conexion);
//       DefaultTableModel tabla = (DefaultTableModel)TBLProveedor.getModel();
//       Iterator<Proveedor> itproveedor;
//        itproveedor = unproveedor.buscarPorID(elId);
//       Object[] filaproveedor = new Object[TBLProveedor.getColumnCount()];
//       tabla.setRowCount(0);
//       while (itproveedor.hasNext()){
//           unproveedor = itproveedor.next();
//           filaproveedor[0] = unproveedor.getIdProveedor();
//           filaproveedor[1] = unproveedor.getNombre();
//           filaproveedor[2] = unproveedor.getDocumento();
//           filaproveedor[3] = unproveedor.getTelefono();
//           ((DefaultTableModel) TBLProveedor.getModel()).addRow(filaproveedor);
//    }
//        return true;
   // }
}