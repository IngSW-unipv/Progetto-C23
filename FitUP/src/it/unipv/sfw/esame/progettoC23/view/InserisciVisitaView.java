package it.unipv.sfw.esame.progettoC23.view;

import com.jgoodies.forms.layout.ColumnSpec;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import com.toedter.calendar.JCalendar;
import it.unipv.sfw.esame.progettoC23.controller.InserisciVisitaController;
import it.unipv.sfw.esame.progettoC23.model.visita.TipoVisita;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class InserisciVisitaView extends JFrame {

	private JButton submit, vediData;
	private JLabel uscita;
	private JTextField cf_insert;
	private JComboBox<Integer> orario;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	private JTextArea txtrOra, txtrCf, txtrData, txtrInserisciIDati;
	private JCalendar calendar;
	private JComboBox<String> tipovisit;
	private JTextArea txtrTipoVisita;

	public InserisciVisitaView(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setSize(590, 368);
		setTitle("Prenotazione visita");
		Container c = getContentPane();

		getContentPane().setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("79px:grow"), ColumnSpec.decode("7px"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("29px:grow"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("77px"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("1px"), FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("21px:grow"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		txtrInserisciIDati = new JTextArea();
		txtrInserisciIDati.setBackground(new Color(255, 255, 255));
		txtrInserisciIDati.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrInserisciIDati.setText("Inserisci i dati necessari");
		getContentPane().add(txtrInserisciIDati, "1, 2, 6, 1, fill, fill");

		txtrCf = new JTextArea();
		txtrCf.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrCf.setText("Codice fiscale");
		getContentPane().add(txtrCf, "1, 4, fill, fill");

		cf_insert = new JTextField();
		cf_insert.setToolTipText("");
		cf_insert.setBackground(Color.LIGHT_GRAY);
		cf_insert.setText("here");
		c.add(cf_insert, "4, 4, left, center");

		uscita = new JLabel();
		c.add(uscita, "8, 4, left, center");

		orario = new JComboBox<>();
		for (int i = 0; i < 25; i++) {
			orario.addItem(i);
		}
		orario.setSelectedIndex(11);

		txtrTipoVisita = new JTextArea();
		txtrTipoVisita.setText("Tipo visita:");
		getContentPane().add(txtrTipoVisita, "1, 6, fill, fill");

		tipovisit = new JComboBox<>();
		String[] tmp = TipoVisita.getNames(TipoVisita.class);
		for (int i = 0; i < tmp.length; i++) {
			tipovisit.addItem(tmp[i]);
		}
		getContentPane().add(tipovisit, "4, 6, fill, default");
		tipovisit.setSelectedIndex(0);

		txtrData = new JTextArea();
		txtrData.setBackground(Color.WHITE);
		txtrData.setText("Data");
		getContentPane().add(txtrData, "1, 8, fill, fill");

		calendar = new JCalendar();
		getContentPane().add(calendar, "4, 8, 3, 1, fill, fill");
		calendar.setMinSelectableDate(new Date()); // sets today as minimum selectable date
		String dateMax = "31/12/2024";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		try {
			date = dateFormat.parse(dateMax);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calendar.setMaxSelectableDate(date); // sets a specific day as max selectable date

		vediData = new JButton("show date");
		getContentPane().add(vediData, "10, 8");
		txtrOra = new JTextArea();
		txtrOra.setText("Ora");
		txtrOra.setFont(new Font("Monospaced", Font.PLAIN, 12));
		getContentPane().add(txtrOra, "1, 10, fill, fill");
		c.add(orario, "4, 10, left, top");

		submit = new JButton("PRENOTA");
		submit.setForeground(Color.RED);
		c.add(submit, "10, 10, left, top");
	}

	public JButton getSubmit() {
		return submit;
	}

	public JButton getVediData() {
		return vediData;
	}

	public JCalendar getCalendar() {
		return calendar;
	}

	public JTextArea getTxtrCf() {
		return txtrCf;
	}

	public int getHourItemCombo() {
		return (int) orario.getSelectedItem();
	}

	public TipoVisita getTipoVisitaItemCombo() {
		return TipoVisita.valueOf((String) tipovisit.getSelectedItem());
	}
}
