package page;

import org.openqa.selenium.By;

import drivers.Drivers;
import metodos.Metodos;

public class HomePage extends Drivers {
By campoInformacao = By.id(null);	
By logadouro = By.xpath("//th[@data-th='logradouro/Nome']");
By bairro = By.xpath("//th[@data-th='Bairro/Distrito']");
By localidade =By.xpath("Calcular Frete");
By cep = By.xpath("");

Metodos metodo = new Metodos();

public void informaCep(String cep) {
	metodo.escrever(campoInformacao, cep);
	
}
public void enviarDadosEndereco() {
	metodo.subimit(campoInformacao);
	
}
public void validarDadosDeEndereco(String logadouro,String bairro,String localidade,String cep) {
	metodo.validarTexto(this.logadouro, logadouro);
	metodo.validarTexto(this.bairro, bairro);
	metodo.validarTexto(this.localidade, localidade);
	metodo.validarTexto(this.cep, cep);
}

}
