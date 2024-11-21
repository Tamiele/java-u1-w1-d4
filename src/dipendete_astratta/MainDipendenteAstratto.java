package dipendete_astratta;

import java.util.ArrayList;

public class MainDipendenteAstratto {

    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendenteFullTime("Ca238", 1556.32);
        Dipendente dipendente2 = new DipendentePartTime("Cb234", 1000);
        Dipendente dipendente3 = new Dirigente("A324", 2056.37);

        ArrayList<Dipendente> arrayDipendenti = new ArrayList<>();

        arrayDipendenti.add(dipendente1);
        arrayDipendenti.add(dipendente2);
        arrayDipendenti.add(dipendente3);

        double totaleStipendi = 0;
        for (int i = 0; i < arrayDipendenti.size(); i++) {

            Dipendente dipendenteCorrente = arrayDipendenti.get(i);

            System.out.println("Totale stipendi Dipendenti:" + (totaleStipendi += dipendenteCorrente.calcolaStipendio()));


        }
    }
}
