package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;

import java.util.ArrayList;

import it.unipv.sfw.esame.progettoC23.model.Badge;
import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;

public interface IGestioneMacchinarioDAO {
    ArrayList<GestioneMacchinario> selectAll();

    boolean insertMacchinario(GestioneMacchinario gm, IDMacchinario id);
}
