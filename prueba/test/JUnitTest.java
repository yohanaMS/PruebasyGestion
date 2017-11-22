/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static prueba.Prueba.driverC;
import prueba.flujoCompra;

/**
 *
 * @author SANTIAGO
 */
public class JUnitTest extends prueba.Prueba{
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void pruebaConsultaChiffonDress () {

        String prendaABuscar = "Printed Chiffon Dress";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTIAGO\\Downloads\\chromedriver.exe");
        driverC = new ChromeDriver();
        driverC.get("http:\\automationpractice.com/index.php");
        flujoCompra.search(driverC,"search_query_top","chiffon dress");
        
        WebElement prendaEncontrada = flujoCompra.search2(driverC,"product-name",prendaABuscar);
//        driverC.get("http:\\automationpractice.com/index.php?controller=order");
         System.out.println(prendaEncontrada.getText());
         
     }
}
