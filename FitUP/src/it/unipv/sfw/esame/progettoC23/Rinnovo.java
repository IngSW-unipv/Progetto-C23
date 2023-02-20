package it.unipv.sfw.esame.progettoC23;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;


public class Rinnovo {
	
	private Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	private Calendar DataRinnovo;
	private TipoAbbonamento Abbonamento; 
	
	public Rinnovo (String CodiceBadge) {
	}
	
	public void setDataRinnovo(TipoAbbonamento Abbonamento) {
		
		this.Abbonamento = Abbonamento;
		//this.PrimaIscrizione = PrimaIscrizione;
			
			
		switch (Abbonamento) {
		case MENSILE:	
			PrimaIscrizione.add(Calendar.MONTH, +1);
			break;
		case SEMESTRALE:
			PrimaIscrizione.add(Calendar.MONTH, +6);
			break;
		case ANNUALE:
			PrimaIscrizione.add(Calendar.YEAR, +1);
			break;
				
		}
	}
		
		public Calendar getDataRinnovo() {
			return PrimaIscrizione;
		}

	
	

}
