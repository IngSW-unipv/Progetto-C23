package it.unipv.sfw.esame.progettoC23;

public class Badge {
	
	protected String CodiceBadge; 
	private final String CodicePalestra = "FitUp";
	
	public Badge() {	
	}
	
	public void setCodiceBadge(Persona iscritto) {
		 CodiceBadge = iscritto.getCF() + CodicePalestra ;
	}


	public String getCodiceBadge() {
		return CodiceBadge;
	}
	

}
