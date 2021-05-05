import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);

        //By.id() => Extract elements base the value of "id" attribute
        String tagName = "";
        tagName = driver.findElement(By.id("email")).getTagName(); //=> Extract ten the chinh xac cua any elements

        //By.classNam() => Extract element base on the value of "Class" attribute
        //By.cssSelector => Extract element base on the css selector engine >> "Contain" keyword doesn't support for cssSelector
        //By.linkText => Find link element by extract text it displays
        String tagName2 = "";
        tagName2 = driver.findElement(By.linkText("Quên mật khẩu?")).getTagName();
        //By.name 
        //By.partialLinkText
        //By.tagName
        //by.xpath

        WebElement myElement = driver.findElement(By.id("email"));
        myElement.sendKeys("tutorial");
        
        //click() method => driver.findElement(By.name("login")).click();
       
        System.out.println(tagName);
        System.out.println(tagName2);
        driver.close();

        /* Get commands

        Get (String) >> access into browser
        getTitle() >> get title of current page, it will return NUll if page has not title
        getPageSource()
        getCurrentUrl()
        getText() 
        
        */

        /* Navigate commands
            navigate().to() >> open new browser windown
            navigate().refresh() >> refresh current page
            navigate().back() >> back by one page on browser history
            navigate().forward() >> forward by one page on browser history
            
        */
        


        //Close this program
        System.exit(0);
    }
    
}
