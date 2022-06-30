package grupo1.trasversal.vistas;

import grupo1.trasversal.Data.Conexion;
import grupo1.trasversal.Data.MateriaData;
import grupo1.trasversal.Modelos.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 1
 */
public class InscripcionMateria extends javax.swing.JInternalFrame {

    private MateriaData md;
    private DefaultTableModel modelo;

    /**
     * Creates new form InscripcionMateria
     */
    public InscripcionMateria(Conexion conexion) {
        initComponents();
        desactivaCampos();
        md= new MateriaData(conexion);
        modelo=new DefaultTableModel();
        llenarCabeceraTabla();
        llenarComboAnio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGuardarMateria = new java.awt.Button();
        bSalirMateria = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtMateria = new javax.swing.JTextField();
        jtAnioMateria = new javax.swing.JTextField();
        jbNuevo = new java.awt.Button();
        jlIdMateria = new javax.swing.JLabel();
        jCheckBoxActivo = new javax.swing.JCheckBox();
        bBuscar = new java.awt.Button();
        bModificar = new java.awt.Button();
        bBorrar = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbAnio = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 102, 255));

        bGuardarMateria.setBackground(new java.awt.Color(0, 153, 153));
        bGuardarMateria.setLabel("Guardar");
        bGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarMateriaActionPerformed(evt);
            }
        });

        bSalirMateria.setBackground(new java.awt.Color(0, 153, 153));
        bSalirMateria.setLabel("Salir");
        bSalirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirMateriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Materias");

        jLabel2.setText("N° de Materia");

        jLabel3.setText("Nombre de la Materia");

        jLabel4.setText("Año que se da la Materia");

        jtMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMateriaActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(0, 153, 153));
        jbNuevo.setLabel("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jlIdMateria.setText("ID Materia");

        jCheckBoxActivo.setSelected(true);
        jCheckBoxActivo.setText("Activo");

        bBuscar.setBackground(new java.awt.Color(0, 153, 153));
        bBuscar.setLabel("Buscar");
        bBuscar.setName("jbBuscar"); // NOI18N
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bModificar.setBackground(new java.awt.Color(0, 153, 153));
        bModificar.setLabel("Modificar");
        bModificar.setName("jbModificar"); // NOI18N

        bBorrar.setBackground(new java.awt.Color(0, 153, 153));
        bBorrar.setLabel("Borrar");
        bBorrar.setName("bBorrar"); // NOI18N
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jcbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlIdMateria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jcbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirMateriaActionPerformed
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_bSalirMateriaActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        activaCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void bGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarMateriaActionPerformed

        Materia materia = new Materia();
        materia.setNombre(jtMateria.getText());
        materia.setAnio(Integer.parseInt(jtAnioMateria.getText()));
        materia.setActivo(true);

        if (md.agregarMateria(materia)) {
            JOptionPane.showMessageDialog(null, "Materia Agregada Exitosamente");
            limpiarCampos();
            desactivaCampos();
            bGuardarMateria.setEnabled(false);
        }
    }//GEN-LAST:event_bGuardarMateriaActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed

        Materia materia = new Materia();
        materia.setNombre(jtMateria.getText());
//        materia.setAnio(Integer.parseInt(jtAnioMateria.getText()));
//        materia.setActivo(true);

        if (md.borrarMateriaXNombre(materia.getNombre())) {
            JOptionPane.showMessageDialog(null, "Materia borrada con Exito");
            limpiarCampos();
            desactivaCampos();
            bBorrar.setEnabled(false);
        }
        if (md.borrarMateriaXId(materia.getIdMateria())) {
            JOptionPane.showMessageDialog(null, "Materia borrada con Exito");
            limpiarCampos();
            desactivaCampos();
            bBorrar.setEnabled(false);
        }

    }//GEN-LAST:event_bBorrarActionPerformed

    private void jtMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMateriaActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bBuscarActionPerformed
    private void llenarCabeceraTabla(){
        ArrayList<Object> columna=new ArrayList<Object>();
        columna.add("ID");
        columna.add("Materia");
        columna.add("Anio");
        for(Object it:columna){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
    }
    
    private void llenarTabla(){
        Materia materia=(Materia)jcbAnio.getSelectedItem();
        //if()(materia m:md.obtenerMateria(anio)){}
        
        
    }
    private void llenarComboAnio(){
        
        jcbAnio.addItem("1");
        jcbAnio.addItem("2");
        jcbAnio.addItem("3");
        jcbAnio.addItem("4");
        
    }
    private void limpiarCampos() {

        jlIdMateria.setText("");
        jtAnioMateria.setText("");
        jtMateria.setText("");

    }
    
    private void activaCampos() {
        jtAnioMateria.setEnabled(true);
        jtMateria.setEnabled(true);
        jtAnioMateria.setEnabled(true);
    }

    private void desactivaCampos() {
        jtAnioMateria.setEnabled(false);
        jtMateria.setEnabled(false);
        jtAnioMateria.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bBorrar;
    private java.awt.Button bBuscar;
    private java.awt.Button bGuardarMateria;
    private java.awt.Button bModificar;
    private java.awt.Button bSalirMateria;
    private javax.swing.JCheckBox jCheckBoxActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Button jbNuevo;
    private javax.swing.JComboBox<String> jcbAnio;
    private javax.swing.JLabel jlIdMateria;
    private javax.swing.JTextField jtAnioMateria;
    private javax.swing.JTextField jtMateria;
    // End of variables declaration//GEN-END:variables
}
