import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingPopup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://output.jsbin.com/usidix/1"); //Not saved history and cookies
// driver.navigate() >> Duy tri history and coookies 


        String alertMessage = "";

        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);

        /* implicit waits > wait for all program
         explicit waits > partial program
        isEnabled(), isDisplayed(),isSelected(),
        WebDriverWait 
        ExpectedConditions 
        try-catch : NoSuchElementException
        TimeoutException
        */

        driver.close();
    }
}
