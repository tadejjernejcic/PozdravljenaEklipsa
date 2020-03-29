//Vkljucimo paket za delo z I/O napravami
import java.io.*;
//Vkljucimo paket za delo s pripomocki
import java.util.*;

// deklariramo javni razred
public class HelloWorld {

    //deklariramo staticno lastnost za vnos iz konzole
    private static BufferedReader in;

    //deklariramo staticen seznam steklenic
    private static ArrayList<Steklenica> steklenice;

    // Definiramo glavno metodo
    public static void main(String[] args) {
        //Izpise pozdrav na zaslon
        System.out.print("Pozdravljen, svet!\n");

        //inicializacija lastnosti
        in = new BufferedReader(new InputStreamReader(System.in));
        steklenice = new ArrayList<Steklenica>();

        //inicializiramo lokalno spremenljivko
        String vsebina = "Neznana vrsta vode";

        //dodajamo na seznam 3krat
        for(int c=0; c<3; c++) {
            //Poskusimo vprasati, kaksne znamke je voda
            try {
                System.out.println("Vnesite znamko vode: ");
                vsebina = in.readLine();
            }
            //ce bi bila sporocena izjema
            catch(Exception e) {
                System.err.println("Napaka: " + e);
            }
            steklenice.add(new Steklenica(500, vsebina));
        }
        //deklariramo in inicializiramo nov objekt tipa Steklenica
        Steklenica mojaVoda = new Steklenica(500, new String(vsebina));
        
        //objekt pivske steklenice
        PivskaSteklenica pivoPoPredavanju = new PivskaSteklenica(7, "Kramah");

        //se ena pivska steklenica
        PivskaSteklenica p2 = new PivskaSteklenica(5,"Heineken",330,false);

        //Izpisemo kolicino vsebine steklenice
        System.out.print("V steklenici z vodo je �e ");
        System.out.println(mojaVoda.getKolicinaVsebine() + " ml vode znamke " + mojaVoda.getVrsta());
        System.out.print("V steklenici s pivom je �e ");
        System.out.println(pivoPoPredavanju.getKolicinaVsebine());


        //poskusimo piti iz zaprte steklenice
        try {
            mojaVoda.izprazni(100);
            System.out.print("Po poskusu praznjenja zaprte steklenice je v steklenici z vodo �e ");
            System.out.println(mojaVoda.getKolicinaVsebine() + " ml vode znamke " + mojaVoda.getVrsta());
        }
        catch(Exception e) {
            System.err.println("Napaka: " + e);
        }
        
        
        //odpremo steklenico vode
        mojaVoda.odpri();
        try {
            //Izpijemo pozirek
            mojaVoda.izprazni(200);
            //Izpisemo kolicino vsebine steklenice
            System.out.print("Po pozirku (200) je v steklenici z vodo �e ");
            System.out.println(mojaVoda.getKolicinaVsebine() + " ml vode znamke " + mojaVoda.getVrsta());
        }
        catch(Exception e) {
            System.err.println("Napaka: " + e);
        }

        try {
            //ponovno izpraznimo - tokrat vec, kot je notri
            mojaVoda.izprazni(400);
            System.out.print("Po drugem pozirku (400) je v steklenici z vodo �e ");
            System.out.println(mojaVoda.getKolicinaVsebine() + " ml vode znamke " + mojaVoda.getVrsta());
        }
        catch(Exception e) {
            System.err.println("Napaka: " + e);
        }

        //odpremo steklenico piva
        pivoPoPredavanju.odpri();
        try {
            //Izpijemo pozirek
            pivoPoPredavanju.izprazni(100);
            //Izpisemo kolicino vsebine steklenice
            System.out.print("Po po�irku je v steklenici s pivom �e ");
            System.out.println(pivoPoPredavanju.getKolicinaVsebine());
        }
        catch(Exception e) {
            System.err.println("Napaka: " + e);
        }


        //izpisemo vsebino seznama steklenic
        for(int c=0; c<3; c++) {
            System.out.println("Vsebina " + c + ". steklenice je " + steklenice.get(c).getVrsta());
        }
    }
}