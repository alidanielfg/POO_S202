import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Registrar vehículo", "Registrar conductor", "Asignar conductor",
                "Registrar envío (con peso)", "Registrar envío (sin peso)", "Registrar entrega",
                "Actualizar estado de Entrega", "Mostrar Información", "Salir"};

        vehiculo vehiculoActual = null;
        conductores conductorActual = null;
        envios envioActual = null;
        entregas entregaActual = null;

        while (true) {
            String opcion = (String) JOptionPane.showInputDialog(null, "Menú:\n1. Registrar Vehículo \n2. Registrar Conductor" +
                            "\n3. Asignar Conductor \n4. Registrar Envío (con peso) \n5. Registrar Envío (sin peso) " +
                            "\n6. Registrar Entrega \n7. Actualizar estado de entrega \n8. Mostrar información \n9. Salir",
                    "Menú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada. Cerrando el programa.");
                System.exit(0); // Cierra el programa
            }

            switch (opcion) {
                case "Registrar vehículo":
                    vehiculoActual = new vehiculo("", "", 0);
                    break;
                case "Registrar conductor":
                    conductorActual = new conductores("", "", 0);
                    break;
                case "Asignar conductor":
                    if (vehiculoActual != null && conductorActual != null) {
                        vehiculoActual.AsignarConductor(conductorActual);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar un vehículo y un conductor primero.");
                    }
                    break;
                case "Registrar envío (con peso)":
                    envioActual = new envios(0, 0, "");
                    break;
                case "Registrar envío (sin peso)":
                    envioActual = new envios(0, "");
                    break;
                case "Registrar entrega":
                    entregaActual = new entregas();
                    break;
                case "Actualizar estado de Entrega":
                    if (entregaActual != null) {
                        entregaActual.modificarestado();
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar una entrega primero.");
                    }
                    break;
                case "Mostrar Información":
                    if (vehiculoActual != null) {
                        vehiculoActual.mostrarinfo();
                    }
                    if (conductorActual != null) {
                        conductorActual.mostrarinfo();
                    }
                    if (envioActual != null) {
                        envioActual.Mostrarinfo();
                    }
                    if (entregaActual != null) {
                        entregaActual.mostrarInfo();
                    }
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Hasta pronto.");
                    System.exit(0); // Cierra el programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }//CIERRE STATIC VOID
}//CIERRE MAIN