/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Yoha
 */
public class flujoCompra {
    private static WebElement element = null;
    
    public static WebElement search(WebDriver driver, String Id, String texto){
 
    element = driver.findElement(By.id(Id));
    element.click();
    element.clear();
    element.sendKeys(texto);
    element.submit();
    
    return element;
 
    }
    
    public static WebElement button(WebDriver driver, String nameId){
 
    element = driver.findElement(By.className(nameId));
    element.click();
    
    return element;
 
    }
}
