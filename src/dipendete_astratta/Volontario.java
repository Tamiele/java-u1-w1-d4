package dipendete_astratta;

public class Volontario implements IDipendente {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }


    @Override
    public String dettagliDipendente() {
        return "";
    }

    @Override
    public void checkIn() {
        System.out.println("inizio turno ");
    }
}
