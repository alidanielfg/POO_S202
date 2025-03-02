import javax.swing.*;

public class envios {
    private int codigoenvio;
    private float peso;
    private String destino;

    public envios(int codigoenvio, float peso, String destino) {
        this.codigoenvio = codigoenvio;
        this.peso = peso;
        this.destino = destino;

        setCodigoenvio(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del envio: ","Envios",JOptionPane.INFORMATION_MESSAGE)));
        setPeso(Float.parseFloat(JOptionPane.showInputDialog(null,"Ingres el peso del paquete","Peso",JOptionPane.INFORMATION_MESSAGE)));
        setDestino(JOptionPane.showInputDialog(null,"Ingrese el destino: ","Destino",JOptionPane.INFORMATION_MESSAGE));
    }

    public envios(int codigoenvio, String destino) {
        this.codigoenvio = codigoenvio;
        this.destino = destino;

        setCodigoenvio(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del envio: ","Envios",JOptionPane.INFORMATION_MESSAGE)));
        setDestino(JOptionPane.showInputDialog(null,"Ingrese el destino: ","Destino",JOptionPane.INFORMATION_MESSAGE));
    }

    public void Mostrarinfo(){
        JOptionPane.showMessageDialog(null,"-----Información del envio------" + "\nCodigo de envío: "+ getCodigoenvio()+
                "\nDestino: "+ getDestino()+ "\nPeso del paquete: "+ getPeso());
    }

    public void Mostrarinfo2(){
        JOptionPane.showMessageDialog(null,"-----Información del envio------" + "\nCodigo de envío: "+ getCodigoenvio()+
                "\nDestino: "+ getDestino()
        );
    }

    public int getCodigoenvio() {
        return codigoenvio;
    }

    public void setCodigoenvio(int codigoenvio) {
        this.codigoenvio = codigoenvio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
