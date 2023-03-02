package it.unipv.sfw.esame.progettoC23.model.iscrizione;

public class Badge {

    protected String codiceBadge;
    private final String codicePalestra = "FitUp";
    protected String CF;

    public Badge() {
    }

    public void setCodiceBadge(String CF) {
        this.CF = CF;
        codiceBadge = CF + codicePalestra;
    }


    public String getCodiceBadge() {
        return codiceBadge;
    }

    public String getCF() {
        return CF;
    }


}
