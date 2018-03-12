package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.PetControl;
import listener.PetWindowListener;

public class PetWindow {

	private JFrame frame;
	
	private PetControl pc;
	private JTextField textField;
	private JComboBox genderField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public PetWindow(PetControl pc) {
		this.pc = pc;
		
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 370, 268);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRaa = new JLabel("Ra\u00E7a:");
		lblRaa.setBounds(27, 39, 69, 22);
		panel_1.add(lblRaa);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(27, 74, 69, 22);
		panel_1.add(lblSexo);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(27, 109, 69, 22);
		panel_1.add(lblIdade);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(27, 144, 69, 22);
		panel_1.add(lblEspecie);
		
		JLabel lblVacinado = new JLabel("Vacinado:");
		lblVacinado.setBounds(27, 179, 69, 22);
		panel_1.add(lblVacinado);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(80, 209, 210, 41);
		btnNewButton.addActionListener(new PetWindowListener(this, this.pc));
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(108, 39, 240, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		String[] genders = {"Male","Female"};
		this.genderField = new JComboBox(genders);
		this.genderField.setBounds(108, 74, 240, 22);
		panel_1.add(this.genderField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 109, 240, 22);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 144, 240, 22);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 179, 240, 22);
		panel_1.add(textField_3);
		
		this.frame.setVisible(true);
	}
	
	public int getAge() {
		return Integer.parseInt(this.textField_1.getText());
	}
	
	public String getRace() {
		return this.textField_2.getText();
	}
	
	public String getSex() {
		return (String) this.genderField.getSelectedItem();
	}
	
	public String getSpecie() {
		return this.textField.getText();
	}
	
	public String getVaccination(){
		
		return this.textField_3.getText();
		
	}
	
	public void close() {
		this.frame.setVisible(false);
	}
	
}
