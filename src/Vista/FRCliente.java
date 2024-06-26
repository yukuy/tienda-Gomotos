/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHONNY
 */
public class FRCliente extends javax.swing.JInternalFrame {

    ControladorCliente controller = new ControladorCliente();
    
    /**
     * Creates new form Cliente
     */
    public FRCliente() {
        initComponents();
        
        TXTidCliente.setValue(0);
        TXTidCliente.setVisible(false);
        limpiarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        LBLTelefono = new javax.swing.JLabel();
        LBLBuscar = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();
        TXTDocumento = new javax.swing.JTextField();
        TXTTelefono = new javax.swing.JTextField();
        TXTBuscar = new javax.swing.JTextField();
        TXTidCliente = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        BTInsertar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTEliminar = new javax.swing.JButton();
        BTBuscar = new javax.swing.JButton();
        BTCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario cliente");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        LBLNombre.setText("Nombre");

        LBLDocumento.setText("Documento");

        LBLTelefono.setText("Telefono");

        LBLBuscar.setText("Buscar");

        TXTNombre.setText("Escriba Nombre");
        TXTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTNombreFocusGained(evt);
            }
        });
        TXTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreActionPerformed(evt);
            }
        });

        TXTDocumento.setText("Escriba documento");
        TXTDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTDocumentoFocusGained(evt);
            }
        });
        TXTDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDocumentoActionPerformed(evt);
            }
        });

        TXTTelefono.setText("Escriba telefono");
        TXTTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTTelefonoFocusGained(evt);
            }
        });

        TXTBuscar.setText("Escriba lo que va a buscar");
        TXTBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarFocusLost(evt);
            }
        });
        TXTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarActionPerformed(evt);
            }
        });

        TXTidCliente.setText("0");
        TXTidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTidClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLBuscar)
                    .addComponent(LBLTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre)
                    .addComponent(LBLTelefono)
                    .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDocumento)
                    .addComponent(LBLBuscar)
                    .addComponent(TXTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        BTInsertar.setText("Insertar");
        BTInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInsertarActionPerformed(evt);
            }
        });

        BTModificar.setText("Modificar");
        BTModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTModificarActionPerformed(evt);
            }
        });

        BTEliminar.setText("Eliminar");
        BTEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarActionPerformed(evt);
            }
        });

        BTBuscar.setText("Buscar");
        BTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBuscarActionPerformed(evt);
            }
        });

        BTCerrar.setText("Cerrar");
        BTCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTInsertar)
                .addGap(33, 33, 33)
                .addComponent(BTModificar)
                .addGap(37, 37, 37)
                .addComponent(BTEliminar)
                .addGap(37, 37, 37)
                .addComponent(BTBuscar)
                .addGap(38, 38, 38)
                .addComponent(BTCerrar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTInsertar)
                    .addComponent(BTModificar)
                    .addComponent(BTEliminar)
                    .addComponent(BTBuscar)
                    .addComponent(BTCerrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        TBLCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idCliente", "Nombre", "Documento", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBLCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDocumentoActionPerformed

    private void BTCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCerrarActionPerformed
        // TODO add your handling code here:
        doDefaultCloseAction();
    }//GEN-LAST:event_BTCerrarActionPerformed

    private void BTInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInsertarActionPerformed
        // TODO add your handling code here:
        controller.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
    }//GEN-LAST:event_BTInsertarActionPerformed

    private void BTModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarActionPerformed
        // TODO add your handling code here:
        controller.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
    }//GEN-LAST:event_BTModificarActionPerformed

    private void BTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarActionPerformed
        // TODO add your handling code here:
        controller.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
    }//GEN-LAST:event_BTEliminarActionPerformed

    private void TBLClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLClienteMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int fila = TBLCliente .rowAtPoint(evt.getPoint());
            if(fila>-1){
                TXTidCliente.setValue((Integer) TBLCliente.getValueAt(fila, 0));
                TXTNombre.setText((String) TBLCliente.getValueAt(fila, 1));
                TXTDocumento.setText((String) TBLCliente.getValueAt(fila, 2));
                TXTTelefono.setText((String) TBLCliente.getValueAt(fila, 3));
                BTModificar.setEnabled(true);
                BTEliminar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_TBLClienteMouseClicked

    private void BTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBuscarActionPerformed
        // TODO add your handling code here:
        llenarTablaConBusquda(TXTBuscar.getText());
    }//GEN-LAST:event_BTBuscarActionPerformed

    private void TXTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TXTBuscarActionPerformed

    private void TXTBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarFocusGained
        // TODO add your handling code here:
        TXTBuscar.setText("");
        if(TXTBuscar.getText().equals("escriba texto a buscar")){
            TXTBuscar.setText("");
        }
    }//GEN-LAST:event_TXTBuscarFocusGained

    private void TXTBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarFocusLost
        // TODO add your handling code here:
        if(TXTBuscar.getText().isEmpty()){
            TXTBuscar.setText("escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTBuscarFocusLost

    private void TXTNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNombreFocusGained
        // TODO add your handling code here:
        TXTNombre.setText("");
    }//GEN-LAST:event_TXTNombreFocusGained

    private void TXTDocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTDocumentoFocusGained
        // TODO add your handling code here:
        TXTDocumento.setText("");
    }//GEN-LAST:event_TXTDocumentoFocusGained

    private void TXTTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTTelefonoFocusGained
        // TODO add your handling code here:
        TXTTelefono.setText("");
    }//GEN-LAST:event_TXTTelefonoFocusGained

    private void TXTidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTidClienteActionPerformed

    private void TXTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBuscar;
    private javax.swing.JButton BTCerrar;
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTInsertar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBLTelefono;
    private javax.swing.JTable TBLCliente;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTDocumento;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXTTelefono;
    private javax.swing.JFormattedTextField TXTidCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        TXTidCliente.setValue(0);
        TXTNombre.setText("Escriba nombre");
        TXTDocumento.setText("escriba documento");
        TXTTelefono.setText("escriba telefono");
        BTModificar.setEnabled(false);
        BTEliminar.setEnabled(false);
        llenarTabla();
    }

    private void llenarTabla() {
        Cliente unCliente = new Cliente();
        DefaultTableModel tabla = ( DefaultTableModel)TBLCliente.getModel();
        Iterator<Cliente> itCliente = unCliente.listar(); ///listar los clientes de la BD
        Object[] filaCliente = new Object[TBLCliente.getColumnCount()];//una fila
        tabla.setRowCount(0);// vaciar tabla 
        while(itCliente.hasNext()){
            unCliente = itCliente.next();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getNombre();
            filaCliente[2] = unCliente.getDocumento();
            filaCliente[3] = unCliente.getTelefono();
            tabla.addRow(filaCliente);//agregamos una fila 
        }
    }
    private Cliente obtenerCliente(){
        Cliente elCliente = new Cliente();
        elCliente.setIdCliente((Integer) TXTidCliente.getValue());
        elCliente.setNombre( TXTNombre.getText());
        elCliente.setDocumento( TXTDocumento.getText());
        elCliente.setTelefono( TXTTelefono.getText());
        return elCliente;        
    }

    private void llenarTablaConBusquda(String busqueda) {
        Cliente unCliente = new Cliente();
        DefaultTableModel tabla  = (DefaultTableModel) TBLCliente.getModel();
        Iterator<Cliente> itCliente = unCliente.buscar(busqueda);
        Object[] filaCliente = new Object[TBLCliente.getColumnCount()];
        tabla.setRowCount(0); ///limpiar tabla
        while (itCliente.hasNext()){
            unCliente = itCliente.next();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getNombre();
            filaCliente[2] = unCliente.getDocumento();
            filaCliente[3] = unCliente.getTelefono();
            ((DefaultTableModel)TBLCliente.getModel()).addRow(filaCliente);
        }
    }
}
