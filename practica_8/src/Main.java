public class Main {
    public static void main(String[] args) {

        //crear el primer objeto
        Spartan masterChief = new Spartan("Jhon",100,70,"Rifle de asalto");

        //invocamos metodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(80);
        masterChief.correr(true);

        

        //USAMOS GET Y SETPARA CAMBIAR EL NOMBRE
        masterChief.setNombre("Daniel");
        masterChief.mostrarInfo();
        System.out.println(masterChief.getNombre());

        //creamos el segundo objeto
        Spartan spartan = new Spartan("Pali",500,200,"Pistola NERF");

        spartan.mostrarInfo();
        spartan.atacar("Nomo de jardin");
        spartan.recargarArma(53);
        spartan.correr(true);
    }
}