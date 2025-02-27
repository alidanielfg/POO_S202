import javax.swing.*;

public class bancos {
    private int edad, nodecuenta;
    private String titular;
    private float saldo;

    public bancos(int edad, int nodecuenta, String titular, float saldo) {
        this.bienvenida();
        this.cliente();
    }

    private void bienvenida() {
        boolean datosValidos = false;

        while (!datosValidos) {
            titular = JOptionPane.showInputDialog("Ingrese su nombre:");
            if (titular == null) {
                System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
            }

            try {
                String edadStr = JOptionPane.showInputDialog("Ingrese su edad:");
                if (edadStr == null) {
                    System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
                }
                edad = Integer.parseInt(edadStr);

                if (edad < 18) {//VALIDACION DE EDAD
                    JOptionPane.showMessageDialog(null, "No tienes la edad suficiente", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);//  CIERRA EL PROGRAMA SI ERES MENOR DE EDAD
                }
                String cuentaStr = JOptionPane.showInputDialog("Ingrese su número de cuenta:");
                if (cuentaStr == null) {
                    System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
                }
                nodecuenta = Integer.parseInt(cuentaStr); //regrea a entero para realizar las operaciones
                int confirmacion = JOptionPane.showConfirmDialog(null, "Bienvenid@ " + titular +
                        "\nSu número de cuenta es " + nodecuenta + "?", "¿Eres tú?", JOptionPane.YES_NO_OPTION);
                //VERIFICACION DE DATOS
                if (confirmacion == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Verifique los datos ingresados.");
                } else {
                    datosValidos = true; // Datos válidos, salir del bucle
                }
            }
            catch (NumberFormatException e) {//MOSTRARA ERROR HASTA QUE SOLO SE INGRESEN VALORES NUMERICOS
                JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cliente(){
        try {
            String inputSaldo = JOptionPane.showInputDialog(null, "Ingrese su cantidad inicial: ");
            if (inputSaldo == null) {
                System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
            }
            saldo = Float.parseFloat(inputSaldo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//CIERRE DE CLIENTE

    public void consulta(){
        JOptionPane.showMessageDialog(null, "Su saldo es de: " + saldo);
    }//CIERRE DE CONSULTA

    public void deposito(){
        try {
            String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
            if (inputCantidad == null) {
                System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
            }
            float cantidad = Float.parseFloat(inputCantidad);
            if (cantidad > 0) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "Seguro que quiere continuar?");
                if (confirmacion == JOptionPane.YES_OPTION) {
                    saldo += cantidad;
                    JOptionPane.showMessageDialog(null, "Su depósito se realizó exitosamente \nSu saldo actual es: " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//CIERRE DE DEPOSITO

    public void retiro(){
        try {
            String inputRetiro = JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar:");
            if (inputRetiro == null) {
                System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
            }
            float retiro = Float.parseFloat(inputRetiro);
            if (retiro > 0 && saldo >= retiro) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "Seguro que quiere continuar?");
                if (confirmacion == JOptionPane.YES_OPTION) {
                    saldo -= retiro;
                    JOptionPane.showMessageDialog(null, "Su retiro fue exitoso, saldo actual: " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad inválida.", "Error en retiro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//CIERRE RETIRO

    public void depositoex(){
        try {
            String cuentaStr = JOptionPane.showInputDialog("Ingrese el número de cuenta a la que va a transferir:");
            if (cuentaStr == null) {
                System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
            }
            int nocuenta = Integer.parseInt(cuentaStr);

            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad que va a depositar:");
            if (cantidadStr == null) {
                System.exit(0); // Cierra el programa si el usuario presiona "Cancelar"
            }
            float cantidad = Float.parseFloat(cantidadStr);

            if (cantidad > 0 && saldo >= cantidad) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "Seguro que quiere continuar?");
                if (confirmacion == JOptionPane.YES_OPTION) {
                    saldo -= cantidad;
                    JOptionPane.showMessageDialog(null, "Su transferencia se realizó exitosamente a la cuenta: " +
                            nocuenta + "\nSu saldo actual es: " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad inválida.",
                        "Error en depósito", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//CIERRE DEPOSITO_EXT
}//CIERRE DE LA CLASE
