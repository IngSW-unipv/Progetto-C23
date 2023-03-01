package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.view.VisitaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitaController {
    private final VisitaView visitaView;

    public VisitaController(VisitaView visitaView) {
        this.visitaView = visitaView;
        setListeners();
    }

    public void setListeners() {
        visitaView.getSubmit().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Auto-generated method stub
                String badge = visitaView.getTxtrCodicebadge().getText();
                //MANCA POSSIBILITA' DI RECUPERO BADGE
            }
        });

        visitaView.getVediData().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(visitaView.getVediData(), "Data Visita Richiesta" + visitaView.getCalendar().getDate());

            }

        });
    }


}
