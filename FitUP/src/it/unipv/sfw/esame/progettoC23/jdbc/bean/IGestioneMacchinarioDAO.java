package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import it.unipv.sfw.esame.progettoC23.IDMacchinario;

import java.util.ArrayList;

public interface IGestioneMacchinarioDAO {
    ArrayList<GestioneMacchinario> selectAll();

    boolean insertMacchinario(GestioneMacchinario gm, IDMacchinario id);
}
