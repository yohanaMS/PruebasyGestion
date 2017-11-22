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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yoha\\Downloads\\chromedriver.exe");
        driverC = new ChromeDriver();
        driverC.get("http:\\automationpractice.com/index.php");

        flujoCompra.search(driverC,"search_query_top","chiffon dress");
        flujoCompra.button(driverC, "ajax_add_to_cart_button");
        
        flujoCompra.search(driverC, "search_query_top", "Blouse");
        flujoCompra.button(driverC, "ajax_add_to_cart_button");
        // addCar = driverC.findElement(By.xpath("div[contains(@class,'button-container')/span/span"));
        // addCar.click();
        // addCar = driverC.findElement(By.className("cross"));
        //addCar.click();

       // flujoCompra.search(driverC, "search_query_top", "");
        
        driverC.get("http:\\automationpractice.com/index.php?controller=order");
          
        
        // driverC.
        // driverF = new FirefoxDriver();
    }

}
