import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/login.html");
        
        // Login the website //

        /*
        WebElement emailText = driver.findElement(By.id("email"));
        WebElement passWordText = driver.findElement(By.id("passwd"));
        //Send data into fields
        emailText.sendKeys("abcd@gmail.com");
        passWordText.sendKeys("abcdefghlkjl");
        System.out.println("Text fields set"); */

        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("abcdefghlkjl");     

        /* Delete value in textbox
        emailText.clear();
        passWordText.clear();
        System.out.println("Text fields is cleared"); 
        */

        /*  
        WebElement logicButton = driver.findElement(By.id("SubmitLogin"));
        logicButton.click(); 
        */

        driver.findElement(By.id("SubmitLogin")).click();
        System.out.println("Login successfully");

        driver.close(); 
    }
}
