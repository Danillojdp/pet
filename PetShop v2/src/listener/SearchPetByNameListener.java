package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.MainControl;
import control.PetControl;
import exception.RaceNotFoundException;

public class SearchPetByNameListener implements ActionListener {
	
	private MainControl mc;
	private PetControl pc;
	
	public SearchPetByNameListener(MainControl mc, PetControl pc) {
		this.mc = mc;
		this.pc = pc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String askRace = JOptionPane.showInputDialog("Digite a raça:");
		String p;
		
		try {
			p = this.pc.searchPetByRace(askRace);
			JOptionPane.showMessageDialog(null, p.toString());
			
		} catch(RaceNotFoundException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
			e1.printStackTrace();
		}
		
	}

}
