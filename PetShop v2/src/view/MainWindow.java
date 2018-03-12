package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import control.MainControl;
import control.PetControl;
import control.UserControl;
import listener.RegisterPetWindowListener;
import listener.RegisterUserWindowListener;
import listener.RetrievePetDataListener;
import listener.RetrieveUserDataListener;
import listener.SearchPetByNameListener;
import listener.SearchUserByNameListener;

public class MainWindow {

	private JFrame frame;
	private MainControl mc;
	private UserControl uc;
	private PetControl pc;

	public MainWindow(MainControl mc, UserControl uc, PetControl pc) {
		this.mc = mc;
		this.uc = uc;
		this.pc = pc;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 334);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Register user");
		btnNewButton.setBounds(111, 13, 210, 39);
		btnNewButton.addActionListener(new RegisterUserWindowListener(this.mc));
		panel.add(btnNewButton);
		
		JButton btnRegisterPet = new JButton("Register pet");
		btnRegisterPet.setBounds(111, 178, 210, 39);
		btnRegisterPet.addActionListener(new RegisterPetWindowListener(this.mc));
		panel.add(btnRegisterPet);
		
		JButton btnSearchForA = new JButton("Show all users");
		btnSearchForA.setBounds(111, 65, 210, 39);
		btnSearchForA.addActionListener(new RetrieveUserDataListener(this.mc));
		panel.add(btnSearchForA);
		
		JButton btnSearchForA_1 = new JButton("Show all pets");
		btnSearchForA_1.setBounds(111, 230, 210, 39);
		btnSearchForA_1.addActionListener(new RetrievePetDataListener(this.mc));
		panel.add(btnSearchForA_1);
		
		JButton btnSearchForA_2 = new JButton("Search for a pet by name");
		btnSearchForA_2.setBounds(111, 282, 210, 39);
		btnSearchForA_2.addActionListener(new SearchPetByNameListener(this.mc, this.pc));
		panel.add(btnSearchForA_2);
		
		JButton btnSearchForA_3 = new JButton("Search for a user by name");
		btnSearchForA_3.setBounds(111, 117, 210, 39);
		btnSearchForA_3.addActionListener(new SearchUserByNameListener(this.mc, this.uc));
		panel.add(btnSearchForA_3);
		
		this.frame.setVisible(true);
	}
}
