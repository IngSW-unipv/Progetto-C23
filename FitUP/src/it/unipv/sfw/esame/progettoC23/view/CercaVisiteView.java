package it.unipv.sfw.esame.progettoC23.view;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JList;
import javax.swing.ListModel;

import com.toedter.calendar.JCalendar;

import it.unipv.sfw.esame.progettoC23.model.Visita;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CercaVisiteView  extends JFrame{
	private JCalendar calendar;
	private JButton btnVai, eliminaButton, btnRicercaCF;
	private JLabel RisultatiLabel;
	private JList<Visita> resultList;
	private JTextField txtCF;
	
	public CercaVisiteView() {
		setTitle("Ricerca Visite");
		getContentPane().setLayout(null);
		
		calendar = new JCalendar();
		calendar.setBounds(10, 35, 223, 147);
		getContentPane().add(calendar);
		
		btnVai = new JButton("Cerca per data");
		btnVai.setBounds(274, 35, 112, 28);
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
		lblFindCF.setBounds(453, 10, 118, 13);
		getContentPane().add(lblFindCF);
		
		txtCF = new JTextField();
		txtCF.setText("here");
		txtCF.setBounds(453, 35, 152, 19);
		getContentPane().add(txtCF);
		txtCF.setColumns(10);
		
		btnRicercaCF = new JButton("Cerca per CF");
		btnRicercaCF.setToolTipText(" ");
		btnRicercaCF.setBounds(649, 35, 96, 21);
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
