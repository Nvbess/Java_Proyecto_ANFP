/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DaoJugador;
import Controlador.DaoPosicion;
import Modelo.Jugador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Modelo.Posicion;

/**
 *
 * @author Gonzalo
 */
public class JFrmJugadorList extends javax.swing.JFrame {

    /**
     * Creates new form JFrmJugadorList
     */
    public JFrmJugadorList() {
        initComponents();
        this.setLocationRelativeTo(null);
        Listar();
        Llenarcombojugador();
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
        jLabel1 = new javax.swing.JLabel();
        cboposicion = new javax.swing.JComboBox<>();
        spnemin = new javax.swing.JSpinner();
        spnemax = new javax.swing.JSpinner();
        btnposicion = new javax.swing.JButton();
        btnedad = new javax.swing.JButton();
        btnnombre = new javax.swing.JButton();
        cboNomJug = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblJugador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Listar y Filtar Jugadores");

        cboposicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "portero", "defensa", "medio", "delantero" }));

        btnposicion.setText("Filtrar por posicion");
        btnposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnposicionActionPerformed(evt);
            }
        });

        btnedad.setText("Filtrar por rango de edad");
        btnedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedadActionPerformed(evt);
            }
        });

        btnnombre.setText("Filtrar por nombre");
        btnnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnombreActionPerformed(evt);
            }
        });

        cboNomJug.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnposicion)
                                .addGap(97, 97, 97)
                                .addComponent(btnedad))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(spnemin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(spnemax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnombre)
                            .addComponent(cboNomJug, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnemax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNomJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnposicion)
                    .addComponent(btnedad)
                    .addComponent(btnnombre))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jtblJugador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblJugador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnposicionActionPerformed
        // TODO add your handling code here:
        String posicion=cboposicion.getSelectedItem().toString();
        int idposi=0;
        for (Posicion item: new DaoPosicion().listar()) {
            if (item.getDescripcion().equalsIgnoreCase(posicion)) {
                idposi=item.getIdPosicion();
            }
        }
        listarPosicion(idposi);
    }//GEN-LAST:event_btnposicionActionPerformed

    private void btnedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedadActionPerformed
        // TODO add your handling code here:
        int edadmin=Integer.parseInt(spnemin.getValue().toString());
        int edadmax=Integer.parseInt(spnemax.getValue().toString());
        listarRango(edadmin,edadmax);
    }//GEN-LAST:event_btnedadActionPerformed

    private void btnnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnombreActionPerformed
        // TODO add your handling code here:
        String nombre=cboNomJug.getSelectedItem().toString();
        listarNombre(nombre);
    }//GEN-LAST:event_btnnombreActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmJugadorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmJugadorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmJugadorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmJugadorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmJugadorList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedad;
    private javax.swing.JButton btnnombre;
    private javax.swing.JButton btnposicion;
    private javax.swing.JComboBox<String> cboNomJug;
    private javax.swing.JComboBox<String> cboposicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblJugador;
    private javax.swing.JSpinner spnemax;
    private javax.swing.JSpinner spnemin;
    // End of variables declaration//GEN-END:variables

    private void Listar() {
        DefaultTableModel modelo=new DefaultTableModel();
        jtblJugador.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("VALORUS");
        modelo.addColumn("POSICION");
        ArrayList<Jugador> lista=new DaoJugador().listarJugador();
        for (Jugador item : lista) {
            Object[] fila=new Object[6];
            fila[0]=item.getIdJugador();
            fila[1]=item.getNombre();
            fila[2]=item.getEdad();
            fila[3]=item.getNacionalidad();
            fila[4]=item.getValorus();
            fila[5]=new DaoPosicion().filtrarposicion(item.getIdPosicion()).getDescripcion();
            modelo.addRow(fila);
        }
        
    }

    private void listarPosicion(int idposi) {
        DefaultTableModel modelo=new DefaultTableModel();
        jtblJugador.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("VALORUS");
        modelo.addColumn("POSICION");
        ArrayList<Jugador> lista=new DaoJugador().listarJugadorposicion(idposi);
        for (Jugador item : lista) {
            Object[] fila=new Object[6];
            fila[0]=item.getIdJugador();
            fila[1]=item.getNombre();
            fila[2]=item.getEdad();
            fila[3]=item.getNacionalidad();
            fila[4]=item.getValorus();
            fila[5]=new DaoPosicion().filtrarposicion(item.getIdPosicion()).getDescripcion();
            modelo.addRow(fila);
        }
        
    }

    private void listarRango(int edadmin, int edadmax) {
        DefaultTableModel modelo=new DefaultTableModel();
        jtblJugador.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("VALORUS");
        modelo.addColumn("POSICION");
        ArrayList<Jugador> lista=new DaoJugador().listarJugadoresrango(edadmin, edadmax);
        for (Jugador item : lista) {
            Object[] fila=new Object[6];
            fila[0]=item.getIdJugador();
            fila[1]=item.getNombre();
            fila[2]=item.getEdad();
            fila[3]=item.getNacionalidad();
            fila[4]=item.getValorus();
            fila[5]=new DaoPosicion().filtrarposicion(item.getIdPosicion()).getDescripcion();
            modelo.addRow(fila);
        }
    }

    private void listarNombre(String nombre) {
        DefaultTableModel modelo=new DefaultTableModel();
        jtblJugador.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("VALORUS");
        modelo.addColumn("POSICION");
        Jugador juga=new DaoJugador().buscarporNombre(nombre);
        Object[] fila=new Object[6];
            fila[0]=juga.getIdJugador();
            fila[1]=juga.getNombre();
            fila[2]=juga.getEdad();
            fila[3]=juga.getNacionalidad();
            fila[4]=juga.getValorus();
            fila[5]=new DaoPosicion().filtrarposicion(juga.getIdPosicion()).getDescripcion();
            modelo.addRow(fila);
    }

    private void Llenarcombojugador() {
        ArrayList<Jugador> lista_1=new DaoJugador().listarJugador();
        cboNomJug.removeAllItems();
        cboNomJug.addItem("Seleccione...");
        for (Jugador item : lista_1) {
            cboNomJug.addItem(item.getNombre());
        }
    }
}
