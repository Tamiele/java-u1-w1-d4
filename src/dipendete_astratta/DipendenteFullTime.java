package dipendete_astratta;

import dipendenti.TipoDipartimento;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio) {
        super(matricola, stipendio, TipoDipartimento.PRODUZIONE);
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio();
    }
}
