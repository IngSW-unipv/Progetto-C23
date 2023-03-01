package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.util.ArrayList;

public interface IIscrizioneDAO {

    ArrayList<Iscrizione> selectAll();

    boolean insertIscritto(Iscrizione i);

}
