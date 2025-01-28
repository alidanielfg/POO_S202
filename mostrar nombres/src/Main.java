import java.util.Locale;
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
        System.out.println(nombre.toUpperCase().charAt(0)+ nombre.substring(1, nombre.length()).toLowerCase()+(" ")+
                apellidop.toUpperCase().charAt(0)+ apellidop.substring(1, apellidop.length()).toLowerCase()+(" ")+
                apellidom.toUpperCase().charAt(0)+ apellidom.substring(1, apellidom.length()).toLowerCase());
    }
}