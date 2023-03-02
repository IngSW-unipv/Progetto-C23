package it.unipv.sfw.esame.progettoC23.test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.unipv.sfw.esame.progettoC23.model.corso.IscrizioneCorso;

class TestIscrizioneCorso {
	
	private IscrizioneCorso c = new IscrizioneCorso ();

	@Before
	public void InitTest () {	
		
	}

	@Test
	void TestCrossfit() {
		
		c.riempiElenco("MRS", "CROSSFIT");
		c.riempiElenco("VRS", "CROSSFIT");
        assertEquals("Sono state aggiunte due persone alla lista", 2, c.stampaCrossfit().size()); 
       
	}
	
	@Test
	void TestYoga() {
		
		c.riempiElenco("MRS", "YOGA");
        assertEquals("Sono state aggiunte due persone alla lista", 1, c.stampaYoga().size()); 
       
	}

	
	@Test
	void TestPilates() {
		
		c.riempiElenco("MRS", "PILATES");
		c.riempiElenco("VRS", "PILATES");
		c.riempiElenco("ABC", "PILATES");
        assertEquals("Sono state aggiunte due persone alla lista", 3, c.stampaPilates().size()); 
       
	}
	
	@Test
	void TestZumba() {
		
		c.riempiElenco("MRS", "ZUMBA");
		c.riempiElenco("VRS", "ZUMBA");
        assertEquals("Sono state aggiunte due persone alla lista", 2, c.stampaZumba().size()); 
       
	}
	
	
	
}
