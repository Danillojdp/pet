package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	// Atributo
	
	private ArrayList<Musica> musicas;
	//private ArrayList<Artista> artistas;
 	private String fileName = "musica.txt";
 	private DocumentWriter dw;
	private DocumentReader dr;
 	//private String fileNames = "artistas.txt";
	// metodo construtor 
	
 	//Metodo construtor
 		public BD(){
 			//Instanciar o ArrayList
 			this.musicas = new ArrayList<Musica>();
 			//Instanciar o DocumentReader
 			this.dr = new DocumentReader();
 			//Instanciar o DocumentWriter
 			this.dw = new DocumentWriter();
 		}
 		public void carregarMusicas(){
 			//Ler as linhas do arquivo
 			ArrayList<String> linhas = this.dr.read(this.fileName);
 			//Percorrer o ArrayList criando as Musicas
 			for (int i = 0; i < linhas.size(); i++) {
 				//Separa a linha em um array de String
 				String[] linhaMusica = linhas.get(i).split(";");
 				//Cria a musica com os dados da linha
 				Musica m = new Musica(linhaMusica[0], linhaMusica[1], linhaMusica[2]);
 				//Coloca a Musica no ArrayList
 				this.musicas.add(m);
 			}
 		}
 		
 		//Metodo que verifica se ja existe Musica com o Nome informado
 		public boolean existeMusica(String Nome){
 			boolean retorno = false;
 			//Percorrer o arraylist
 			for (int i = 0; i < this.musicas.size(); i++) {
 				//Verificar se existe musica com mesmo nome
 				if (this.musicas.get(i).getNome().equals(Nome)) {
 					retorno = true;
 				}
 			}
 			
 			return retorno;
 		}
 		
 		
 		//Metodo que grava Musica
 		public void gravarMusica(Musica m){
 			//Colocar a musica no ArrayList
 			this.musicas.add(m);
 			//Gravar o Cliente no arquivo
 			this.dw.write(this.fileName, m.toLinha());
 		}

 		public ArrayList<Musica> getMusicas() {
 			return musicas;
 		}
 		
 	}
