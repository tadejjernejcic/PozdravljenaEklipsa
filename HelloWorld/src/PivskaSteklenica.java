//Deklariramo razred, ki razsiri razred Steklenica in implementira vmesnik AlkoholnaPijaca
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
    //Vse lastnosti v nadrazredu se prenesejo
    //Deklariramo samo nove
    private boolean jePovratna;
    private String znamka;
    private int odstotekAlkohola;
    //deklariramo konstruktor - enak kot pri nadrazredu
    //Vhodi: stopnja alkohola, znamka piva
    /**
     * @param a stopnja alkohola
     * @param z znamka piva
     */
    public PivskaSteklenica(int a, String z) {
        //pred super ne sme biti nic drugega
        //poklicemo konstruktor nadrazreda
        super(500,"Pivo");

        //Dolocimo ostale lastnosti
        jePovratna = true;
        setZnamka(z);
        odstotekAlkohola = a;
    }
    //deklariramo nov konstruktor
    //vhodi: stopnja alkohola, znamka piva, kapaciteta, ali je povratna
    public PivskaSteklenica(int a, String z, int k, boolean p) {
        //pred super ne sme biti nic drugega
        //poklicemo konstruktor nadrazreda
        super(k,"Pivo");

            //Dolocimo ostale lastnosti
            jePovratna = p;
            setZnamka(z);
            odstotekAlkohola = a;
    }

    //implementiramo metodo iz vmesnika
    public int getStopnjaAlkohola() {
        return odstotekAlkohola;
    }
	/**
	 * @return znamka piva v steklenici
	 */
	public String getZnamka() {
		return znamka;
	}
	/**
	 * @param znamka znamka piva ki naj bo v steklenici
	 */
	public void setZnamka(String znamka) {
		this.znamka = znamka;
	}
}