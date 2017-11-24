package control;


import model.BD;
import model.Musica;
import view.ViewCadastrarMusica;
import view.ViewMusicaExiste;

public class ControleCadastrarMusica {

	//Atributo
	private BD bd;

	// metodo construtor
	public ControleCadastrarMusica(BD bd) {
		super();
		this.bd = bd;
	}
	
	// metodo para obter dados da musica e grava no BD
	public void cadastrarMusica(){
		
		// instanciar a view
		ViewCadastrarMusica vcm = new ViewCadastrarMusica();
		
		//chamar metodo para obter os dados
		vcm.obterDadosMusica();
		
		//Verificar se a musica já existe
				if (this.bd.existeMusica(vcm.getNome())) {
					//Instanciar a view
					ViewMusicaExiste vme = new ViewMusicaExiste();
					//Exibir a mensagem
					vme.exibirMensagemMusicaExiste();
				} else {
		
		//instanciar um objeto da classe cliente com os dados digitados 
		Musica m = new Musica(vcm.getNome(), vcm.getArtista(), vcm.getArtista());
		
		// guardar musica no BD
		this.bd.gravarMusica(m);
	}
	
	
	
	}
	
}
