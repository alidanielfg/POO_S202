public class SpartanIV extends Spartan{

    public SpartanIV(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma, escudo = 100);
    }

    public void usarpropulsores(){
        System.out.println(nombre+ " Usa propulsores para moverse rapidamente.");
    }
}
