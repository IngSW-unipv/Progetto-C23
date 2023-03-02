package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.util.ArrayList;

public interface IIscrizioneDAO {

    ArrayList<Iscrizione> selectAll();
    Iscrizione getFromCF(String CF);
    boolean insertIscritto(Iscrizione i);

}
