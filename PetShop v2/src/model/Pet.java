package model;

public class Pet {
	
	private String race;
	private String sex;
	private int age;
	private String specie;
	private String vaccination;
	
	public Pet(String race, String sex, int age, String specie, String vaccination){
		
		this.race = race;
		this.sex = sex;
		this.age = age;
		this.specie = specie;
		this.vaccination = vaccination;
		
	}
		
		public String toString(){
			
			return "Raça :" + this.race + "\n" +
				"Sexo :" + this.sex + "\n" +
				"Idade :" + this.age + "\n" +
				"Espécie: " + this.specie + "\n" +
				"Vacinação" + this.vaccination;
								
								}

		public String getRace() {
			return race;
		}

		public void setRace(String race) {
			this.race = race;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSpecie() {
			return specie;
		}

		public void setSpecie(String specie) {
			this.specie = specie;
		}

		public String getVaccination() {
			return vaccination;
		}

		public void getVaccination(String vaccination) {
			this.vaccination = vaccination;
		}

}
