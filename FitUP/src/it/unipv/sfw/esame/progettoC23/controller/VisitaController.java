package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.ingsfw.esame.progettoC23.exception.DayException;
import it.unipv.ingsfw.esame.progettoC23.exception.HourException;
import it.unipv.sfw.esame.progettoC23.Badge;
import it.unipv.sfw.esame.progettoC23.GestioneVisite;
import it.unipv.sfw.esame.progettoC23.TipoVisita;
import it.unipv.sfw.esame.progettoC23.Visita;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.view.VisitaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class VisitaController {
    private final VisitaView visitaView;
    private GestioneVisite gestioneVisite;

    public VisitaController(VisitaView visitaView) {
        this.visitaView = visitaView;
        this.gestioneVisite = GestioneVisite.getInstance();
        setListeners();
    }

    public void setListeners() {
        visitaView.getSubmit().addActionListener(e -> {
            IscrizioneDAO iscrizioneDAO = new IscrizioneDAO();
            String cf = visitaView.getTxtrCodicebadge().getText();
            Date data = visitaView.getCalendar().getDate();
            Iscrizione i = iscrizioneDAO.getFromCF(cf);
            if (i != null) {
                if (visitaView.getSelectedItemCombo() != null) {
                    Badge b = new Badge();
                    b.setCodiceBadge(cf);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(data);
                    calendar.set(Calendar.HOUR_OF_DAY, (int) visitaView.getSelectedItemCombo());
                    Visita v = new Visita(b, TipoVisita.OBBLIGATORIA, calendar);
                    try {
                        if (gestioneVisite.inserisciVisita(v))
                            JOptionPane.showMessageDialog(visitaView, "Visita prenotata correttamente");
                        else
                            JOptionPane.showMessageDialog(visitaView, "Data o orario non disponibili!" , "Errore", JOptionPane.WARNING_MESSAGE);
                    } catch (HourException | DayException ex) {
                        if (ex instanceof HourException)
                            JOptionPane.showMessageDialog(visitaView, "L'orario inserito non è corretto!" , "Errore", JOptionPane.WARNING_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(visitaView, "Il giorno inserito non è corretto!" , "Errore", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else
                    JOptionPane.showMessageDialog(visitaView, "Selezionare un'orario!" , "Errore", JOptionPane.WARNING_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(visitaView, "Codice fiscale non trovato!" , "Errore", JOptionPane.WARNING_MESSAGE);
        });

        visitaView.getVediData().addActionListener(e -> JOptionPane.showMessageDialog(visitaView, "Data Visita Richiesta" + visitaView.getCalendar().getDate()));
    }


}
