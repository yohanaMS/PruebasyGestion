/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Yoha
 */
public class Prueba {

    private static WebDriver driverC = null;
    private static WebDriver driverF = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yoha\\Downloads\\chromedriver.exe");
        WebElement search;
        WebElement button;
        WebElement addCar;
        WebElement checkout;

        driverC = new ChromeDriver();
        driverC.get("http:\\automationpractice.com/index.php");

        search = driverC.findElement(By.id("search_query_top"));
        search.click();
        search.sendKeys("chiffon dress");
        search.submit();

        button = driverC.findElement(By.className("ajax_add_to_cart_button"));
        button.click();

        // addCar = driverC.findElement(By.xpath("div[contains(@class,'button-container')/span/span"));
        // addCar.click();
        // addCar = driverC.findElement(By.className("cross"));
        //addCar.click();
//        
        search = driverC.findElement(By.id("search_query_top"));
        search.click();
        search.clear();
        search.sendKeys("Blouse");
        search.submit();
        
        button = driverC.findElement(By.className("ajax_add_to_cart_button"));
        button.click();
         
        
        search = driverC.findElement(By.id("search_query_top"));
        search.click();
        search.clear();
        search.submit();
        
        checkout = driverC.findElement(By.className("shopping_cart"));
        checkout.click();

        checkout = driverC.findElement(By.id("center_column"));
        checkout.click();
        // driverC.
        // driverF = new FirefoxDriver();
        //driverF.get("http:\\automationpractice.com/index.php");
    }

}
