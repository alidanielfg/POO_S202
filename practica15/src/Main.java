import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empleados[] empleados = new Empleados[100];
        int count = 0;

        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n1. Agregar Empleado\n2. Listar Empleados\n3. Salir");
            switch (opcion) {
                case "1":
                    String tipo = JOptionPane.showInputDialog("Tipo de Empleado:\n1. Conductor\n2. Administrativo");
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));

                    if (tipo.equals("1")) {
                        String licencia = Conductores.seleccionarLicencia();
                        empleados[count++] = new Conductores(nombre, id, salario, licencia);
                    } else if (tipo.equals("2")) {
                        String departamento = JOptionPane.showInputDialog("Departamento:");
                        empleados[count++] = new Administrativos(nombre, id, salario, departamento);
                    }
                    break;
                case "2":
                    for (int i = 0; i < count; i++) {
                        empleados[i].mostrarInfo();
                    }
                    break;
                case "3":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }        }    } }