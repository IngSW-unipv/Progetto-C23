package it.unipv.sfw.esame.progettoC23.main;
import javax.swing.JFrame;
import it.unipv.sfw.esame.progettoC23.controller.OpenController;
import it.unipv.sfw.esame.progettoC23.view.OpenView;
import java.sql.SQLException;


public class Tester {


		public static void main(String[] args) throws SQLException {
		
		OpenView ov = new OpenView();
		OpenController oc= new OpenController(ov);
		ov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ov.setVisible(true);


    }

}