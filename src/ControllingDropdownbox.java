import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ControllingDropdownbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/register.php");

        Select drpCountry = new Select(driver.findElement(By.name("country"))) ;
        if(drpCountry.isMultiple()){
            System.out.println("True");

        }else{
            System.out.println("Failed");
        }
        
        drpCountry.selectByVisibleText("ANTARCTICA");

        
        driver.get("http://output.jsbin.com/osebed/2");
        Select drpFruits = new Select(driver.findElement(By.id("fruits")));
        drpFruits.selectByVisibleText("Banana");
        drpFruits.selectByIndex(1);
        drpFruits.deselectAll();
        //driver.close();
    }
}
