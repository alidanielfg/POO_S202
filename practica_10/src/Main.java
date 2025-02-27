import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase contrasenias
        contrasenias generador = new contrasenias();

        JOptionPane.showMessageDialog(null, "Bienvenido");
        int longitud = contrasenias.obtenerLongitud(JOptionPane.showInputDialog("Ingrese la cantidad de caracteres que quiere en su contraseña:"));
        int mayusculas = JOptionPane.showOptionDialog(null, "¿Desea mayúsculas en su contraseña?", "Mayúsculas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "Sí");
        int especiales = JOptionPane.showOptionDialog(null, "¿Desea caracteres especiales en su contraseña?", "Carácter especial", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "Sí");

        // Generar la contraseña según las opciones seleccionadas
        String contrasena = generador.generarContrasenaSegunOpciones(longitud, mayusculas == JOptionPane.YES_OPTION, especiales == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Su contraseña generada es: " + contrasena);

        // Evaluar la fortaleza de la contraseña generada
        if (contrasenias.contrasegura(contrasena)) {
            JOptionPane.showMessageDialog(null, "¡La contraseña es segura!");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no es segura.");
        }
    }
}
