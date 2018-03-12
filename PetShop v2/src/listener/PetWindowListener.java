package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.PetControl;
import view.PetWindow;

public class PetWindowListener implements ActionListener {
	
	
	private PetControl pc;
	private PetWindow pw;
	
	public PetWindowListener(PetWindow pw, PetControl pc) {
		this.pw = pw;
		this.pc = pc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.pc.registerPet(pw.getRace(), pw.getAge(), pw.getSex(), pw.getSpecie(), pw.getVaccination());
		this.pw.close();
		JOptionPane.showMessageDialog(null, "Registrado");
	}

}
