package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.UserControl;
import view.UserWindow;

public class UserWindowListener implements ActionListener {
	
	private UserControl uc;
	private UserWindow urw;
	
	public UserWindowListener(UserWindow urw, UserControl uc) {
		this.urw = urw;
		this.uc = uc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.uc.registerUser(urw.getName(), urw.getAge(), urw.getGender(), urw.getPhone(), urw.getEmail(), urw.getCpf(), urw.getAddress());
		this.urw.close();
		JOptionPane.showMessageDialog(null, "Registered");
	}

}
