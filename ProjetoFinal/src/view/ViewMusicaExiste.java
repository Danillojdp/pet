package view;

import javax.swing.JOptionPane;

public class ViewMusicaExiste {

	//Metodo para exibir mensagem de musica existente
	public void exibirMensagemMusicaExiste(){
		JOptionPane.showMessageDialog(null, "Musica j� existe!", "Erro",
				JOptionPane.ERROR_MESSAGE);
	}
}
