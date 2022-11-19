import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.Driver;

public class TestSystem {

    @Test
    public void pesquisaGoogle(){
        WebDriver navegar = new ChromeDriver();
        navegar.get("https://google.com");

        navegar.findElement(By.id("input")).click();
        navegar.findElement(By.id("input")).sendKeys("saraiva", Keys.ENTER); 
    }

    @Test
    public void pesquisaSaraiva(){
        WebDriver navegar = new ChromeDriver();
        pesquisa.get("https://www.saraiva.com.br/");

        pesquisa.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/label/div/input")).click();
        pesquisa.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/label/div/input")).sendKeys("Python", Keys.ENTER);

    }

    @Test
    public void pesquisaNike(){
        WebDriver navegar = new ChromeDriver();
        pesquisa.get("https://www.nike.com.br/");

        pesquisa.findElement(By.fullxpath("/html/body/div[4]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/input"));
        pesquisa.findElement(By.fullxpath("/html/body/div[4]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/input")).sendKeys("sapato", Keys.ENTER);

    }
}
