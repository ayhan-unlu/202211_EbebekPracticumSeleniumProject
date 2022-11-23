import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ebebekSeleniumTestHomework {
    public static void main(String[] args) throws Exception {

        String baseUrl = "https://www.e-bebek.com";
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location
        WebDriver driver = new ChromeDriver();//for driver initilisation or creating a driver object in java
        driver.get(baseUrl);//to indicate where you want to go https:// must be included

        // source : https://www.youtube.com/watch?v=sxmwGdZbV-Y&t=3s


        //System.out.println(driver.getTitle());//for printing website title


        driver.manage().window().minimize();//maximize the window
        Thread.sleep(1000);//waits for 1 second to go to next line of code

        driver.findElement(By.id("txtSearchBox")).sendKeys("biberon",Keys.ENTER);

        Thread.sleep(1000);//waits for 1 second to go to next line of code


        driver.findElement(By.xpath("body > app-root > cx-storefront > main > cx-page-layout > cx-page-slot.SearchResultsListSlot.has-components > eb-product-list > div > section > div.container.p-0 > div > div > div.cx-product-container.row > eb-product-scroll > div > div > eb-product-list-item:nth-child(1) > div > eb-generic-link > a")).click();

        //body/app-root[1]/cx-storefront[1]/main[1]/cx-page-layout[1]/cx-page-slot[3]/eb-product-list[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/eb-product-scroll[1]/div[1]/div[1]/eb-product-list-item[1]/div[1]/eb-generic-link[1]/a[1]/figure[1]/cx-media[1]/img[1]

        Thread.sleep(10000);//waits for 1 second to go to next line of code

       

       // Thread.sleep(10000);//waits for 1 second to go to next line of code

       // driver.get("https://www.e-bebek.com");//to indicate where you want to go https:// must be included

        System.out.println(driver.getTitle());//for printing website title
        Thread.sleep(10000);//waits for 1 second to go to next line of code
     //   driver.quit();//for leaving the website
        

    }
}
