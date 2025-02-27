import java.security.SecureRandom;//LIBRERIA QUE GENERA NUMEROS CRIPTOGRAFICOS ALEATORIAMENTE

public class contrasenias {

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
    public static String basica(int longitud) {
        final String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //CREA UNA CONTRASEÑA CON CARACTERES Y MAYUSCULAS
    public static String contodo(int longitud) {
        final String chars = "$%&!#ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //CREA UNA CONTRASEÑA SIN CARACTERES PERO CON MAYUSCULAS
    public static String sincaracteres(int longitud) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //CREA CONTRASEÑA SIN MAYUSCULAS PERO CON CARACTERES
    public static String sinmayusculas(int longitud) {
        final String chars = "$%&!#abcdefghijklmnopqrstuvwxyz0123456789";
        return generarContrasena(longitud, chars);
    }
    //AQUI SE GENERA LA CONTRASEÑA
    public static String generarContrasena(int longitud, String chars) {
        SecureRandom contra = new SecureRandom();//SE UTILIZA PARA CREAR COSAS RANDOM
        StringBuilder sb = new StringBuilder();
        //SE UTILIZA UN FOR DONDE SE UTILIZA EL VALOR DE LONGITUD PARA CREAR LA CONTRASEÑA
        for (int i = 0; i < longitud; i++) {
            int randomp = contra.nextInt(chars.length());
            sb.append(chars.charAt(randomp));
        }
        return sb.toString();//REGRESA LA CONTRASEÑA
    }
    //VERIFICACION DE SEGURIDAD
    private static boolean contrasegura(String contrasena) {

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean simbolo = false;
        //SE LEE LA CONTRASEÑA PARA REVISAR QUE TIENE
        for (int i = 0; i < contrasena.length(); i++) {
            char l = contrasena.charAt(i);
            if (Character.isUpperCase(l)) {
                mayuscula = true;
            }
            if (Character.isLowerCase(l)) {
                minuscula = true;
            }
            if (Character.isDigit(l)) {
                numero = true;
            }
            if ("$%&!#".indexOf(l) != -1) {
                simbolo = true;
            }
        }
        // SE EVALUA LA CONTRASEÑA
        if (contrasena.length() >= 8 && mayuscula && simbolo) {
            return true; // Contraseña segura con al menos 8 caracteres, una mayúscula y un carácter especial
        } else if (contrasena.length() >= 8 && numero && minuscula && mayuscula) {
            return false; // Contraseña segura con al menos 8 caracteres, números, minúsculas y mayúsculas
        } else if (contrasena.length() >= 8 && contrasena.length() >=1 && numero && minuscula && mayuscula) {
            return true; // Contraseña segura con al menos 8 caracteres y todos los tipos de caracteres
        } else {
            return false; //LA CONTRASEÑA NO ES SEGURA SI NO CUMPLE NINGUNA DE LAS ANTERIORES
        }
    }
}