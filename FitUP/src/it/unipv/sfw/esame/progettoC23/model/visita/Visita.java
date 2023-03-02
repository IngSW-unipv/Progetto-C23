package it.unipv.sfw.esame.progettoC23.model.visita;

import java.util.Calendar;

import it.unipv.sfw.esame.progettoC23.model.iscrizione.Badge;

public class Visita {
    private Badge paziente;
    private Calendar day_visit;
    private int inizio, fine, giornoSett;
    private TipoVisita visita_scelta;


    public Visita(Badge paziente, TipoVisita visita_scelta, Calendar day_visit) {
        this.paziente = paziente;
        this.day_visit = day_visit;
        this.visita_scelta = visita_scelta;
        this.inizio = day_visit.get(Calendar.HOUR_OF_DAY);
        this.giornoSett = day_visit.get(Calendar.DAY_OF_WEEK);
        this.fine = day_visit.get(Calendar.HOUR_OF_DAY) + 1; //the visits last one hour
    }


    public int getInizio() {
        return inizio;
    }

    public int getFine() {
        return fine;
    }


    public int getGiornoSett() {
        return giornoSett;
    }


    public Calendar getDay_visit() {
        return day_visit;
    }


    public Badge getPaziente() {
        return paziente;
    }


    @Override
    public String toString() {
        return "Visita: iscritto=" + paziente.getCodiceBadge() + ",data=" + day_visit.get(Calendar.DATE) + "-" + day_visit.get(Calendar.MONTH) + "-" + day_visit.get(Calendar.YEAR) + ",ora=" + inizio
                + ",tipo=" + visita_scelta;
    }


}
