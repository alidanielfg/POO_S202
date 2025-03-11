import javax.swing.*;

public class Administrativos extends Empleados{
    private String departamento;

    public Administrativos(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "Departamento: " + departamento);
    }
}