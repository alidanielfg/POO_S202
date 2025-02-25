public class Spartan {

    private int escudo,salud;
    private String armaPrincipal;
    private String nombre;

    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.armaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
        System.out.println("----- Informacion del Spartan -----");
        System.out.println("Nombre:" + nombre);
        System.out.println("% de Salud:" + salud);
        System.out.println("% de Escudo:" + escudo);
        System.out.println("Arma Disponible:" + armaPrincipal);
        System.out.println("-----------------------------------");
    }//Llave mostrarInfo

    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible "+ total + " balas");
    }

    public void correr(boolean status){
        if (status){
            System.out.println(nombre+" esta corriendo");
        }else{
            System.out.println(nombre+ " se detuvo");
        }
    }

    private void consultaCortana(){
        System.out.println("Conversación Privada......");
    }

    //ZONA DE GETS Y SETS
    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }
}//Lave de clase