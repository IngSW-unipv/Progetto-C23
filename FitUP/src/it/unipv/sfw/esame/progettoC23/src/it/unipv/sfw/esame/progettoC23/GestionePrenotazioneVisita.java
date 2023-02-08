package it.unipv.sfw.esame.progettoC23;

import java.util.Date;

public class GestionePrenotazioneVisita extends GestioneIscrizione {
	private TipoVisita VisitaScelta;

	public GestionePrenotazioneVisita(GestioneIscrizione CodiceBadge, TipoVisita VisitaScelta) {
		super();
		this.CodiceBadge=CodiceBadge;
		this.VisitaScelta=VisitaScelta;
	}
	

}
