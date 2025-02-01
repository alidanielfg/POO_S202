import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase= scn.nextLine().replace(" ","");

        System.out.println("Ingresa una letra: ");
        String letr= scn.nextLine();

        int letra= letr.indexOf(frase);

        System.out.println("La cantidad de veces que la letra "+ letr+ " se repite en " +
                frase+ " son: "+ letra);
    }
}
