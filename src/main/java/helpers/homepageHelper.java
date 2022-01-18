package helpers;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageHelper  {

    WebDriver driver ;
    String url;


    public HomePageHelper() {
        url = "";
        driver = new ChromeDriver();
    }


    /**
     * open url
     */
    @Given("^abrir uma pagina \"([^\"]*)\"$")
    public void abrir_uma_pagina(String url) {
        driver.get(url);
    }
}