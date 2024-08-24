package metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {
	public void clicar(By elemeneto) {
		driver.findElement(elemeneto).click();
	}
public void limparTexto(By elemento) {
	driver.findElement(elemento).clear();
}
 public void escrever(By elemento,String texto) {
	driver.findElement(elemento).sendKeys(texto);
}
 public void trocar() {
	 String janelaPricipal=driver.getWindowHandle();
	 Set<String> todasjanelas=driver.getWindowHandles();
	 for(String janela:todasjanelas) {
		 if(!janelaPricipal.equals(janela)) {
			 driver.switchTo().window(janela);
		 }
	 }
	 
 }
 public void trocarEvalidar(String urlAtual) {
	 trocar();
	 assertEquals(urlAtual,driver.getCurrentUrl());
 }
	 
public void trocarEclicar(By elemento) {
	 trocar();
	 driver.findElement(elemento).click();
 
}
public void subimit(By elemento) {
	driver.findElement(elemento).submit();
}
public void validarTexto(By elemento,String textoEsperaco) {
	String textoCapturado=driver.findElement(elemento).getText();
	assertEquals(textoEsperaco,textoCapturado);
}
public void fecharAbaAtual() {
	
}
}
