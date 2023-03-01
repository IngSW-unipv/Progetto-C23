package it.unipv.sfw.esame.progettoC23.model;

public class Badge {
	
	
	protected String CodiceBadge; 
	private final String CodicePalestra = "FitUp";
	protected String CF;
	
	public Badge() {	
	}
	
	public void setCodiceBadge(String CF) {
			this.CF = CF;
			CodiceBadge = CF + CodicePalestra ;
	}


	public String getCodiceBadge() {
		return CodiceBadge;
	}
	
	public String getCF() {
		return CF;
	}

	
	
	
	

}
