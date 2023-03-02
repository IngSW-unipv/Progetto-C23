package it.unipv.sfw.esame.progettoC23.model.macchinario;

public class Macchinario {

    private String nomeMacchinario;
    private String dataAcquisto;

    public Macchinario() {
       
    }


    public String getDataAcquisto() {
        return dataAcquisto;
    }


    public String getNomeMacchinario() {
        return nomeMacchinario;
    }
    
    

    public void setNomeMacchinario(String nomeMacchinario) {
		this.nomeMacchinario = nomeMacchinario;
	}


	public void setDataAcquisto(String dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}


	@Override
    public String toString() {
        return "Macchinario: (" + nomeMacchinario + ", " + dataAcquisto + ")" + "\n";
    }

}
