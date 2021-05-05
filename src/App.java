import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        
        //System.out.println("Hello, World!");
        
              
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nguyet Duong\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
       
        //Instantiation object/browser  
        ChromeDriver driver = new ChromeDriver();

        //Declare variables 
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        //Launch chrome and direct to the page test
        driver.get(baseUrl);

        //Get actual value 
        actualTitle = driver.getTitle();

        //Compare actual title of the page with expected title
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        // Termination browser 
        //driver.quit(); >> close all tab 
        driver.close();   //>> close current tab
        
    }
}
