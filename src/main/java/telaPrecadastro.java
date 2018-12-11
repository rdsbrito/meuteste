//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//mport com.github.javafaker.Faker;
//import java.util.Locale;
import org.openqa.selenium.WebElement;

public class telaPrecadastro {
	WebDriver driver;

	public WebElement preencherNome = driver.findElement(By.id("txtCpf"));
		this.driver = driver;
	}
	
	public telaPrecadastro preencherNome(String nome) {
		driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(2) > div > div:nth-child(2) > div > input"));sendKeys(nome);
		return this;
	}

	private void sendKeys(String nome) {
		// TODO Auto-generated method stub
		
	}
	/*@Before
		public void preCondicao() {
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://digitalaplich.bancobmg.com.br/PreCadastro/");
		}
		
		@Test
		public void deveCriarUmRegistro() {
			Faker faker = new Faker(new Locale("pt_BR"));

			WebElement preencherNome = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(2) > div > div:nth-child(2) > div > input"));
			preencherNome.sendKeys(faker.name().fullName());
			
			WebElement preencherCpf = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(2) > div > div:nth-child(3) > div > input"));
			preencherCpf.sendKeys(GeradorCpf.geraCPF());
			
			WebElement preencherData = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(2) > div > div:nth-child(4) > div > input"));
			preencherData.sendKeys("28/12/1990");
			
			WebElement preencherCel = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(2) > div > div:nth-child(5) > div > input"));
			preencherCel.sendKeys("11977842283");
			
			WebElement abrirConta = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(3) > div:nth-child(2) > a"));
			abrirConta.click();
			
			
			driver.quit();
						
		}*/
}