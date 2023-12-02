package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyComputersTab() {


        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

    }

    @Test
    public void verifyElectronicsTab() {

        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a")).click();
    }

    @Test
    public void verifyApparelTab() {
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]/a")).click();

    }

    @Test
    public void verifyDigitalDownloadsTab() {
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]/a")).click();


    }

    @Test
    public void verifyBooksTab() {
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).click();

    }

    @Test
    public void verifyJewelryTab() {
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]/a")).click();

    }

        @Test
        public void verifyGiftCardsTab() {
            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]/a")).click();
        }

}



