package database;

import java.util.ArrayList;

import model.Pet;
import model.User;

public class Database {
	
	private ArrayList<User> users;
	private ArrayList<Pet> pets;
	
	public Database(){
		
		this.users = new ArrayList<User>();
		this.pets = new ArrayList<Pet>();
		
		this.populate();
		}
	
	public void addUser(User u){
		this.users.add(u);
	}
	
	public void addPet(Pet p){
		this.pets.add(p);
	}
	

	public ArrayList<User> getUsers() {
		return users;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}
	
	private void populate() {
		User user1 = new User("Matheus", 18, "Masculino", 986589265, "SQN 106", "022.976.641-25", "mhmvalente@hotmail.com");		
		User user2 = new User("Marcos", 18, "Outro", 999123456, "SQSW 504", "04312345680", "Marcos@hotmail.com");
		User user3 = new User("Luiz", 18, "Homem", 999123456, "Águas Claras Cond. YouLifeStyle", "04312345682", "Luiz@hotmail.com");
		User user4 = new User("Maria", 18, "Mulher", 999123456, "SQN 104", "04312345617", "Maria@hotmail.com");
		User user5 = new User("Luiza", 18, "Outro", 999123456, "SQN 712", "04312345622", "Luiza@hotmail.com");
		
		this.users.add(user1);
		this.users.add(user2);
		this.users.add(user3);
		this.users.add(user4);
		this.users.add(user5);
		
		Pet pet1 = new Pet("Husky Siberiano", "Macho", 2, "Cachorro", "Vacinado");		
		Pet pet2 = new Pet("Persa", "Macho", 1, "Gato", "Não Vacinado");
		Pet pet3 = new Pet("Pastor Alemão", "Macho", 3, "Cachorro", "Vacinado");
		Pet pet4 = new Pet("Shitzu", "Fêmea", 1, "Cachorro", "Não Vacinado");
		Pet pet5 = new Pet("Sphynx", "Fêmea", 2, "Gato", "Vacinado");
		
		this.pets.add(pet1);
		this.pets.add(pet2);
		this.pets.add(pet3);
		this.pets.add(pet4);
		this.pets.add(pet5);
	}

}
