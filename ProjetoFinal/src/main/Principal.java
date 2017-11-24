package main;

import java.util.ArrayList;

import control.ControleCadastrarMusica;
import control.ControleExibirMusica;
import model.BD;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar o BD
		BD bd=new BD();
		//Carregar musicas do arquivo
		bd.carregarMusicas();
		//instanciar controleExibirMusicas
		ControleExibirMusica cem = new ControleExibirMusica(bd);
		// instanciar ControleCadastrarMusica
		ControleCadastrarMusica ccm= new ControleCadastrarMusica(bd);
		
		//Exibir todas as musicas
		cem.exibirMusica();
		
		// inserir uma nova musica
		ccm.cadastrarMusica();
		
		//Exibir todas as musicas novamente
		cem.exibirMusica();
		

	}

}

