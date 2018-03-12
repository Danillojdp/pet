package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.NameNotFoundException;
import javax.swing.JOptionPane;

import control.MainControl;
import control.UserControl;

public class SearchUserByNameListener implements ActionListener {

	private MainControl mc;
	private UserControl uc;
	
	public SearchUserByNameListener(MainControl mc, UserControl uc) {
		this.mc = mc;
		this.uc = uc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String askName = JOptionPane.showInputDialog("Digite o nome:");
		String u;
		
		try {
			u = this.uc.searchUserByName(askName);
			JOptionPane.showMessageDialog(null, u.toString());
		}catch(NameNotFoundException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
			e1.printStackTrace();
		}
	}

}
