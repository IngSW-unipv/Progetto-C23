package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.ingsfw.esame.progettoC23.exception.DayException;
import it.unipv.ingsfw.esame.progettoC23.exception.HourException;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.model.iscrizione.Badge;
import it.unipv.sfw.esame.progettoC23.model.visita.GestioneVisite;
import it.unipv.sfw.esame.progettoC23.model.visita.TipoVisita;
import it.unipv.sfw.esame.progettoC23.model.visita.Visita;
import it.unipv.sfw.esame.progettoC23.view.InserisciVisitaView;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class InserisciVisitaController {
	private final InserisciVisitaView inserisciVisitaView;
	private GestioneVisite gestioneVisite;

	public InserisciVisitaController(InserisciVisitaView inserisciVisitaView) {
		this.inserisciVisitaView = inserisciVisitaView;
		this.gestioneVisite = GestioneVisite.getInstance();
		setListeners();
	}

	public void setListeners() {
		inserisciVisitaView.getSubmit().addActionListener(e -> {
			IscrizioneDAO iscrizioneDAO = new IscrizioneDAO();
			String cf = inserisciVisitaView.getTxtrCf().getText();
			Date data = inserisciVisitaView.getCalendar().getDate();
			Iscrizione i = iscrizioneDAO.getFromCF(cf);
			if (i != null) {
				Badge b = new Badge();
				b.setCodiceBadge(cf);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(data);
				calendar.set(Calendar.HOUR_OF_DAY, (int) inserisciVisitaView.getHourItemCombo());
				Visita v = new Visita(b, inserisciVisitaView.getTipoVisitaItemCombo(), calendar);
				try {
					if (gestioneVisite.inserisciVisita(v))
						JOptionPane.showMessageDialog(inserisciVisitaView, "Visita prenotata correttamente");
					else
						JOptionPane.showMessageDialog(inserisciVisitaView, "Data o orario non disponibili!", "Errore",
								JOptionPane.WARNING_MESSAGE);
				} catch (HourException | DayException ex) {
					if (ex instanceof HourException)
						JOptionPane.showMessageDialog(inserisciVisitaView, "L'orario inserito non è corretto!",
								"Errore", JOptionPane.WARNING_MESSAGE);
					else
						JOptionPane.showMessageDialog(inserisciVisitaView, "Il giorno inserito non è corretto!",
								"Errore", JOptionPane.WARNING_MESSAGE);
				}

			} else
				JOptionPane.showMessageDialog(inserisciVisitaView, "Codice fiscale non trovato!", "Errore",
						JOptionPane.WARNING_MESSAGE);
		});

		inserisciVisitaView.getVediData().addActionListener(e -> JOptionPane.showMessageDialog(inserisciVisitaView,
				"Data Visita Richiesta" + inserisciVisitaView.getCalendar().getDate()));
	}

}
