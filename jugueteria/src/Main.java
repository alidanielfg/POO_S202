import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pesom= 75;
        int pesop= 112;
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese la cantidad de payasos por pedido: ");
        int payasos= scn.nextInt();

        System.out.println("Ingrese la cantidad de muñecas por pedido: ");
        int munecas= scn.nextInt();

        int peso_total= (payasos * pesop) + (munecas * pesom);

        System.out.println("El peso total del paquete es: "+ peso_total);
    }
}