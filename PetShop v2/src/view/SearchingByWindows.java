package view;

import javax.swing.JOptionPane;

public class SearchingByWindows {
	
	public String askName() {
		return JOptionPane.showInputDialog("Nome:");
	}
	
	public String askRace() {
		return JOptionPane.showInputDialog("Raça:");
	}

}
