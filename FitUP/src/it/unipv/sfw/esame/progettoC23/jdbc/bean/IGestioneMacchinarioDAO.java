package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.util.ArrayList;

public interface IGestioneMacchinarioDAO {

	
	public boolean insertMacchinario(GestioneMacchinario gm);
	public ArrayList<GestioneMacchinario> selectMacchinario(GestioneMacchinario gm);

}
