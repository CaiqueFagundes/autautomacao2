package curso.treinamento.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	WebDriver driver;

	@Dado("^que eu esteja na tela de login​$")
	public void queEuEstejaNaTelaDeLogin​() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.juliodelima.com.br/taskit/");

		// EdgeDriver(); IE
		// GeckoDriver(); Mozila Firefox
	}

	@Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\" ​$")
	public void facoLoginComOUsuarioESenha​(String user, String pass) {
		
		driver.findElement(By.xpath("/html/body/nav/div/div/ul[1]/li/a")).click();
		driver.findElement(By.xpath("//input[@placeholder='Please, tell us your login']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@placeholder='Excuse me, can you tell us a secret?']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id='signinbox']/div[2]/a")).click();
	}

	@Então("^sou autenticado com sucesso$")
	public void souAutenticadoComSucesso() {

	}

}
