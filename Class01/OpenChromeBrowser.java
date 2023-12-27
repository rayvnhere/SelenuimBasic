package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Print the Title and URL of browswer without looking at it

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
//instiating the instance of chrome driver
        WebDriver driver=new ChromeDriver();

//go to url 'get' means navigate
        driver.get("https://www.google.com");

//its recommended to maximize the screen of browswer
        driver.manage().window().maximize();

//get the title of the page
   //driver.getTitle();//this returns a STRING
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);

// getCurrentUrl gets the URL of the page
        String url = driver.getCurrentUrl();
        System.out.println("the url is "+url);

//to slow this opening and closing browser
// just for learning dont do this again

        Thread.sleep(2000);

//to close the browser window autimatically
        driver.quit();



/* maximize can see top bar and fullscreen shows all?


 */
    }
}
