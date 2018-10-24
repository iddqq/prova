package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
        final String page123 = "http://www.bershka.com";
        By btn123 = By.id("myAccountIco");
        By email123 = By.cssSelector("#logonForm > ul > li.formControl.labeled.first > div > input");
        By password123 = By.cssSelector("#logonForm > ul > li.formControl.labeled.passLogin > bsk-password > ng-form > div > input");
        By iniciar123 = By.cssSelector("#login-submit");
        By countryBtn123 = By.cssSelector("#iPageContent > div.wwWrapper > ul > li.formControl.noPaddingBottom > button");
        By search123 = By.cssSelector("#menuContainer > div.header__searchMobile.mobile.menu-item > span");
        By buscador123 = By.cssSelector("body > div.inline-search-container > div.inline-search-bar > search-bar > div > div > input.search-field.hide-mobile.ng-pristine.ng-untouched.ng-valid.ng-empty");

        
        //steps
        
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MLUCENTE\\Desktop\\Selenium Libreries\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get(page);
        
        driver.manage().window().maximize();
        
        driver.findElement(countryBtn123).click();
        Thread.sleep(1000);
        
        //driver.findElement(genero).click();
        //Thread.sleep(1000);
        
        driver.findElement(btn123).click();
        Thread.sleep(1000);

        driver.findElement(email123).sendKeys("debugers.amaris4@gmail.com");
        
        driver.findElement(password123).sendKeys("Correct22");
        Thread.sleep(1000);

        driver.findElement(iniciar123).click();
        Thread.sleep(1000);
        
        driver.findElement(search123).click();
        
      
        driver.findElement(buscador123).sendKeys("zapatos", Keys.ENTER);
        Thread.sleep(3000);

        //driver.findElement(buscador).click();
        
     driver.close();

        
    }
}
