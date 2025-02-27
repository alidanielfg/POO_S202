import java.security.SecureRandom;//LIBRERIA QUE GENERA NUMEROS CRIPTOGRAFICOS ALEATORIAMENTE

public class contrasenias {

    private final SecureRandom contra;

    public contrasenias() {
        this.contra=new SecureRandom();
    }

    public static int obtenerLongitud(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 8;//Se define 8 como default si no se ingresa nada
        }
        try {
            int longitud = Integer.parseInt(input);
            return Math.max(longitud, 0); // Permite desde 0 caracteres en adelante
        } catch (NumberFormatException e) {
            return 8;//SI SE INGRESA UN VALOR NO VALIDO, SE PONDRA 8 POR DEFAULT
        }
    }

    //CREA UNA CONTRASEÑA SIN MAYUSCULAS NI CARACTERES
    private String basica(int longitud) {
        final String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //CREA UNA CONTRASEÑA CON CARACTERES Y MAYUSCULAS
    private String contodo(int longitud) {
        final String chars = "$%&!#ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //CREA UNA CONTRASEÑA SIN CARACTERES PERO CON MAYUSCULAS
    private String sincaracteres(int longitud) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //CREA CONTRASEÑA SIN MAYUSCULAS PERO CON CARACTERES
    private String sinmayusculas(int longitud) {
        final String chars = "$%&!#abcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //AQUI SE GENERA LA CONTRASEÑA
    private String generarContrasena(int longitud, String chars) {
        StringBuilder sb = new StringBuilder();
        //SE UTILIZA UN FOR DONDE SE UTILIZA EL VALOR DE LONGITUD PARA CREAR LA CONTRASEÑA
        for (int i = 0; i < longitud; i++) {
            int randomp = contra.nextInt(chars.length());
            sb.append(chars.charAt(randomp));
        }
        return sb.toString();//REGRESA LA CONTRASEÑA
    }
    //VERIFICACION DE SEGURIDAD
    public static boolean contrasegura(String contrasena) {

        boolean mayuscula = false;
        boolean simbolo = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char l = contrasena.charAt(i);
            if (Character.isUpperCase(l)) {
                mayuscula = true;
            }
            if ("$%&!#".indexOf(l) != -1) {
                simbolo = true;
            }
        }
        return contrasena.length() >= 8 && mayuscula && simbolo;
    }
    public String generarContrasenaSegunOpciones(int longitud, boolean incluirMayusculas, boolean incluirCaracteresEspeciales) {
        if (incluirMayusculas && incluirCaracteresEspeciales) {
            return contodo(longitud);
        } else if (!incluirMayusculas && incluirCaracteresEspeciales) {
            return sinmayusculas(longitud);
        } else if (incluirMayusculas && !incluirCaracteresEspeciales) {
            return sincaracteres(longitud);
        } else {
            return basica(longitud);
        }
    }
}