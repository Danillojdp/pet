package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import control.UserControl;
import listener.UserWindowListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class UserWindow {

	private JFrame frame;
	
	private UserControl uc;
	private JTextField textField;
	private JComboBox genderField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public UserWindow(UserControl uc) {
		this.uc = uc;
		
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 369, 359);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUserRegisterWindow = new JLabel("User register window");
		lblUserRegisterWindow.setBounds(123, 13, 122, 16);
		panel.add(lblUserRegisterWindow);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(28, 56, 82, 22);
		panel.add(lblName);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(28, 91, 82, 22);
		panel.add(lblSex);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(28, 126, 82, 22);
		panel.add(lblAge);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(28, 161, 82, 22);
		panel.add(lblPhone);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(28, 196, 82, 22);
		panel.add(lblEmail);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(28, 231, 82, 22);
		panel.add(lblCpf);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(72, 306, 225, 40);
		btnRegister.addActionListener(new UserWindowListener(this, this.uc));
		panel.add(btnRegister);
		
		textField = new JTextField();
		textField.setBounds(122, 56, 233, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		String[] genders = {"Male", "Female", "Other"};
		this.genderField  = new JComboBox(genders);
		this.genderField.setBounds(122, 91, 233, 22);
		panel.add(this.genderField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 126, 233, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 161, 233, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 196, 233, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 231, 233, 22);
		panel.add(textField_4);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(28, 266, 82, 22);
		panel.add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 266, 233, 22);
		panel.add(textField_5);
		
		this.frame.setVisible(true);
	}
	
	public String getName() {
		return this.textField.getText();
	}
	
	public int getAge() {
		return Integer.parseInt(this.textField_1.getText());
	}
	
	public String getGender() {
		return (String) this.genderField.getSelectedItem();
	}
	
	public int getPhone() {
		return Integer.parseInt(this.textField_2.getText());
	}
	
	public String getEmail() {
		return this.textField_3.getText();
	}
	
	public String getCpf() {
		return this.textField_4.getText();
	}
	
	public String getAddress() {
		return this.textField_5.getText();
	}
	
	public void close() {
		this.frame.setVisible(false);
	}
}
