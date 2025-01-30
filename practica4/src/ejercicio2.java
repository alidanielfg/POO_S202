import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese in numero: ");
        int num= scn.nextInt();

        if(num%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
}
