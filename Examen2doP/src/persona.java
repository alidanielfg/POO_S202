import javax.swing.*;
import java.security.SecureRandom;

public class persona {
    private String nombre;
    private String apellidop;
    private String apellidom;
    private int nacimiento;
    private String carrera;
    private int anioactual=2025;

    public persona(String nombre, String apellidop, String apellidom, int nacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.nacimiento = nacimiento;
        this.carrera = carrera;

        setNombre(JOptionPane.showInputDialog(null,"Ingrese su nombre: "));
        setApellidop(JOptionPane.showInputDialog(null,"Ingrese su apellido paterno: "));
        setApellidom(JOptionPane.showInputDialog(null,"Ingrese su apellidop materno: "));
        setNacimiento(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su año de nacimiento: ")));
        setCarrera(JOptionPane.showInputDialog(null,"Ingrese su carrera: "));
    }

    public static String aleatorios(int longitud){
        final String chars = "1234567890";
        return aleatorio(longitud, chars);
    }

    private static String aleatorio(int longitud, String chars) {
        SecureRandom digitos = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<longitud; i++){
            int randomp=digitos.nextInt(chars.length());
            sb.append(chars.charAt(randomp));
        }
        return sb.toString();
    }

    String digitos=aleatorios(0);

    public void generamatricula(){
        String actual=String.valueOf(anioactual);
        String nacimiento2 = String.valueOf(nacimiento);
        JOptionPane.showMessageDialog(null,"Su matricula es: " + carrera.substring(0,3).toUpperCase()+actual.substring(2,4).toUpperCase()+
                nacimiento2.substring(2,4).toUpperCase()+nombre.substring(0,1).toUpperCase()+
                apellidop.substring(0,3).toUpperCase()+apellidom.substring(0,3).toUpperCase()+aleatorios(3)+digitos);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}//CIERRE DE CLASE