package abrinavegador;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbriNavegador extends Drivers {	
	public static void iniciarTeste() {
		String ambiente = "https://www.correios.com.br/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ambiente);
		
	}
	public static void finalizarTeste() {
		driver.quit();
	}

}
