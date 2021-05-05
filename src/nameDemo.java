import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class nameDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/ajax.html");

        /*
        //Find No option and click it
        driver.findElement(By.id("no")).click();

        //Click Check button 
        driver.findElement(By.id("buttoncheck")).click();

        //Click Reset button 
        driver.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]")).click();

        driver.findElement(By.id("yes")).click();
        driver.findElement(By.id("buttoncheck")).click();
        driver.close();
        */

        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        for (int i = 0; i<elements.size(); i++){
            System.out.println("Radio button text: " + elements.get(i).getAttribute("value"));
        }

    }
}
