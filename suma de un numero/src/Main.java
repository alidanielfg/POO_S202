import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero= scn.nextInt();

        int total=0;
        for (int i=1; i<=numero; i++){
            total+=i;
        }
        System.out.println("El resultado de la suma es: "+ total);
    }
}