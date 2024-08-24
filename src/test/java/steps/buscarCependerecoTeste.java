package steps;

import org.junit.Test;

import abrinavegador.AbriNavegador;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class buscarCependerecoTeste {
	
	Metodos metodo = new Metodos();
		
	@Test
	public void iniciarTeste() {
		AbriNavegador.iniciarTeste();
		
	}
		@Dado("que informe um cp valido")
		public void queInformeUmCpValido() {
			AbriNavegador.iniciarTeste();
			
			System.out.println("ATE QUE EM FIM AAAAUUUUIII");
		   
		}
		@Quando("enviado o cp")
		public void enviadoOCp() {
		   
		}
		@Entao("valido os dados de endereco")
		public void validoOsDadosDeEndereco() {
		    
		}
		@Entao("retorno a tela para pesquisar pelo endereco")
		public void retornoATelaParaPesquisarPeloEndereco() {
	
		}
}


	

		
	
	
