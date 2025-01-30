import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese una contraseña: ");
        String contrasena= scn.nextLine();

        System.out.println("Confirme su contraseña: ");
        String confirmacion= scn.nextLine();

        if(contrasena.equals(confirmacion)){
            System.out.println("Contraseña confirmada");
            }
        else{
            System.out.println("Su contraseña no coincide");
        }

    }
}