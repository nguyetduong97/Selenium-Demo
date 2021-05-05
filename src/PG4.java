import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PG4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        //Switching Between Frames
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        /*driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("AddFindsByCss")).click();*/

        
        driver.close();

    }
    
}
