import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre= scn.nextLine();

        System.out.println("Ingrese su apellido paterno: ");
        String apellidop= scn.nextLine();

        System.out.println("Ingrese su apellido materno: ");
        String apellidom= scn.nextLine();

        System.out.println(nombre.toUpperCase()+ apellidop.toUpperCase()+ apellidom.toUpperCase());
        System.out.println(nombre.toLowerCase()+ apellidop.toLowerCase()+ apellidom.toLowerCase());

        char inicialN = nombre.toUpperCase().charAt(0);
        char inicialAP = apellidop.toUpperCase().charAt(0);
        char inicialAM = apellidom.toUpperCase().charAt(0);

        System.out.println("Iniciales: "+ inicialN+ inicialAP+ inicialAM);
    }
}