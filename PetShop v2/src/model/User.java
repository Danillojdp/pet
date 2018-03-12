package model;

public class User {
	
	private String name;
	private int age;
	private String sex;
	private int phone;
	private String adress;
	private String CPF;
	private String email;
	
	
	public User(String name, int age, String sex, int phone, String adress, String CPF, String email){
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.adress =  adress;
		this.CPF = CPF;
		this.email = email;
		
		
	}
	
	
	public String toString(){
		
		return "Nome: " + this.name + "\n" +
		"Idade: " + this.age + "\n" +
		"Sexo: " + this.sex + "\n" +
		"Contato: " + this.phone + "\n" +
		"Endereço: " + this.adress + "\n" +
		"CPF: " + this.CPF + "\n" +
		"Email: "+ this.email;
		
		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
