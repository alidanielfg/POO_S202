public class Main {
    public static void main(String[] args) {

        SpartanII jefemaestro = new SpartanII("Jonh",98,"rifle de asalto",0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Convenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII spartan3 = new SpartanIII("Gingrd", 100,"escopeta",50);
        spartan3.mostrarInfo();
        spartan3.camuflajeActivo();
        spartan3.atacar("Convenant");
        spartan3.recibirDano(60);
        spartan3.recargarEscudo();

        SpartanIV halo4 = new SpartanIV("Palali",60,"lanzacohetes",20);
        halo4.mostrarInfo();
        halo4.usarpropulsores();
        halo4.atacar("Convenant");
        halo4.recibirDano(100);
        halo4.recargarEscudo();
    }
}