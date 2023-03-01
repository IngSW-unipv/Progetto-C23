package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;

import java.util.ArrayList;

public interface IGestioneMacchinarioDAO {

	public ArrayList<GestioneMacchinario> selectAll();
	public boolean insertMacchinario(GestioneMacchinario gm);

}
