import javax.swing.*;

public class Empleados {
    private String nombre;
    private int id;
    private double salario;
    private String[] nombres;

    public Empleados(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null,"nombre: "+ nombre+
        "\nid: "+id+"\nsalario: "+ salario);
    }
}
