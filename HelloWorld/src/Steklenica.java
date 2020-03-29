//deklariramo javni razred
public class Steklenica {
    // deklariramo lastnosti
    private String vrstaVsebine;
    private int kapaciteta;
    private int kolicinaVsebine;
    private boolean jeOdprta;

    //Deklariramo konstruktor s katerim ustvarimo nov objekt
    //vhod: kapaciteta in vrsta vsebine
    //izhod: nov objekt razreda Steklenica
    public Steklenica(int k, String v) {
        //inicializacija lastnosti
        vrstaVsebine = v;
        kapaciteta = k;
        kolicinaVsebine = k;
        jeOdprta = false;
    }//konec konstruktorja

    //Metoda, ki vrne kolicino vsebine (vrne int)
    //vhod: ga ni
    //izhod: kolicina vsebine
    public int getKolicinaVsebine() {
        //vrne vrednost kolicinaVsebine
        return kolicinaVsebine;
    }
    //Metoda, ki vrne vrsto vsebine
    //vhod: ga ni
    //izhod: vrsto vsebine
    public String getVrsta() {
        return vrstaVsebine;
    }

    //Metoda za praznenje steklenice
    //vhod: kolicina za izprazniti
    //izhod: koliko je se ostalo
    public int izprazni(int ki) throws Exception {
        //ce je steklenica odprta
        if(jeOdprta) {
            //odstejemo kolicino za izpraznit od trenutne
            kolicinaVsebine -= ki;
            //preverimo, ce je kolicina negativna
            if(kolicinaVsebine < 0) {
                //postavimo kolicino vsebine na 0
                kolicinaVsebine = 0;
                //vrzemo izjemo
                throw new Exception("V steklenici ni bilo dovolj vode.");
            }
        //ce steklenica ni odprta
        } else {
            //vrnemo trenutno kolicino vsebine
            throw new Exception("Steklenica je zaprta.");
        }
        return kolicinaVsebine;
    }//konec izprazni


    //Metoda, ki odpre steklenico 
    //vhod: ga ni
    //izhod: jeOdprta je pozitivna
    public boolean odpri() {
        return jeOdprta = true;
    }
}