import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;
import java.util.Locale;

public class TesCase {
	private WebDriver driver;

		@Before
		public void preCondicao() {
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://wwwh.ibankbmg.com.br/IBP100/");
		}
		
		@Test
		public void EfetuarLogin() {
			Faker faker = new Faker(new Locale("pt_BR"));

			WebElement preencherCpf = driver.findElement(By.id("txtCpf"));
			preencherCpf.sendKeys("08900743058");
			}
			//(GeradorCpf.geraCPF())
		@Test
		public void InserirSenha() {
			Faker faker = new Faker(new Locale("pt_BR"));
			WebElement clickSenha1 = driver.findElement(By.xpath("//ng-form[@id='formLogin']/div/div[5]/div/a/span"));
			clickSenha1.click();
			
			/*WebElement preencherCel = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(2) > div > div:nth-child(5) > div > input"));
			preencherCel.sendKeys("11977842283");
			
			WebElement abrirConta = driver.findElement(By.cssSelector("body > app-root > app-abertura-conta > div > form > div > div > div:nth-child(3) > div:nth-child(2) > a"));
			abrirConta.click();
			
			
			driver.quit();
						
		}*/
	}
}