package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import java.awt.Color;
import com.toedter.calendar.JCalendar;

public class VisitaView extends JFrame {
	
	private JButton submit, vediData;
	private JLabel uscita;
	private JTextField badge;
	private JComboBox<int[]> orario;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	private JTextArea txtrOra,txtrCodicebadge,txtrData,txtrInserisciIDati;
	private JCalendar calendar;

	
	public VisitaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setSize(590,368);
		setTitle("Prenotazione visita");
		Container c=getContentPane();

		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("79px:grow"),
				ColumnSpec.decode("7px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("29px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("77px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("1px"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("21px:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		int[] ora={10,11,12,14,15,16};
		
		txtrInserisciIDati = new JTextArea();
		txtrInserisciIDati.setBackground(new Color(255, 255, 255));
		txtrInserisciIDati.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrInserisciIDati.setText("Inserisci i dati necessari");
		getContentPane().add(txtrInserisciIDati, "1, 2, 6, 1, fill, fill");
	    
		uscita = new JLabel();
		c.add(uscita, "8, 4, left, center");
		
		orario= new JComboBox<>();
		orario.addItem(ora);
		
		txtrCodicebadge = new JTextArea();
		txtrCodicebadge.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrCodicebadge.setText("CodiceBadge");
		getContentPane().add(txtrCodicebadge, "1, 6, fill, fill");
		
			badge=new JTextField();
			badge.setToolTipText("");
			badge.setBackground(Color.LIGHT_GRAY);
			badge.setText("here");
			c.add(badge, "4, 6, 3, 1, left, center");
		
		txtrData = new JTextArea();
		txtrData.setBackground(Color.WHITE);
		txtrData.setText("Data");
		getContentPane().add(txtrData, "1, 8, fill, fill");
		
		calendar = new JCalendar();
		getContentPane().add(calendar, "4, 8, 3, 1, fill, fill");
		
		vediData = new JButton("show date");
		getContentPane().add(vediData, "10, 8");
		vediData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(vediData,"Data Visita Richiesta"+calendar.getDate());
				
			}
			
		});
		
		txtrOra = new JTextArea();
		txtrOra.setText("Ora");
		txtrOra.setFont(new Font("Monospaced", Font.PLAIN, 12));
		getContentPane().add(txtrOra, "1, 10, fill, fill");
		c.add(orario, "4, 10, left, top");
		
		
		submit = new JButton("PRENOTA");
		submit.setForeground(Color.RED);
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		c.add(submit, "10, 10, left, top");
		
		
	}
	
	public JButton getvediData() {
		return vediData;		
	}
}
