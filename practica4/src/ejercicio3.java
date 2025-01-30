import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad= scn.nextInt();

        if (0 <= edad && edad <= 4) {
            System.out.println("Entras gratis");
        } else if (edad > 4 && edad <= 18) {
            System.out.println("Pagas 110");
        }else{
            System.out.println("Pagas 190");
        }
    }
}
