package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.IscrizioneCorso;
import it.unipv.sfw.esame.progettoC23.view.CorsoView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CorsoController {

    private final CorsoView view;
    private CorsoView cv;

    public CorsoController(CorsoView view) {

        this.view = view;
        setListeners();

    }

    private void setListeners() {

        view.getElenco().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                int selezione = view.elenco.getSelectedIndex();

                switch (selezione) {

                    case 0:
                        view.stampaLista(IscrizioneCorso.stampaCrossfit());
                        break;

                    case 1:
                        view.stampaLista(IscrizioneCorso.stampaYoga());
                        break;

                    case 2:
                        view.stampaLista(IscrizioneCorso.stampaZumba());
                        break;

                    case 3:
                        view.stampaLista(IscrizioneCorso.stampaPilates());
                        break;
                }
            }
        });
    }
}
