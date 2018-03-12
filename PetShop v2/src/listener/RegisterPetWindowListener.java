package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.MainControl;
import view.PetWindow;

public class RegisterPetWindowListener implements ActionListener {
	
	private MainControl mc;
	
	public RegisterPetWindowListener(MainControl mc) {
		this.mc = mc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new PetWindow(this.mc.getPetControl());
	}

}
