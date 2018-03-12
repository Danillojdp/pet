package control;

import java.util.ArrayList;

import javax.naming.NameNotFoundException;
import javax.swing.JOptionPane;

import database.Database;
import model.User;
import util.FileManager;

public class UserControl {
	
	private Database db;
	private FileManager fm;
	
	public UserControl(Database db){
		
		this.db = db;
		this.fm = new FileManager();
		populateUsers();
	
	}
	
		public void registerUser(String name, int age, String sex, int phone, String email, String cpf, String adress) {
			User u = new User(name, age, sex, phone, email, cpf, adress);
			this.db.addUser(u);
			this.fm.write(u.toString(), "Usuários");
		}
		
		
		public void showAllUsers() {
			String users = "";
			ArrayList<User> u = this.db.getUsers();
			for(int i = 0; i < u.size(); i++) {
				users += i + 1 + " - " + u.get(i).toString() + "\n"; 
			}
			JOptionPane.showMessageDialog(null, users);		
		}
			
		public void populateUsers() {
			ArrayList<String> users = this.fm.read("User");
			for(int i = 0; i < users.size(); i++) {
				String a = users.get(i);
				User us = createUserFromString(a);
				this.db.addUser(us);
				}
			
		}

		
			
			public User createUserFromString(String users) {
				String[] us = users.split(",");
				User u = new User(us[0], Integer.parseInt(us[1]), us[2], Integer.parseInt(us[3]), us[4], us[5], us[6]);
				return u;
			}
			
		
		public String searchUserByName(String askName) throws NameNotFoundException{
			ArrayList<User> users = this.db.getUsers();
			for(int i = 0; i < users.size(); i++) {
				if(users.get(i).getName().equalsIgnoreCase(askName)) {
					return users.get(i).toString();
				}
				
			}throw new NameNotFoundException();
		}
		
}
