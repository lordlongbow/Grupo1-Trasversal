package grupo1.trasversal.vistas;

import grupo1.trasversal.Data.Conexion;

/**
 *
 * @author Grupo 1
 */
public class Escritorio extends javax.swing.JFrame {

    private Conexion conexion;

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
        initComponents();
        conexion = new Conexion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmInscripcion = new javax.swing.JMenu();
        jMiInscripcion = new javax.swing.JMenuItem();
        jmAlumno = new javax.swing.JMenu();
        jmiAlumno = new javax.swing.JMenuItem();
        jmInforme = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiMateria = new javax.swing.JMenuItem();
        jMConsultaM = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo1/trasversal/vistas/Fondo2.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jMenuBar1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jmInscripcion.setBorder(new javax.swing.border.MatteBorder(null));
        jmInscripcion.setText("Inscripcion");
        jmInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionActionPerformed(evt);
            }
        });

        jMiInscripcion.setText("Formulario de Inscripciones y Cursadas");
        jMiInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiInscripcionActionPerformed(evt);
            }
        });
        jmInscripcion.add(jMiInscripcion);

        jMenuBar1.add(jmInscripcion);

        jmAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jmAlumno.setText("Alumno ");

        jmiAlumno.setText("Formulario de Alumnos");
        jmiAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiAlumno);

        jMenuBar1.add(jmAlumno);

        jmInforme.setBorder(new javax.swing.border.MatteBorder(null));
        jmInforme.setText("Ajustes");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmInforme.add(jmiSalir);

        jMenuBar1.add(jmInforme);

        jmMateria.setBorder(new javax.swing.border.MatteBorder(null));
        jmMateria.setText("Materia");

        jmiMateria.setText("Formulario de Materias");
        jmiMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmiMateria);

        jMConsultaM.setText("Listado de Alumnos por Materia");
        jMConsultaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaMActionPerformed(evt);
            }
        });
        jmMateria.add(jMConsultaM);

        jMenuBar1.add(jmMateria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jMenuBar1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jMenuBar1CaretPositionChanged

    }//GEN-LAST:event_jMenuBar1CaretPositionChanged

    private void jmiMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMateriaActionPerformed

        jDesktopPane1.removeAll();
        InscripcionMateria im = new InscripcionMateria(conexion);
        im.setVisible(true);
        jDesktopPane1.add(im);
        jDesktopPane1.moveToFront(im);
        jDesktopPane1.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_jmiMateriaActionPerformed

    private void jMiInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiInscripcionActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Inscripcion ins = new Inscripcion(conexion);
        ins.setVisible(true);
        jDesktopPane1.add(ins);
        jDesktopPane1.moveToFront(ins);
        jDesktopPane1.repaint();

    }//GEN-LAST:event_jMiInscripcionActionPerformed

    private void jmInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionActionPerformed
       

    }//GEN-LAST:event_jmInscripcionActionPerformed

    private void jmiAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnoActionPerformed
        jDesktopPane1.removeAll();
        InscripcionAlumno ia = new InscripcionAlumno(conexion);
        ia.setVisible(true);
        jDesktopPane1.add(ia);
        jDesktopPane1.moveToFront(ia);
        jDesktopPane1.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAlumnoActionPerformed

    private void jMConsultaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaMActionPerformed
            // TODO add your handling code here:
        jDesktopPane1.removeAll();
        ConsultaMateria ca = new ConsultaMateria(conexion);
        ca.setVisible(true);
        jDesktopPane1.add(ca);
        jDesktopPane1.moveToFront(ca);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jMConsultaMActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMConsultaM;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMiInscripcion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmInforme;
    private javax.swing.JMenu jmInscripcion;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenuItem jmiAlumno;
    private javax.swing.JMenuItem jmiMateria;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
