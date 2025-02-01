import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Ingresa la base del árbol: ");
        int base= scanner.nextInt();

        if (base <= 0) {
            System.out.println("La base debe ser un número positivo.");
            return;
        }

        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= base - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
