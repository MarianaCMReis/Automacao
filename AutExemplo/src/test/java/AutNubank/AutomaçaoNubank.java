package AutNubank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaçaoNubank {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		//comando para indicar qual navegador vou utilizar e qual o caminho do driver
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//comando para adicionar as funções no chromedriver dentro do meu driver
		driver = new ChromeDriver();
		//comando para indicar qual site deseja abrir 
		driver.get("https://nubank.com.br/");
		//comando para maximizar a tela
		driver.manage().window().maximize();
		// comando para buscar um elemento e realizar a ação de preencher
		driver.findElement(By.name("cpf")).sendKeys("39468037096");
		driver.findElement(By.id("test")).click();
		driver.findElement(By.name("name")).sendKeys("Alberto Soares");
		driver.findElement(By.name("phone")).sendKeys("11987645296");
		driver.findElement(By.name("email")).sendKeys("marianachristine31@gmail.com");
		driver.findElement(By.name("emailConfirmation")).sendKeys("marianachristine31@gmail.com");
		driver.findElement(By.cssSelector("#label-accepted > span.sc-bYWUiG.gaLLqc > svg")).click();
		driver.findElement(By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > div.sc-dsKijY.dTZaxR > "
				+ "div > button")).click();
		Thread.sleep(5000);
		WebElement elemento = null;
		elemento.click();
		driver.quit();

		
		
		
	}

	@After
	public void tearDown() throws Exception {
		// fechar navegador
		
	}

	@Test
	public void validacaoNubank() {
		String texto; 
		
		//comando para buscar o elemento e pegar o texto do elemento e guardar na variável texto
		texto = driver.findElement(By.xpath("//*[@id=\"short-form\"]/h3")).getText();
		// comando para validar te o texto que passei como parametro e o texto em tela sao iguais
		
		driver.findElement(By.xpath("//*[@id=\"test\"]")).click();
		assertEquals("Enviando seus dados", texto);
	}

}
