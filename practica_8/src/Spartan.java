public class Spartan {

    public String nombre;
    int escudo,salud;
    String armaPrincipal;


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

}//Lave de clase