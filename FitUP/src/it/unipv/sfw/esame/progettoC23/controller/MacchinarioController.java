package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MacchinarioController {
    private final ManutenzioneMacchinario dataAcquisto;
    private final MacchinarioView view;
    private final IDMacchinario idMacchinario;

    public MacchinarioController(ManutenzioneMacchinario dataAcquisto, MacchinarioView view, IDMacchinario idMacchinario) {

        this.dataAcquisto = dataAcquisto;
        this.view = view;
        this.idMacchinario = idMacchinario;
	
		/*Scanner scanner = new Scanner(System.in);
		NomeMacchinario = scanner.nextLine();
		
		Scanner scanner1 = new Scanner(System.in);
		dataAcquisto = scanner1.nextLine();*/

        setListeners();
    }

    private void setListeners() {
        view.getNuovoMacchinario().addActionListener(new ActionListener() {
            //private String NomeMacchinario, dataAcquisto;

            @Override
            public void actionPerformed(ActionEvent e) {

                if (idMacchinario != null) {
                    view.uscita1.setText("Macchinario già esistente");
                } else {
                    view.setNuovoMacchinario(idMacchinario.getIDMacchinario());
                }
            }

        });

        view.getCerca().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (idMacchinario != null) {
                    view.setDataManutenzione(dataAcquisto);
                } else {
                    view.uscita1.setText("Macchinario non trovato");
                }
            }
        });
    }
}
