package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.MainControl;

public class RetrievePetDataListener implements ActionListener {
	
	private MainControl mc;
	
	public RetrievePetDataListener(MainControl mc) {
		this.mc = mc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.mc.showAllPets();
	}

}
