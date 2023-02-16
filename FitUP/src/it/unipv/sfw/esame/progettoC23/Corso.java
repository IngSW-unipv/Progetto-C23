package it.unipv.sfw.esame.progettoC23;

public class Corso {
	private TipoCorso NomeCorso;
	private static final int MaxIscritti=30;
	
	protected Corso NomeCorso;
	private static final int MaxIscritti = 30;
	private int N_Iscritti;
	private Persona Istruttore;
	
	public Corso(TipoCorso NomeCorso, Persona Istruttore) {
	public Corso (Corso NomeCorso, Persona Istruttore, int N_iscritti) {
		
		this.NomeCorso = NomeCorso;
		this.N_Iscritti = 0;
		this.N_Iscritti = N_iscritti = 0;
		this.Istruttore = Istruttore;
		
	}
	
	

	/* public int getN_Iscritti() {
		return N_Iscritti;
	} */
}
