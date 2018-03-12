package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.MainControl;
import view.UserWindow;

public class RegisterUserWindowListener implements ActionListener {
	
	private MainControl mc;
	
	public RegisterUserWindowListener(MainControl mc) {
		this.mc = mc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new UserWindow(this.mc.getUserControl());
	}

}
