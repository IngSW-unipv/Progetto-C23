package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import javax.swing.*;

public class OpenView extends JFrame {
	
	public JComboBox scelte;
	private JLabel scritta;
	private JLabel immagine;
	
	public OpenView() {
		
		setLayout(new BorderLayout());
		setSize(500,500);
		
		JPanel p = new JPanel();
		p.setBackground(new Color(255,0,0));
		p.setLayout(new FlowLayout());
		add(p, BorderLayout.CENTER);
		
		scritta = new JLabel("Scegli un'operazione tra le seguenti");
		p.add(scritta);
		
		String s[] = {"PRIMA ISCRIZIONE", "PRENOTA VISITE", "CERCA VISITE", "MACCHINARI"};
		
		scelte = new JComboBox(s);
		scelte.setPreferredSize(new Dimension(200,20));
		p.add(scelte, BorderLayout.CENTER);
		
		Icon imm = new ImageIcon(getClass().getResource("corsa.gif"));
		immagine = new JLabel(imm);
		immagine.setPreferredSize(new Dimension (400,400));
		p.add(immagine);
			
	}
	
	public JComboBox getScelta() {
		
		return scelte;
	}
	
	
	

}
