import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Bienvenido a tu bitacora de operaciones");
        System.out.println("\nD= deposito \nR= retiro");
        System.out.println("Ejemplo para ingresar la operacion: D [no olvide el espacio] 100" +
                "\n Para finalizar de enter en una linea vacia");
        int saldo=0;
        int d=0;
        int r = 0;

        while (true) {
            //Se lee todos los caracteres
            String linea = scn.nextLine().trim();
            //termina el ciclo
            if (linea.isEmpty()) {
                break;
            }
            //Se separa la línea en dos partes: la operación y el monto
            String[] partes = linea.split("\\s+");
            if (partes.length != 2) {
                System.out.println("Formato incorrecto. Debe ingresar: [operación] [monto]");
                continue;
            }
            String operacion = partes[0].toUpperCase();
            int monto = 0;
            try {
                monto = Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                System.out.println("El monto ingresado no es un número válido.");
                continue;
            }
            //Se realiza la suma del deposito
            if (operacion.equals("D")) {
                d = monto;
                saldo += d;
            } else if (operacion.equals("R")) {//Se realiza la resta del retiro
                if (monto > saldo) {
                    System.out.println("La operación no se puede realizar: saldo insuficiente.");
                    System.exit(0);
                }
                r = monto;
                saldo -= r;
            } else {
                System.out.println("Operación no válida: " + operacion);
            }
        }
        System.out.println("Saldo Final: " + saldo);
    }
}
