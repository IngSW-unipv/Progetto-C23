package it.unipv.sfw.esame.progettoC23;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;


public class ManutenzioneMacchinario {
    public String DataAcquisto;
    private String DataManutenzione;
	private String IDMacchinario;
	public StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario, String DataAcquisto) {
		this.IDMacchinario = IDMacchinario;
		this.DataAcquisto = DataAcquisto;
	}	
	
	 public String getIDMacchinario() {
		return IDMacchinario;
	}
	
	
	 public String getDataAcquisto() {
		return DataAcquisto; 
	}

	public String setDataAcquisto(GestioneMacchinario GM) {
		return DataAcquisto;
	}
	

	public String getDataManutenzione() {
		return DataManutenzione;
	    }

	public StatoAttuale getStato() {
		return Stato;
	}

	public String setDataManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		
		switch(Stato) {
		case FUNZIONANTE:
			String arr[];
			int mese, anno;
			if (DataManutenzione == null) {
				arr = DataAcquisto.split("/");
				 mese = Integer.parseInt(arr[1]);
				 anno = Integer.parseInt(arr[2]);
				
				mese+=06;
				
				if (mese > 12) {
					mese-=12;
					anno++;
				}
			} else {
					 arr = DataManutenzione.split("/");
					 mese = Integer.parseInt(arr[1]);
					 anno = Integer.parseInt(arr[2]);
					
					mese+=06;
					
					if (mese > 12) {
						mese-=12;
						anno++; 
						}
			} 
			DataManutenzione = arr[0] +"/" + mese + "/" + anno;
			break;
			
		case GUASTO:
			System.out.println( "Macchinario guasto, chiamare l'assistenza");
			DataManutenzione = "Da definire";
		    }
		return DataManutenzione;
	}
}
