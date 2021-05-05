import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/upload/");

        WebElement chooseFile  = driver.findElement(By.id("uploadfile_0"));
        
        //Enter file path into the choose file box
        chooseFile.sendKeys("C:\\Users\\Nguyet Duong\\Downloads\\Selenium Tutorial for Beginners_ Learn WebDriver in 7 Days.html");

        //selected Service checkbox
        WebElement chk_box = driver.findElement(By.id("terms"));
        chk_box.click();

        //click submit button 
        driver.findElement(By.id("submitbutton")).click();

        driver.get("http://demo.guru99.com/test/yahoo.html");

        WebElement download_Button = driver.findElement(By.id("messenger-download"));
        String sourceLocation = download_Button.getAttribute("href");

        String wget_commend = "cmd /c C:\\Wget\\wget.exe -P Download --no-check-certificate " +sourceLocation;

        try {
            Process exec = Runtime.getRuntime().exec(wget_commend);
            int exitVal  = exec.waitFor();
            System.out.println("Exit value: " + exitVal);

        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }

        
      //  driver.close();



    }
}
