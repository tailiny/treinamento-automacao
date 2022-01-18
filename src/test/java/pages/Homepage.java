package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    public By searchbox = By.name("q");
    public By searchButton = By.xpath("(//input[@value='Google Search'])[2]");
    public By searchResults = By.xpath("//div[@id='tvcap']//div//div//a");
    public By imagesButton = By.xpath("//a[@data-sc='I']");
    public By imageContainer = By.id("islmp");

}