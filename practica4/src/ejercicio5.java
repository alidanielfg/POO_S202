import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        int numero=4;

        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        float num1= scn.nextInt();

        System.out.println("Ingrese otro numero: ");
        float num2= scn.nextInt();

        System.out.println("Escoga una opcion:" +
                "\nSuma(1)"+ "\nResta(2)"+ "\nMultilicacion(3)"+ "\nDivision(4)");
        numero = scn.nextInt();
        switch (numero){
            case(1):{
                System.out.println(num1+ "+"+ num2+ "="+ (num1+num2));
                break;
            }
            case(2):{
                System.out.println("La resta da: "+ (num1-num2));
                break;
            }
            case(3):{
                System.out.println("La multiplicacion da: "+ (num1*num2));
                break;
            }
            case(4):{
                System.out.println("La division da: "+ (num1/num2));
                break;
            }
            default:{
                System.out.println("Operacion no valido");
                break;
            }
        }
    }
}
