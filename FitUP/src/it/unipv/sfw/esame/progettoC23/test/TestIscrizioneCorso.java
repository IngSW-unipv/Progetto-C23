package it.unipv.sfw.esame.progettoC23.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.unipv.sfw.esame.progettoC23.model.IscrizioneCorso;

class TestIscrizioneCorso {
	
	private IscrizioneCorso c;

	@Before
	public void InitTest () {
		
		c = new IscrizioneCorso ();
	}

	@Test
	void TestRiempiElenco() {
		
		c.riempiElenco("MRS", "CROSSFIT");
		c.riempiElenco("VRS", "CROSSFIT");
        assertEquals("Sono state aggiunte due persone alla lista", 2, c.stampaCrossfit().size()); 
       
	}
	

	
}
