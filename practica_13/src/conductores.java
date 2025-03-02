import javax.swing.*;

public class conductores {
    private String nombre;
    private String identificacion;
    private int nolicencia;

    public conductores(String nombre, String identificacion, int nolicencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nolicencia = nolicencia;

        setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del conductor: ","Conductores",JOptionPane.INFORMATION_MESSAGE));
        setIdentificacion(JOptionPane.showInputDialog(null,"Ingrese su curp","Curp",JOptionPane.INFORMATION_MESSAGE));
        setNolicencia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de licencia","Licencia",JOptionPane.INFORMATION_MESSAGE)));
    }

    public void mostrarinfo(){
        JOptionPane.showMessageDialog(null,"Nombre: "+ getNombre()+ "\nIdentificación:" + getIdentificacion()+ "\nlicencia: "+ getNolicencia());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getNolicencia() {
        return nolicencia;
    }

    public void setNolicencia(int nolicencia) {
        this.nolicencia = nolicencia;
    }
}