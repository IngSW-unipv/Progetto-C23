package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.sql.Connection;
import java.util.ArrayList;

public class ControlloDAO {

    private Connection connDB;
    private String schema;
    ArrayList<Iscrizione> iscr;

    public ControlloDAO() {
        super();
        this.schema = "palestra";

    }


}
