import java.util.Scanner;

class StringBulderReversal {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase= scn.nextLine().toLowerCase();

        String fraserev= new StringBuilder(frase).reverse().toString();
        if (fraserev.replace(" ", "").equals(frase.replace(" ",""))){
            System.out.println("La frase es un plaindromo");
        }else{
            System.out.println("La frase no es un palindromo");
        }
    }
}
