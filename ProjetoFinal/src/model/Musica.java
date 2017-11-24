package model;

public class Musica {

	//Atributos
	
	private String nome;
	private String artista;
	private String album;
	

	
	@Override
	public String toString() {
		return "Musica - Nome= " + nome + "\n" +
				"artista " + artista + "\n" +
				"album=" + album + "]";
	}


	// metodo construtor 
	public Musica(String nome, String artista, String album) {
		super();
		this.nome = nome;
		artista = artista;
		this.album = album;
	}


	
	// metodo get e set
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}
	
	/* Metodo que transforma um cliente na representacao dele em linha
	   para salvar em um arquivo */
	public String toLinha(){
		return getNome() + ";" + getArtista() + ";" + getAlbum();
	}
	
	
	
	
	
	
	
}
