import javax.swing.*;

public class entregas {
    private int noguia;
    private String estado;
    private String nuevoestado;

    private static final String[] estadoperm= {"pendiente","en transito", "entregado"};

    public entregas() {
        this.noguia =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de guia"));
        this.estado = "pendiente";
    }

    public void modificarestado(){
        boolean estadoValido = false;
        while (!estadoValido) {
            nuevoestado = JOptionPane.showInputDialog(null, "Actualizar estado de envío (pendiente, en trnsito, entregado): ",
                    "en transito");
            for (String estadoPermitido : estadoperm) {
                if (nuevoestado.equals(estadoPermitido)) {
                    estadoValido = true;
                    this.estado = nuevoestado;
                    break;
                }
            }
            if (!estadoValido) {
                JOptionPane.showMessageDialog(null, "Estado inválido. Solo se permiten los estados 'pendiente'," +
                        " 'en tránsito', 'entregado'. Inténtalo de nuevo.");
            }
        }
    }
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Número de guía: " + noguia + "\nEstado: " + estado);
    }
}
