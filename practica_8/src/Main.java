public class Main {
    public static void main(String[] args) {

        //crear el primer objeto
        Spartan masterChief = new Spartan();

        //usar atributos
        masterChief.nombre = "Jhon";
        masterChief.salud = 100;
        masterChief.escudo = 50;
        masterChief.armaPrincipal = "Rifle de asalto";

        //invocamos metodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(80);
        masterChief.correr(true);

        //creamos el segundo objeto
        Spartan spartan = new Spartan();

        spartan.nombre = "Pali";
        spartan.salud = 500;
        spartan.escudo = 200;
        spartan.armaPrincipal = "Pistola NERF";

        spartan.mostrarInfo();
        spartan.atacar("Nomo de jardin");
        spartan.recargarArma(53);
        spartan.correr(true);
    }
}