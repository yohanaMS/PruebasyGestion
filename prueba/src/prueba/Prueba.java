/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Yoha
 */
public class Prueba {
    
    private static WebDriver driverC=null;
    
    private static WebDriver driverF=null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yoha\\Downloads\\chromedriver.exe");
        
        driverC = new ChromeDriver();
        driverC.get("http:\\automationpractice.com/index.php");
        
       // driverC.
        
       // driverF = new FirefoxDriver();
        //driverF.get("http:\\automationpractice.com/index.php");
        
        
        
        
    }
    
}
