import java.util.Scanner;

public class serie_de_collatz {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num= scn.nextInt();

       while (true){
           if (num==1){
               break;
           }
           if (num%2==0){
               num= num/2;
               System.out.println(num);
           }else{
               num= (num*3)+1;
               System.out.println(num);
           }
       }
    }
}