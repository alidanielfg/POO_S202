import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"consulta","depósito","retiro","depósito externo","salir"};

        bancos cliente1 = new bancos();

        cliente1.bienvenida();
        cliente1.cliente();

        while(true) {
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una operación",
                    "Menu de operaciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada. Cerrando el programa.");
                System.exit(0); // Cierra el programa
            }

            switch (seleccion) {
                case "consulta":
                    cliente1.consulta();
                    break;
                case "depósito":
                    cliente1.deposito();
                    break;
                case "retiro":
                    cliente1.retiro();
                    break;
                case "depósito externo":
                    cliente1.deposito_ex();
                    break;
                case "salir":
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }//cierre switch
        }//CIERRE DEL WHILE
    }
}