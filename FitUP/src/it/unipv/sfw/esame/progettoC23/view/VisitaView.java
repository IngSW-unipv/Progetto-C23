package it.unipv.sfw.esame.progettoC23.view;
import java.awt.Container;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VisitaView extends JFrame {
	
	private JButton submit;
	private JLabel uscita;
	private JTextField badge;
	private JComboBox<int[]> orario;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	public static final int altezzab = 150;
	public static final int lunghezzab = 100;
	
	public VisitaView() {
		setLayout(new FlowLayout());
		setSize(altezza,lunghezza);
		setTitle("Prenotazione visita");
		Container c=getContentPane();
	
		badge=new JTextField();
		c.add(badge);
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model,null);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		c.add(datePicker);

		int[] ora={10,11,12,14,15,16};
	    orario= new JComboBox<>();
	    orario.addItem(ora);
	    c.add(orario);
	    
	    
	    submit = new JButton("PRENOTA");
	    submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
	    c.add(submit);
	    
		uscita = new JLabel();
		c.add(uscita);
		
		
	}
	

	

}
