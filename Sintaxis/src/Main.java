// Zona de importacion
import java.util.Scanner;

//clase principal
public class Main {
    //Metodo Principal
    public static void main(String[] args) {

       /* System.out.println("Hola, Ali Daniel Flores");
        System.out.println("Hola, Ali Daniel Flores");
        System.out.println("Hola, Ali Daniel Flores");*/

        //2. Cadenas
       /* String cadena= "Ali" + "Daniel" + "Flores" + "Garcia";
        System.out.println(cadena);

        //conteo de logitud de cadena
        System.out.println(cadena.length());

        //Extraccion de caracteres en base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));*/

      /*  //3. Variables
        String cadena= "333", cadena2, cadena3;
        int entero= 3, entero2, entero3;
        double decimal= 3.325896, decimal2, decimal3;

        //Convertir cadena a int
        entero2= Integer.parseInt(cadena);
        System.out.println(entero2);

        //convertir double a int
        entero3= (int) decimal;
        System.out.println(entero3);

        //Convertir double a cadena
        cadena2= String.valueOf(decimal);
        System.out.println(cadena2);

        //Convertir int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2);

        //conversion implicita
        int i= 12;
        double numd= i;
        System.out.println(numd);*/

        //4. Solicitud de datos
        Scanner scn= new Scanner(System.in);

        System.out.println("Escribe una cadena: ");
        String cadena= scn.nextLine();

        System.out.println("Escribe un numero entero: ");
        int entero= scn.nextInt();

        System.out.println("Escribe un numero decimal: ");
        double decimal= scn.nextDouble();

        System.out.println("Numero entero guardado: "+ entero);
        System.out.println("Numero decimal guardado: "+ decimal);
        System.out.println("Cadena guardada: "+ cadena);

        //5. Boolean, operadores logico y de comparacion

            //Los operadores logicos siempre devuelven un resultado booleano
      /*      System.out.println(10 > 9);
            System.out.println(10 == 9);
            System.out.println(10 < 9);
            System.out.println(10 >= 9);
            System.out.println(10 <= 9);
            System.out.println(10 != 9);

        int x= 3;
        System.out.println(x< 5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x< 5 && x>10));
        System.out.println(!(x<5 || x>10));*/
    }
}