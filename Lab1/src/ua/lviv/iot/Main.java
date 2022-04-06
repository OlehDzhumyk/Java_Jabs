package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        Circus cir1 = new Circus();
        Circus cir2 = new Circus("d'Hiver Bouglione", "France", 200);
        Circus cir3 = new Circus("Shanghai Circus World", "Shanghai", 200,false,1000,50);
        System.out.println("\n" + cir1);
        System.out.println("\n" + cir2);
        System.out.println("\n" + cir3);
        System.out.println(Circus.checkIfWolfInTheCircus());
    }
}
