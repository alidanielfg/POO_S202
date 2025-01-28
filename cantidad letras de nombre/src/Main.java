import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese tu nombre completo: ");
        String nombre = scn.nextLine();

        System.out.println(nombre.toUpperCase());
        System.out.println("Tu nombre tiene " + nombre.replace(" ", "").length() +
                " caracteres");
    }
}