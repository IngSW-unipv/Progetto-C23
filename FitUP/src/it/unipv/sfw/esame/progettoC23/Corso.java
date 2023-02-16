package it.unipv.sfw.esame.progettoC23;

public class Corso {
	private TipoCorso NomeCorso;
	private static final int MaxIscritti=30;
	private int N_Iscritti;
	private Persona Istruttore;
	
	public Corso(TipoCorso NomeCorso, Persona Istruttore) {
		this.NomeCorso = NomeCorso;
		this.N_Iscritti = 0;
		this.Istruttore = Istruttore;
	}
	
	

}
