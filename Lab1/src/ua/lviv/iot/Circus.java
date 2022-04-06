package ua.lviv.iot;

public record Circus(String theNameOfCircus, String address, int ticketPrice, boolean isThereAnimals, int numberOfSpectators, int numberOfPerformancePerYear) {

    private static final boolean wolfIsAClown = true;
    public static boolean checkIfWolfInTheCircus(){
        return wolfIsAClown;
    }

    Circus(){
        this("Du Soleil", "Canada", 300);
    }

    Circus(String theNameOfCircus,String address, int ticketPrice){
        this(theNameOfCircus, address, ticketPrice, true,700, 45 );
    }

    public String toString(){
        return  "Назва цирку - " + theNameOfCircus +
                "\nАдреса цирку - " + address +
                "\nЦіна квитка - " + ticketPrice +
                "\nЧи виступають там тварини - " + isThereAnimals +
                "\nКількість вистав за рік- " + numberOfPerformancePerYear;
    }

}
