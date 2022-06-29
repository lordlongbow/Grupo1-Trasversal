
package grupo1.trasversal.vistas;

import grupo1.trasversal.Data.AlumnoData;
import grupo1.trasversal.Modelos.Alumno;
import javax.swing.JOptionPane;
import grupo1.trasversal.Data.Conexion;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author Grupo 1
 */
public class InscripcionAlumnoAgos extends javax.swing.JInternalFrame {

    private AlumnoData ad;
    
    public InscripcionAlumnoAgos(Conexion conexion) {
        
        initComponents();
        desactivaCampos();
        ad=new AlumnoData(conexion);
        //limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNombreAlumno = new javax.swing.JTextField();
        jtApellidoAlumno = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        bGuardarAlumno = new java.awt.Button();
        bSalirAlumno = new java.awt.Button();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jbNuevo = new java.awt.Button();
        jlIdAlumno = new javax.swing.JLabel();

        button1.setLabel("button1");

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inscripcion de Alumno");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("DNI");

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("N° de Alumno");

        jtNombreAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreAlumnoFocusLost(evt);
            }
        });

        jtApellidoAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtApellidoAlumnoFocusLost(evt);
            }
        });

        jtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDniFocusLost(evt);
            }
        });

        bGuardarAlumno.setBackground(new java.awt.Color(0, 153, 153));
        bGuardarAlumno.setEnabled(false);
        bGuardarAlumno.setLabel("Guardar");
        bGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarAlumnoActionPerformed(evt);
            }
        });

        bSalirAlumno.setBackground(new java.awt.Color(0, 153, 153));
        bSalirAlumno.setLabel("Salir");
        bSalirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirAlumnoActionPerformed(evt);
            }
        });

        jdFechaNacimiento.setDateFormatString("yyyy/MM/dd");

        jbNuevo.setActionCommand("Nuevo");
        jbNuevo.setBackground(new java.awt.Color(0, 153, 153));
        jbNuevo.setLabel("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jlIdAlumno.setText("ID alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNombreAlumno)
                            .addComponent(jtApellidoAlumno)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSalirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlIdAlumno))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(bSalirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirAlumnoActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bSalirAlumnoActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        activaCampos();
        bGuardarAlumno.setEnabled(true);
        //limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtNombreAlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreAlumnoFocusLost
        
        if(jtNombreAlumno.getText().length()==0){
            JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras y no estar vacio");
            jtNombreAlumno.requestFocus();
        }
    }//GEN-LAST:event_jtNombreAlumnoFocusLost

    private void jtApellidoAlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoAlumnoFocusLost
        if(jtApellidoAlumno.getText().length()==0){
            JOptionPane.showMessageDialog(this, "El apellido debe contener solo letras y no estar vacio");
            jtApellidoAlumno.requestFocus();
        }
    }//GEN-LAST:event_jtApellidoAlumnoFocusLost

    private void jtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDniFocusLost
        try{
            String dn= jtDni.getText();
            int dni=Integer.parseInt(dn);
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "El DNI debe contener solo números");
            jtDni.requestFocus();
        }
    }//GEN-LAST:event_jtDniFocusLost

    private void bGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarAlumnoActionPerformed

        Alumno an=new Alumno();
       an.setNombre(jtNombreAlumno.getText());
       an.setApellido(jtApellidoAlumno.getText());
       java.util.Date fecha = jdFechaNacimiento.getDate();
       
        //convierto el date del formulario en localDate para ingresarlo en la clase alumno
        LocalDate fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

       an.setFechNac(fechaN);
       an.setDni(Integer.parseInt(jtDni.getText()));
       an.setActivo(true);
       
        if(ad.agregarAlumno(an)){
            JOptionPane.showMessageDialog(null, "Alumno Agregado Exitosamente");
            limpiarCampos();
            desactivaCampos();
            bGuardarAlumno.setEnabled(false);
        }
    }//GEN-LAST:event_bGuardarAlumnoActionPerformed

    private void limpiarCampos() {

        jtDni.setText("");
        jtApellidoAlumno.setText("");
        jtNombreAlumno.setText("");
        jlIdAlumno.setText("");
        jdFechaNacimiento.setDate(null);

    }
    private void activaCampos(){
        jtDni.setEnabled(true);
        jtApellidoAlumno.setEnabled(true);
        jtNombreAlumno.setEnabled(true);
        jlIdAlumno.setEnabled(true);
        jdFechaNacimiento.setEnabled(true);
    }
        private void desactivaCampos(){
        jtDni.setEnabled(false);
        jtApellidoAlumno.setEnabled(false);
        jtNombreAlumno.setEnabled(false);
        jlIdAlumno.setEnabled(false);
        jdFechaNacimiento.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bGuardarAlumno;
    private java.awt.Button bSalirAlumno;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.Button jbNuevo;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private javax.swing.JLabel jlIdAlumno;
    private javax.swing.JTextField jtApellidoAlumno;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombreAlumno;
    // End of variables declaration//GEN-END:variables

}