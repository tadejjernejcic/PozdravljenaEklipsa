//uvozimo paket Swing
import javax.swing.*;
//uvozimo knjiznico za delo z dogodki
import java.awt.event.*;
//uvozimo paket za delo s tabelami
import javax.swing.table.*;

//deklariramo javni razred, ki implementira vmesnik ActionListener
public class Miza implements ActionListener {
    //definiramo atribute in lastnosti
    private JFrame okno;
    private JPanel povrsina;
    private JLabel besedilo;
    private JButton gumb;
    private JTextField polje;
    private JTable tabela;
    private DefaultTableModel modelTabele;

    //staticna metoda, zazene se ob zacetku
    public static void main(String[] args) {
        //ce je stevilo argumentov vsaj 1
        if(args.length > 0) {
            //izpis argumenta
            System.out.println("1. argument je: " + args[0]);
            //objekt (lokalna spremenljivka) tipa Miza
            Miza m = new Miza(args[0]);
        }
        //ce ni argumentov
        else {
            System.out.println("Program je bil zagnan brez argumentov.");
        }
    }

    //Konstruktor
    public Miza(String naslov) {
        //inicializiramo okno
        okno = new JFrame(naslov);
        //ustvarimo povrsino
        povrsina = new JPanel();
        //ustvarimo okence z besedilom
        besedilo = new JLabel("Hello Swing World");
        //ustvarimo gumb
        gumb = new JButton("Klikni");
        //gumbu dolocimo poslusalca dogodkov
        gumb.addActionListener(this);
        //ustvarimo vnosno polje
        polje = new JTextField(32);
        //ustvarimo model tabele
        modelTabele = new DefaultTableModel();
        //modelu tabele dodamo stolpec
        modelTabele.addColumn("Znamka piva");
        //ustvarimo tabelo na podlagi modela
        tabela = new JTable(modelTabele);

        //dodamo okence na povrsino
        povrsina.add(besedilo);
        //dodamo vnosno polje na povrsino
        povrsina.add(polje);
        //dodamo gumb na povrsino
        povrsina.add(gumb);
        //dodamo tabelo na povrsino
        povrsina.add(tabela);

        //dodamo povrsino v okno
        okno.add(povrsina);
        //metoda, ki okno prikaze
        okno.setVisible(true);
        //nastavimo velikost okna
        okno.setSize(800,600);
        //Nasstavimo delovanje, da se ob zapiranju okna ustavi izvajanje aplikacije
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //implementiramo metodo, ki jo predpisuje vmesnik
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Dogodek: " + e.toString());
        System.out.println("Vsebina vnosnega polja: " + polje.getText());

        //Pripravimo seznam objektov (lokalna) za vnos vrstice
        Object[] vrstica = new Object[]{polje.getText()};

        //dodamo vrstico v model tabele
        modelTabele.addRow(vrstica);

        //Pocistimo vnosno polje
        polje.setText("");
    }
}