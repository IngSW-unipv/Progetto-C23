package it.unipv.sfw.esame.progettoC23;
import java.util.Date;
import java.text.DateFormat; // mettere formato data short!!

public  class GestioneIscrizione {
	protected GestioneIscrizione CodiceBadge;
	private String Rinnovo;
	protected Persona Iscritto;
	protected Date PrimaIscrizione,DataRinnovo;
	protected TipoAbbonamento Abbonamento; 
	
// DATARINNOVO è dinamica, va calcolata aggiungendo il tipo di abbonamento alla  prima iscrizione 
// ad esempio mi iscrivo il 01/01/2023 e scelgo semestrale, DataRinnovo sarà 01/06/2023 
//attenzione se non è il primo rinnovo sommo il valore del tipoabbonamento alla datarinnovo che poi si aggiorna
	public GestioneIscrizione( Persona iscritto, Date primaIscrizione, TipoAbbonamento abbonamento) {
		this.Iscritto = iscritto;
		this.PrimaIscrizione = primaIscrizione;
		this.Abbonamento = abbonamento;
	}

	public GestioneIscrizione() {
		// TODO Auto-generated constructor stub
	}

	/* public String getCodiceBadge() {
		return CodiceBadge;
	}

	public void setCodiceBadge(String codiceBadge) {
		CodiceBadge = codiceBadge;
	}
	*/

}
