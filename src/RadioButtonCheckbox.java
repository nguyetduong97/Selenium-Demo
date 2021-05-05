import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://demo.guru99.com/test/radio.html";
        driver.get(baseUrl);

        //Radiobutton 
        driver.findElement(By.id("vfb-7-1")).click();
        System.out.println("Radiobutton 1 is selected");
        driver.findElement(By.id("vfb-7-2")).click();
        System.out.println("Radiobutton 2 is selected");

        //Checkbox 

        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        checkbox1.click();
        if(checkbox1.isSelected()){
            System.out.println("Checkbox 1 is checked");
        }else{
            System.out.println("Checkbox 1 is unchecked");
        }
        


       

        driver.get("http://demo.guru99.com/test/facebook.html");
        WebElement chkFB = driver.findElement(By.id("persist_box"));
        for (int i = 0; i<2;i++) {
            chkFB.click();
            System.out.println("Facebook Persists Checkbox Status is -  " +chkFB.isSelected());
            
        }

        
        driver.close();
    }
    
}
