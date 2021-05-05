import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement custId = driver.findElement(By.name("cusid"));
        custId.sendKeys("53920");
       
        driver.findElement(By.name("submit")).submit();

        //Switching to alert
        Alert alert = driver.switchTo().alert();
            
        //Capture alert message
        String msg_Alert = driver.switchTo().alert().getText();
        System.out.println(msg_Alert);
        Thread.sleep(3000);

        //accept alert
        alert.accept();
        */

        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String main_Windown = driver.getWindowHandle();

        //open another windown
        Set<String> w1 = driver.getWindowHandles();
        Iterator<String> t1 = w1.iterator();

        //hasNext(): method belong to Iterator: Xu ly phan tu tiep theo neu ton tai
        while (t1.hasNext()) {
            String new_Windown = t1.next();
            
            if (!main_Windown.equalsIgnoreCase(new_Windown)) {
                driver.switchTo().window(new_Windown);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                Thread.sleep(2000);
            }            
        }
        driver.switchTo().window(main_Windown);
    }
}
