import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class paga_horas_trabajo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de horas trabajadas: ");
        double horas= scn.nextDouble();

        System.out.println("Ingresa el costo por hora: ");
        double costo= scn.nextDouble();

        double paga= horas * costo;

        System.out.println("Tu pago es de "+ paga+ " pesos");
    }
}