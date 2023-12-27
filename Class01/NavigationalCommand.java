package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//First go to Google and then Facebook opens up and back to Google, again to facebook
public class NavigationalCommand {
    public static void main(String[] args) throws InterruptedException {

        //insitate the webDriver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // goto google.com
        driver.get("https://www.google.com");

        //jumping to facebook
        driver.navigate().to("https://www.fb.com");

        //this method is like pressing the back button
        driver.navigate().back();

        //this method is like pressing the forward button
        driver.navigate().forward();

        //to observe chrome opening and closing in slowmo
        Thread.sleep(2000);

        //refresh method
        driver.navigate().refresh();

        driver.close();
    }
        }

/*WebDriver has functions i.e. get,quit,getCurrentTitle


get and navigate are same


        */




