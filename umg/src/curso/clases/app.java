package curso.clases;
import curso.clases.Estudiante;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mlinares on 4/07/2017.
 */
public class app extends JDialog {
    public JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JButton buttonAgregar;
    private JButton estudianteButton;
    private JTable table1;
    private JButton promedioButton;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton eliminarButton;
    private DefaultTableModel tableModel;
    Profesor pro = new Profesor();
    Estudiante d = new Estudiante();

    public app() {

       // setContentPane(contentPane);
        setModal(true);
        Profesor p=new Profesor();
        getRootPane().setDefaultButton(buttonAgregar);
        tableModel = new DefaultTableModel();

        tableModel.addColumn("Nombre");
        tableModel.addColumn("Edad");
        tableModel.addColumn("Nota");
        tableModel.addColumn("Asignatura");
        table1.setModel(tableModel);

        buttonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAdd();
            }
        });

        promedioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                JOptionPane.showMessageDialog(null, "El Promedio es: "+d.promedioNotas());


            }
        });

        estudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null,"Destacado: "+ pro.estudianteMasDestacado().getNombre());

            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDelete();
            }
        });
    }

    private void onAdd() {
        String name = textField1.getText();
        int nota = Integer.parseInt(textField3.getText());
        int age = Integer.parseInt(textField2.getText());
        String asignauta = textField4.getText();
        int cantidadAsigna = Integer.parseInt(textField5.getText());

        d.setEdad(age);
        d.setNombre(name);
        pro.estudianteMasDestacado();
        Asignatura asigna = new Asignatura(asignauta,nota,cantidadAsigna);
        d.addAsignatura(asigna);
        pro.addEstudiante(d);

        clearFields();

        tableModel.addRow(new Object[]{d.getNombre(), d.getEdad(),nota,asignauta});
        JOptionPane.showMessageDialog(this, "Estudiante Agregado");


    }
    private void onDelete() {
        /*int cant = tableModel.getRowCount();
        JOptionPane.showMessageDialog(null,"La cantidad es de: " + cant);*/
        //int s = table1.getSelectedRow();
        //JOptionPane.showMessageDialog(null,"La cantidad es de: " + s);
        //JOptionPane.showMessageDialog(null,"La cantidad es de: " + d.getNombre()+d.getEdad()+d.getAsignaturas());
        table1.getSelectedRow();
        String j =d.getNombre();
        tableModel.removeRow(table1.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Estudiante eliminado");

        //pro.deleteEstudiante();


    }

    private void clearFields() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
    }
}
