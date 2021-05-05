import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseUrl = "http://demo.guru99.com/test/newtours/";

        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome  = builder.moveToElement(link_Home).build();

       String bg_Color = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " +bg_Color);

        mouseOverHome.perform();

        bg_Color = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bg_Color);

        driver.get("http://www.facebook.com/");
        WebElement txtUserName = driver.findElement(By.id("email"));

        Action seriesOfAction = builder.moveToElement(txtUserName).click()
        .keyDown(txtUserName, Keys.SHIFT) 
        .sendKeys(txtUserName, "hello")
        .keyUp(txtUserName, Keys.SHIFT) //==> The "hello" text is Uppercased 
        .doubleClick(txtUserName) //==> Highlight the "hello" text
        .contextClick() //bring up context menu 
        .build();

        seriesOfAction.perform();

        driver.close();

    }
}