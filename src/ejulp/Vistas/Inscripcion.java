package ejulp.Vistas;

import ejulp.AccesoAdatos.AlumnoData;
import ejulp.AccesoAdatos.InscripcionData;
import ejulp.Entidades.Alumno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import ejulp.Entidades.MateriaClass;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import ejulp.Entidades.InscripcionClass;
import javax.swing.JOptionPane;

/**
 *
 * @author Nickemolmedo.
 */
public final class Inscripcion extends javax.swing.JInternalFrame {

    private final DefaultComboBoxModel modeloComboAlumnos;
    private DefaultTableModel modelo;

    /**
     * Creates new form Inscripcion
     */
    public Inscripcion() {
        initComponents();
        modeloComboAlumnos = new DefaultComboBoxModel<>(); // Crea el modelo de ComboBox
        modelo = new DefaultTableModel();
        combobox_ListarAlumnos.setModel(modeloComboAlumnos); // Asigna el modelo al JComboBox
        cargarCombo(); // Llena el modelo con datos
        armarCabecera();

        ButtonGroup AgruparBotones = new ButtonGroup();
        AgruparBotones.add(button_MateriasInscriptas);
        AgruparBotones.add(button_materiasNoIncriptas);

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
        jLabel2 = new javax.swing.JLabel();
        combobox_ListarAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_materias = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        button_MateriasInscriptas = new javax.swing.JRadioButton();
        button_salir = new javax.swing.JButton();
        boton_anular = new javax.swing.JButton();
        boton_inscribir = new javax.swing.JButton();
        button_materiasNoIncriptas = new javax.swing.JRadioButton();

        jLabel2.setText("Seleccione un Alumno:");

        combobox_ListarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_ListarAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        tabla_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "AÑO"
            }
        ));
        jScrollPane1.setViewportView(tabla_materias);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        button_MateriasInscriptas.setText("Materias Inscriptas");
        button_MateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_MateriasInscriptasActionPerformed(evt);
            }
        });

        button_salir.setText("Salir");
        button_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_salirActionPerformed(evt);
            }
        });

        boton_anular.setText("Anular Inscripcion");
        boton_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_anularActionPerformed(evt);
            }
        });

        boton_inscribir.setText("Inscribir");
        boton_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inscribirActionPerformed(evt);
            }
        });

        button_materiasNoIncriptas.setText("Materias no Inscriptas");
        button_materiasNoIncriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_materiasNoIncriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(button_materiasNoIncriptas)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(combobox_ListarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_MateriasInscriptas))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_inscribir)
                        .addGap(18, 18, 18)
                        .addComponent(boton_anular)
                        .addGap(18, 18, 18)
                        .addComponent(button_salir)
                        .addGap(298, 298, 298))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combobox_ListarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_MateriasInscriptas)
                    .addComponent(button_materiasNoIncriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_salir)
                    .addComponent(boton_inscribir)
                    .addComponent(boton_anular))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    AlumnoData alumnodata_temporal = new AlumnoData();

    InscripcionData inscripciondata_temporal = new InscripcionData();


    public void cargarCombo() {

        ArrayList<Alumno> listadoAlumnos = alumnodata_temporal.listarAlumnos();

        // Limpia el modelo actual si es necesario
        modeloComboAlumnos.removeAllElements();

        // Agrega los objetos Alumno al modelo del ComboBox
        for (Alumno alumno : listadoAlumnos) {

            modeloComboAlumnos.addElement(alumno);

        }
    }

    private void armarCabecera() {

        ArrayList<Object> fila_cabecera = new ArrayList<>();

        fila_cabecera.add("ID");
        fila_cabecera.add("NOMBRE");
        fila_cabecera.add("AÑO");

        for (Object lector : fila_cabecera) {

            modelo.addColumn(lector);

        }

        tabla_materias.setModel(modelo);
    }

    private void borrarFilas() {

        int rowCount = modelo.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }


    private void combobox_ListarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_ListarAlumnosActionPerformed


    }//GEN-LAST:event_combobox_ListarAlumnosActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed

        this.dispose();

    }//GEN-LAST:event_button_salirActionPerformed

    private void button_MateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_MateriasInscriptasActionPerformed

        borrarFilas();

        Alumno seleccionado = (Alumno) combobox_ListarAlumnos.getSelectedItem();

        ArrayList<MateriaClass> listadoMaterias = inscripciondata_temporal.obtenerMateriasCursadas(seleccionado.getIdAlumno());

        for (MateriaClass materias : listadoMaterias) {

            modelo.addRow(new Object[]{materias.getIdMateria(), materias.getNombre(), materias.getAnioMateria()});

        }

        boton_inscribir.setEnabled(false);
        boton_anular.setEnabled(true);


    }//GEN-LAST:event_button_MateriasInscriptasActionPerformed

    private void button_materiasNoIncriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_materiasNoIncriptasActionPerformed

        borrarFilas();

        Alumno seleccionado = (Alumno) combobox_ListarAlumnos.getSelectedItem();

        ArrayList<MateriaClass> listadoMaterias = inscripciondata_temporal.obtenerMateriasNoCursadas(seleccionado.getIdAlumno());

        for (MateriaClass materias : listadoMaterias) {

            modelo.addRow(new Object[]{materias.getIdMateria(), materias.getNombre(), materias.getAnioMateria()});

        }

        boton_inscribir.setEnabled(true);
        boton_anular.setEnabled(false);


    }//GEN-LAST:event_button_materiasNoIncriptasActionPerformed

    private void boton_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inscribirActionPerformed

        borrarFilas();

        int fila_seleccionada = tabla_materias.getSelectedRow();

        if (fila_seleccionada != -1) {

            Alumno inscribir_alumno = (Alumno) combobox_ListarAlumnos.getSelectedItem();

            int idMateria = (int) modelo.getValueAt(fila_seleccionada, 0);

            String nombreMateria = (String) modelo.getValueAt(fila_seleccionada, 1);

            int anio = (int) modelo.getValueAt(fila_seleccionada, 2);

            MateriaClass inscribir_materia = new MateriaClass(idMateria, nombreMateria, anio, true);

            InscripcionClass nueva_inscripcion = new InscripcionClass(inscribir_alumno, inscribir_materia, 0);

            inscripciondata_temporal.inscripcion(nueva_inscripcion);

        }


    }//GEN-LAST:event_boton_inscribirActionPerformed

    private void boton_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_anularActionPerformed

        int fila_seleccionada = tabla_materias.getSelectedRow();

        if (fila_seleccionada != -1) {

            Alumno anularinscripcion_alumno = (Alumno) combobox_ListarAlumnos.getSelectedItem();

            int idMateria = (int) tabla_materias.getValueAt(fila_seleccionada, 0);

            inscripciondata_temporal.borrarInscripcionMateriaAlumno(anularinscripcion_alumno.getIdAlumno(), idMateria);

        } else {

            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila...");

        }

        borrarFilas();

    }//GEN-LAST:event_boton_anularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_anular;
    private javax.swing.JButton boton_inscribir;
    private javax.swing.JRadioButton button_MateriasInscriptas;
    private javax.swing.JRadioButton button_materiasNoIncriptas;
    private javax.swing.JButton button_salir;
    private javax.swing.JComboBox<String> combobox_ListarAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_materias;
    // End of variables declaration//GEN-END:variables
}
