package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    String baseUrl = "https://demo.nopcommerce.com";

    public static WebDriver driver;

    public void openBrowser( String baseUrl){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }

    public static void main(String[] args) {

        BaseTest open= new BaseTest();
        open.openBrowser(open.baseUrl);
        open.closeBrowser();



    }



}
