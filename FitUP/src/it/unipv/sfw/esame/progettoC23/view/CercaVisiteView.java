package it.unipv.sfw.esame.progettoC23.view;

import javax.swing.JFrame;

import javax.swing.JList;

import com.toedter.calendar.JCalendar;

import it.unipv.sfw.esame.progettoC23.model.Visita;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Calendar;
import javax.swing.JTextField;

public class CercaVisiteView  extends JFrame {
	private static final int lunghezza = 535;
	private static final int altezza = 500;
	private JCalendar calendar;
	private JButton btnVai, eliminaButton, btnRicercaCF;
	private JLabel RisultatiLabel;
	private JList<Visita> resultList;
	private JTextField txtCF;
	
	public CercaVisiteView() {
		setTitle("Ricerca Visite");
		setSize(lunghezza, altezza);
		getContentPane().setLayout(null);
		
		calendar = new JCalendar();
		calendar.setBounds(10, 35, 223, 147);
		getContentPane().add(calendar);
		
		btnVai = new JButton("Cerca per data");
		btnVai.setBounds(243, 35, 112, 28);
		getContentPane().add(btnVai);
		
		RisultatiLabel = new JLabel("Risultati");
		RisultatiLabel.setBounds(10, 192, 65, 37);
		getContentPane().add(RisultatiLabel);
		
		DefaultListModel model = new DefaultListModel();
		resultList = new JList(model);
		resultList.setBounds(10, 239, 223, 196);
		getContentPane().add(resultList);
		
		eliminaButton = new JButton("Elimina visita");
		eliminaButton.setBounds(274, 260, 96, 53);
		getContentPane().add(eliminaButton);
		eliminaButton.setEnabled(false);
		
		JLabel lblInsertDate = new JLabel("Inserisci la data di ricerca");
		lblInsertDate.setBounds(10, 10, 118, 28);
		getContentPane().add(lblInsertDate);
		
		JLabel lblFindCF = new JLabel("Inserisci il codice fiscale");
		lblFindCF.setBounds(365, 18, 152, 13);
		getContentPane().add(lblFindCF);
		
		txtCF = new JTextField();
		txtCF.setBounds(365, 35, 152, 19);
		txtCF.setText("here");
		getContentPane().add(txtCF);
		txtCF.setColumns(10);
		
		btnRicercaCF = new JButton("Cerca per CF");
		btnRicercaCF.setBounds(375, 64, 96, 21);
		btnRicercaCF.setToolTipText(" ");
		getContentPane().add(btnRicercaCF);
		
	}
	
	public Calendar getData() {
		return calendar.getCalendar();
	}
	
	public JButton getCerca() {
		return btnVai;
	}
	
	public DefaultListModel getModelRisultati() {
		return (DefaultListModel) resultList.getModel();
	}
	
	public JList<Visita> getRisultati() {
		return resultList;
	}
	
	public JButton getEliminaButton() {
		return eliminaButton;
	}
	
	public JButton getRicercaPerCFButton() {
		return btnRicercaCF;
	}
	
	public String getCfInserito() {
		return txtCF.getText();
	}
}
