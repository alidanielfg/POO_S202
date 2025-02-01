import java.util.Scanner;

public class proy5ej3 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int multiplicacion;

        System.out.println("Ingrese un numero (1-10): ");
        int num= scn.nextInt();

        for (int i=0; i<=10; i++) {
            multiplicacion = num * i;
            System.out.println(num + "*" + i + "=" + multiplicacion);
        }
    }
}
