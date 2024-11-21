package dipendenti;

public class MainDipendente {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente("Ac234", 1355.55, TipoDipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("Ac300", 1355.55, TipoDipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente("Ac354", 1355.55, TipoDipartimento.PRODUZIONE);


        Dipendente[] dipendente = new Dipendente[3];

        dipendente[0] = dipendente1;
        dipendente[1] = dipendente2;
        dipendente[2] = dipendente3;

        for (int i = 0; i < dipendente.length; i++) {
            Dipendente current = dipendente[i];
            System.out.println("Matricola:" + current.getMatricola());
        }
    }

}
