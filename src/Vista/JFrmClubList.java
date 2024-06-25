/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DaoClub;
import Controlador.DaoEntenador;
import Modelo.Club;
import com.toedter.calendar.JYearChooser;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo
 */
public class JFrmClubList extends javax.swing.JFrame {

    /**
     * Creates new form JFrmClubList
     */
    public JFrmClubList() {
        initComponents();
        this.setLocationRelativeTo(null);
        Listar();
        LlenarNombres();
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
        btnFiltrar = new javax.swing.JButton();
        ychsFecha = new com.toedter.calendar.JYearChooser();
        cboNombre = new javax.swing.JComboBox<>();
        btnanio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblListar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Listar y Filtrar Clubes");

        btnFiltrar.setText("Filtrar Nombre");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        cboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnanio.setText("Buscar por Año");
        btnanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(ychsFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnanio)
                    .addComponent(btnFiltrar))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrar)
                    .addComponent(cboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnanio)
                    .addComponent(ychsFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtblListar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblListar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        if (cboNombre.getSelectedItem().toString().trim().length()>0) {
            ListarNombres(cboNombre.getSelectedItem().toString().trim());
        } 
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanioActionPerformed
        // TODO add your handling code here:
        int anio=ychsFecha.getYear();
            ListarAnio(anio);
    }//GEN-LAST:event_btnanioActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmClubList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmClubList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmClubList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmClubList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmClubList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnanio;
    private javax.swing.JComboBox<String> cboNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblListar;
    private com.toedter.calendar.JYearChooser ychsFecha;
    // End of variables declaration//GEN-END:variables

    private void Listar() {
        DefaultTableModel modelo=new DefaultTableModel();
        jtblListar.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("FechaFundacion");
        modelo.addColumn("Presidente");
        modelo.addColumn("Estadio");
        modelo.addColumn("Entrenador");
        ArrayList<Club> lista=new DaoClub().listarClub();
        for (Club item : lista) {
            Object[] fila=new Object[6];
            fila[0]=item.getIdClub();
            fila[1]=item.getNombre();
            fila[2]=item.getFecha_fundacion();
            fila[3]=item.getPresidente();
            fila[4]=item.getEstadio();
            fila[5]=new DaoEntenador().filtrarid(item.getIdEntrenador()).getNombre();
            modelo.addRow(fila);
        }
        
    }

    private void ListarNombres(String trim) {
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            jtblListar.setModel(modelo);
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("FechaFundacion");
            modelo.addColumn("Presidente");
            modelo.addColumn("Estadio");
            modelo.addColumn("Entrenador");
            Club clu=new DaoClub().filtrarNombre(trim);
            Object[] fila=new Object[6];
            fila[0]=clu.getIdClub();
            fila[1]=clu.getNombre();
            fila[2]=clu.getFecha_fundacion();
            fila[3]=clu.getPresidente();
            fila[4]=clu.getEstadio();
            fila[5]=clu.getIdEntrenador();
            modelo.addRow(fila);
        } catch (Exception e) {
        }
        
        
    }

    private void ListarAnio(int anio) {
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            jtblListar.setModel(modelo);
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("FechaFundacion");
            modelo.addColumn("Presidente");
            modelo.addColumn("Estadio");
            modelo.addColumn("Entrenador");
            ArrayList<Club> lista=new DaoClub().filtrarFecha(anio);
            for (Club item : lista) {
                Object[] fila=new Object[6];
                fila[0]=item.getIdClub();
                fila[1]=item.getNombre();
                fila[2]=item.getFecha_fundacion();
                fila[3]=item.getPresidente();
                fila[4]=item.getEstadio();
                fila[5]=item.getIdEntrenador();
                modelo.addRow(fila);
            }           
        } catch (Exception e) {
        }
    }

    private void LlenarNombres() {
        ArrayList<Club> lista=new DaoClub().listarClub();
        cboNombre.removeAllItems();
        cboNombre.addItem("Seleccione...");
        for (Club item : lista) {
            cboNombre.addItem(item.getNombre());
        }
    }

    
}
