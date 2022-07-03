package grupo1.trasversal.vistas;

import grupo1.trasversal.Data.AlumnoData;
import grupo1.trasversal.Data.Conexion;
import grupo1.trasversal.Data.CursadaData;
import grupo1.trasversal.Data.MateriaData;
import grupo1.trasversal.Modelos.Alumno;
import grupo1.trasversal.Modelos.Cursada;
import grupo1.trasversal.Modelos.Materia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 1
 */
public class Inscripcion extends javax.swing.JInternalFrame {

    private ArrayList<Cursada> listaInscripcion;
    private ArrayList<Materia> listaMaterias;
    private CursadaData cursadaData;
    private MateriaData materiaData;

    private ArrayList<Alumno> listaAlumnos;

    private AlumnoData alumnoData;
    private DefaultTableModel modelo;

  
    public Inscripcion(Conexion conexion) {
        initComponents();
        cursadaData = new CursadaData(conexion);
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList<Alumno>) alumnoData.obtenerAlumnos();
        cargaAlumnos();
        modelo = new DefaultTableModel();
        armoTabla();
       
        listaInscripcion = (ArrayList) cursadaData.obtenerInscripciones();

        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList) materiaData.obtenerMaterias();

        listaAlumnos = (ArrayList) alumnoData.obtenerAlumnos();
        

    }

    private void cargoNoInscriptas() {

        borraFilasTabla();
        //Llenar filas

        Alumno seleccionado = (Alumno) jComboBoxAlumnos.getSelectedItem();

        ArrayList<Materia> lista = (ArrayList) cursadaData.alumnoNoCursa(seleccionado.getIdAlumno());

        for (Materia m : lista) {

            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});

        }

    }

    private void cargoInscriptas() {

        borraFilasTabla();
        //Llenar filas

        Alumno seleccionado = (Alumno) jComboBoxAlumnos.getSelectedItem();
        ArrayList<Materia> lista = (ArrayList) cursadaData.materiasInscriptoAlumno(seleccionado);
        
        
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio(),cursadaData.obtenerNota(seleccionado, m)});
        }
    }

    private void armoTabla() {

        //Titulos de Columnas
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");
        columnas.add("Nota");
        for (Object it : columnas) {

            modelo.addColumn(it);
        }
        tMaterias.setModel(modelo);
    }

    private void borraFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {

                modelo.removeRow(i);
            }
        }
    }

    private void cargaAlumnos() {
        //Carga las materias al ComboBox
        Collections.sort(listaAlumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno t, Alumno t1) {
                return t.getApellido().compareTo(t1.getApellido());
            }
        });
        for (Alumno aux : listaAlumnos) {
            jComboBoxAlumnos.addItem(aux);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonInscritas = new javax.swing.JRadioButton();
        jRadioButtonNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        btInscribir = new java.awt.Button();
        btAnular = new java.awt.Button();
        btSalir = new java.awt.Button();
        jBtnActualizarNota = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtNota = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del Alumno/a  ");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Listado De Materias");

        jRadioButtonInscritas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButtonInscritas.setText("INSCRIPTAS");
        jRadioButtonInscritas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonInscritasActionPerformed(evt);
            }
        });

        jRadioButtonNoInscriptas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButtonNoInscriptas.setText("NO INSCRIPTAS");
        jRadioButtonNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoInscriptasActionPerformed(evt);
            }
        });

        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tMaterias);

        btInscribir.setBackground(new java.awt.Color(0, 153, 153));
        btInscribir.setLabel("INSCRIBIR");
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });

        btAnular.setBackground(new java.awt.Color(0, 153, 153));
        btAnular.setLabel("ANULAR ");
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(0, 153, 153));
        btSalir.setLabel("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jBtnActualizarNota.setText("Modificar Nota");
        jBtnActualizarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarNotaActionPerformed(evt);
            }
        });

        jLabel4.setText("Cargar Nota Al Alumno");

        jtNota.setText("Cargar Nota");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonInscritas)
                                        .addGap(30, 30, 30)
                                        .addComponent(jRadioButtonNoInscriptas))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnActualizarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jComboBoxAlumnos))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonInscritas)
                    .addComponent(jRadioButtonNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnActualizarNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAnular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInscribir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tMaterias.getSelectedRow();

        if (filaSeleccionada != -1) {

            Alumno a = (Alumno) jComboBoxAlumnos.getSelectedItem();

            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);            
            double nota = 0;

            Cursada c = new Cursada(m, a, nota);

            cursadaData.guardarInscripcion(c);

            cargoNoInscriptas();
            //borraFilasTabla();

        }
    }//GEN-LAST:event_btInscribirActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {

            Alumno a = (Alumno) jComboBoxAlumnos.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            cursadaData.borrarCursada(a.getIdAlumno(), idMateria);
            //borraFilasTabla();
            
            cargoInscriptas();
        }
    }//GEN-LAST:event_btAnularActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void jRadioButtonInscritasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonInscritasActionPerformed
        // TODO add your handling code here:
        // jRadioButtonInscritas
        jRadioButtonNoInscriptas.setSelected(false);
        cargoInscriptas();
        btAnular.setEnabled(true);
        btInscribir.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonInscritasActionPerformed

    private void jRadioButtonNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoInscriptasActionPerformed
        // TODO add your handling code here:
        jRadioButtonInscritas.setSelected(false);
        cargoNoInscriptas();
        btAnular.setEnabled(false);
        btInscribir.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonNoInscriptasActionPerformed

    private void jBtnActualizarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarNotaActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {

            Alumno a = (Alumno) jComboBoxAlumnos.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int año = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia mat = new Materia(idMateria, nombreMateria, año, true);
            double nota = Double.parseDouble(jtNota.getText());
            cursadaData.actualizarNota(a, mat, nota);
            cargoInscriptas();
            //borraFilasTabla();

        }
    }//GEN-LAST:event_jBtnActualizarNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btAnular;
    private java.awt.Button btInscribir;
    private java.awt.Button btSalir;
    private javax.swing.JButton jBtnActualizarNota;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonInscritas;
    private javax.swing.JRadioButton jRadioButtonNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtNota;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables

   

}
