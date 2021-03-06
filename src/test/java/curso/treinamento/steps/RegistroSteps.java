package curso.treinamento.steps;


import java.util.List;
import java.util.Map;

import javax.swing.JSpinner.ListEditor;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RegistroSteps {
	
	WebDriver driver;

	@Dado("^que eu esteja  na tela de registro$")
	public void que_eu_esteja_na_tela_de_registro() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.juliodelima.com.br/taskit/");
		
		driver.findElement(By.id("signup")).click();
	    
	    
	    //Assert.assertTrue("Página'login' Cadastro apresentado com sucesso",driver.findElement(By.xpath("/html/body/nav/div/div/ul[1]/li[1]/a")).isDisplayed());
	    
	}

	@Quando("^faço o preenchimento das informações da tela de Register$")
	public void faço_o_preenchimento_das_informações_da_tela_de_Register(DataTable dataTable) throws Throwable {
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		
				
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(list.get(0).get("User name"));
	  //driver.findElement(By.name("name")).sendKeys(list.get(0).get("First Name"));
	    
	    driver.findElement(By.xpath("//input[@name='login']")).sendKeys(list.get(0).get("Login"));
	    
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(list.get(0).get("Password"));
	    
	    driver.findElement(By.xpath("//*[@id='signupbox']/div[2]/a")).click();
	    
	    Assert.assertTrue("Página'login' Cadastro apresentado com sucesso",driver.findElement(By.xpath("/html/body/nav/div/div/ul[1]/li[1]/a")).isDisplayed());
	    
	    //driver.findElement(By.name("phone")).sendKeys(list.get(0).get("Phone"));
	    
	    //driver.findElement(By.id("userName")).sendKeys(list.get(0).get("Email"));
	    
	    //driver.findElement(By.name("address1")).sendKeys(list.get(0).get("Address"));
	    
	    //driver.findElement(By.name("address2")).sendKeys(list.get(0).get("Address Complement"));
	    
	    //driver.findElement(By.name("city")).sendKeys(list.get(0).get("City"));
	    
	    //driver.findElement(By.name("state")).sendKeys(list.get(0).get("State Province"));
	    
	    // driver.findElement(By.name("postalCode")).sendKeys(list.get(0).get("Postal code"));
	    
	    // new Select(driver.findElement(By.name("country"))).selectByVisibleText(list.get(0).get("Country"));
	    
	    // driver.findElement(By.id("email")).sendKeys(list.get(0).get("User name"));
	    
	    //driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
	    
	    //driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("Confirm password"));
	    
	    //driver.findElement(By.name("register")).click();
	    
	}

	@Então("^sou registrado com sucesso$")
	public void sou_registrado_com_sucesso() throws Throwable {
	
	    throw new PendingException();
	}

	
}
