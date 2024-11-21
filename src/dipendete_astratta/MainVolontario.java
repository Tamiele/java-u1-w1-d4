package dipendete_astratta;

import java.util.ArrayList;

public class MainVolontario {
    public static void main(String[] args) {
        Volontario volontario1=new Volontario("Gianni",25,"stagista");
        Dipendente dipendente1=new DipendenteFullTime("Ac234",1436);

        ArrayList<IDipendente> arrayDipendentiEVolontari=new ArrayList<>();

        arrayDipendentiEVolontari.add(volontario1);
        arrayDipendentiEVolontari.add(dipendente1);
        for (int i = 0; i < arrayDipendentiEVolontari.size(); i++) {

            IDipendente curretDipendentiEVolontari=arrayDipendentiEVolontari.get(i);

            System.out.println(curretDipendentiEVolontari.checkIn(););

        }

    }
}
