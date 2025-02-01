import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase= scn.nextLine().replace(" ","");

        System.out.println("Ingresa una letra: ");
        String letr= scn.nextLine();

        if (letr.length() != 1) {
            System.out.println("Por favor, ingresa solo una letra.");
        } else {
            char letra = letr.charAt(0);
            int contador = 0;

            for (char c : frase.toCharArray()) {
                if (c == letra) {
                    contador++;
                }
            }
            System.out.println("La cantidad de veces que la letra '" + letr + "' se repite en \"" +
                    frase + "\" es: " + contador);
        }
        scn.close();
    }
}
