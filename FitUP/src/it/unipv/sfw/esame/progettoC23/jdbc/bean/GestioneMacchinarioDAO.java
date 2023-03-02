package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import it.unipv.sfw.esame.progettoC23.jdbc.util.Connessione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestioneMacchinarioDAO<Connection> implements IGestioneMacchinarioDAO {
	private java.sql.Connection connDB;
	private String schema;
	ArrayList<GestioneMacchinario> gm;

	public GestioneMacchinarioDAO() {
		super();
		this.schema = "palestra";

	}


	@Override
	public boolean insertMacchinario(GestioneMacchinario gm) {

		connDB = Connessione.startConnection(connDB, schema);
		PreparedStatement st1;

		boolean esito = true;

		try {
			String query = "INSERT INTO MACCHINARIO(NOME,DATAACQUISTO) VALUES(?,?)";

			st1 = connDB.prepareStatement(query);
			st1.setString(1, gm.getNomeMacchinario());
			st1.setString(2, gm.getDataAcquisto());

			st1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			esito = false;
		}

		Connessione.closeConnection(connDB);
		return esito;
	}

}
