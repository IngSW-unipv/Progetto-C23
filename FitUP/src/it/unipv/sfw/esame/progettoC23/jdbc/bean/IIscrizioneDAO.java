package it.unipv.sfw.esame.progettoC23.jdbc.bean;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.model.Badge;

public interface IIscrizioneDAO {
	
	public ArrayList<Iscrizione> selectAll();
	public boolean insertIscritto(Iscrizione i);

}
