package stepDefs;

import io.cucumber.java.pt.Dado;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

    WebDriver driver ;

    @Dado("que esteja com o navegador aberto na pagina {string}")
    public void queEstejaComONavegadorAberto(String url) {

        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.close();
    }
}
