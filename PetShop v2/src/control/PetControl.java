package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import database.Database;
import exception.RaceNotFoundException;
import model.Pet;
import model.User;
import util.FileManager;

public class PetControl {
	
	private Database db;
	private FileManager fm;
	
	public PetControl(Database db){
		
		this.db = db;
		this.fm = new FileManager();
		populatePets();
	
	}
	
		public void registerPet(String race, int age, String sex, String specie, String vaccination) {
			Pet p = new Pet(race, sex, age, specie, vaccination);
			this.db.addPet(p);
			this.fm.write(p.toString(), "Animais");
		}
		
		
		public void showAllPets() {
			String pets = "";
			ArrayList<User> p = this.db.getUsers();
			for(int i = 0; i < p.size(); i++) {
				pets += i + 1 + " - " + p.get(i).toString() + "\n"; 
			}
			JOptionPane.showMessageDialog(null, pets);		
		}
			
		public void populatePets() {
			ArrayList<String> pets = this.fm.read("Animal");
			for(int i = 0; i < pets.size(); i++) {
				String a = pets.get(i);
				Pet ps = createPetFromString(a);
				this.db.addPet(ps);
				}
			
		}
			
			
			public Pet createPetFromString(String pets) {
				String[] ps = pets.split(",");
				Pet p = new Pet(ps[0], ps[2], Integer.parseInt(ps[3]), ps[4], ps[5]);
				return p;
			}
			
		public String searchPetByRace(String askRace) throws RaceNotFoundException{
			ArrayList<Pet> pets = this.db.getPets();
			for(int i = 0; i < pets.size(); i++) {
				if(pets.get(i).getRace().equalsIgnoreCase(askRace)) {
					return pets.get(i).toString();
				}
			}
			throw new RaceNotFoundException();
		}
		
}
