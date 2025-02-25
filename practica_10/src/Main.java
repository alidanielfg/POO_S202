import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido");

        int longitud = contrasenias.obtenerLongitud(JOptionPane.showInputDialog("Ingrese la cantidad de caracteres que quiere en su contraseña:"));

        int mayusculas = JOptionPane.showOptionDialog(null, "¿Desea mayúsculas en su contraseña?", "Mayúsculas",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "Sí");

        int especiales = JOptionPane.showOptionDialog(null, "¿Desea caracteres especiales en su contraseña?",
                "Carácter especial",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "Sí");

        String contrasena;

        // Generar la contraseña según las opciones seleccionadas
        if (mayusculas == JOptionPane.YES_OPTION && especiales == JOptionPane.YES_OPTION) {
            contrasena = contrasenias.contodo(longitud);
        } else if (mayusculas == JOptionPane.NO_OPTION && especiales == JOptionPane.YES_OPTION) {
            contrasena = contrasenias.sinmayusculas(longitud);
        } else if (mayusculas == JOptionPane.YES_OPTION && especiales == JOptionPane.NO_OPTION) {
            contrasena = contrasenias.sincaracteres(longitud);
        } else {
            contrasena = contrasenias.basica(longitud);
        }

        JOptionPane.showMessageDialog(null, "Su contraseña generada es: " + contrasena);

        // Evaluar la fortaleza de la contraseña generada
        if (contrasenias.contrasegura(contrasena)) {
            JOptionPane.showMessageDialog(null, "¡La contraseña es segura!");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no es segura.");
        }
    }
}
