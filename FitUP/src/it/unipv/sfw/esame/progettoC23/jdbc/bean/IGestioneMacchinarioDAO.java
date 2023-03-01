package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.util.ArrayList;

import it.unipv.sfw.esame.progettoC23.model.Badge;
import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;

public interface IGestioneMacchinarioDAO {
	public ArrayList<GestioneMacchinario> selectAll();
	public boolean insertMacchinario(GestioneMacchinario gm);
}
