package view;
import javax.swing.JOptionPane;


public class ViewCadastrarMusica {


	// Atributos
	private String nome;
	private String artista;
	private String album;
		
	
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
		artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	// metodo para obter dados da musica a ser inserido
	
	public void  obterDadosMusica(){
		// obtendo dada musica
		this.setNome(JOptionPane.showInputDialog("Informe o nome da Música: "));
		this.setArtista(JOptionPane.showInputDialog("Informe o nome do Artista: "));
 	    this.setAlbum(JOptionPane.showInputDialog("Informe o Album da Música: "));
	}
	
	
	
	
	
	
	
	
	
}
