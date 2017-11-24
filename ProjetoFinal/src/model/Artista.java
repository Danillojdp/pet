package model;

public class Artista {
	//Atributos
	public String nome;

	//Metodos
		//Metodo toString
	@Override
	public String toString() {
		return "Artista [nome=" + nome + "]";
	}

		//Metodo get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
		//Metodo Construtor
	public Artista(String nome) {
		super();
		this.nome = nome;
	}
	
	
	
}
