import javax.swing.*;

public class vehiculo {
    private String placa,modelo;
    private float capacidad;
    private conductores conductor;

    public vehiculo(String placa, String modelo, float capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;

        setPlaca(JOptionPane.showInputDialog(null,"Ingrese la placa:","Placas",JOptionPane.INFORMATION_MESSAGE));
        setModelo(JOptionPane.showInputDialog(null,"Ingrese el modelo","Modelos",JOptionPane.INFORMATION_MESSAGE));
        setCapacidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la capacidad en kg","Capacidad",JOptionPane.INFORMATION_MESSAGE)));
    }

    public void AsignarConductor(conductores conductor){
        if (this.conductor==null){
            this.conductor = conductor;
            JOptionPane.showMessageDialog(null,"Conductor asignado correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"Conductor ya asignado.");
        }
    }

    public void mostrarinfo(){
        String infoVehiculo = "La infomación del vehículo es:" +
                "\nPlaca: "+ getPlaca()+
                "\nModelo: "+getModelo()+
                "\nCapacidad: "+ getCapacidad();

        if (conductor != null) {
            infoVehiculo += "\n\nInformación del Conductor:" +
                    "\nNombre: "+ conductor.getNombre() +
                    "\nIdentificación: " + conductor.getIdentificacion() +
                    "\nLicencia: " + conductor.getNolicencia();
        } else {
            infoVehiculo += "\n\nEl vehículo no tiene conductor asignado.";
        }

        JOptionPane.showMessageDialog(null, infoVehiculo);
    }



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public conductores getConductor() {
        return conductor;
    }
}
