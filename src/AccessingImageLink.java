import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingImageLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/identify?ctx=recover");

        driver.findElement(By.cssSelector("a[aria-label=\"Facebook\"]")).click();
        if(driver.getTitle().equals("Facebook - Đăng nhập hoặc đăng ký")){
            System.out.println("OK");
        }else{
            System.out.println("Not OK");
        }
        driver.close();
    }
}
