package control;

import database.Database;
import view.MainWindow;
import view.SearchingByWindows;

public class MainControl {
	
	private Database db;
	private UserControl uc;
	private PetControl pc;
	private SearchingByWindows sbw;
	
	public MainControl() {
		this.db = new Database();
		this.uc = new UserControl(this.db);
		this.pc = new PetControl(this.db);
		new MainWindow(this, this.uc, this.pc);
	}
	
	public void showAllUsers() {
		this.uc.showAllUsers();
	}
	
	public void showAllPets() {
		
		this.pc.showAllPets();
		
	}
	
	public UserControl getUserControl() {
		return this.uc;
	}
	
	public PetControl getPetControl(){
		return this.pc;
		
	}

}
