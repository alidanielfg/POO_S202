import java.util.Scanner;

class StringBuilderReversal{
    public class Main {
        public static void main(String[] args) {
            Scanner scn= new Scanner(System.in);

            System.out.println("Ingresa una frase: ");
            String frase= scn.nextLine();

            String reverso= new StringBuilder(frase).reverse().toString();
            System.out.println(reverso);
        }
    }
}