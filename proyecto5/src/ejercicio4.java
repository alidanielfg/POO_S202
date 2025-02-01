import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero= scn.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
