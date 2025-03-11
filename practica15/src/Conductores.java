import javax.swing.*;

public class Conductores extends Empleados {
    private String licencia;

    public Conductores(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    public static String seleccionarLicencia() {
        String[] opciones = {"Tipo A", "Tipo B", "Tipo C"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de licencia:", "Tipo de Licencia",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        return opciones[seleccion];
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "Licencia: " + licencia);
    }
}