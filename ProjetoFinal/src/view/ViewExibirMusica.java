package view;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Musica;

public class ViewExibirMusica {
	
	// Metodo Costrutor 
	public void ExibirCliente(ArrayList<Musica> musicas){
		// instanciar String para exibicao
		String todosMusicas= "";
		//percorrer o ArrayList 
		for (int i = 0; i <musicas.size(); i++) {
			todosMusicas = todosMusicas + musicas.get(i).toString() + "\n";
		}
		// exibir todos os clientes 
		JOptionPane.showMessageDialog(null, todosMusicas);
	}

	public void ExibirMusica(ArrayList<Musica> musicas) {
		// TODO Auto-generated method stub
		
	}

}
