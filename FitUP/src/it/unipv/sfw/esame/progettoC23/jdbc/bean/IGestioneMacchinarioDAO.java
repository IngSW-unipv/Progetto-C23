package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.util.ArrayList;

import it.unipv.sfw.esame.progettoC23.Badge;
import it.unipv.sfw.esame.progettoC23.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.Macchinario;

public interface IGestioneMacchinarioDAO {
	public ArrayList<GestioneMacchinario> selectAll();
	public boolean insertMacchinario(GestioneMacchinario gm, IDMacchinario id);
}