package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_Navigate {
    public static void main(String[] args) {

//     Set Driver Path
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

//     Create chrome driver object
        WebDriver driver = new ChromeDriver();

//     Maximize the window
        driver.manage().window().minimize();

//     Open google home page https://www.google.com/
        driver.navigate().to("https://www.google.com/");


//     Navigate to techproeducation lms home page https://lms.techproeducation.com/login/index.php
//     Navigate back to google
//     Navigate forward to techproeducation
//     Refresh the page
//     Close/Quit the browser
//     And last step : print "ALL OK" on console

    }


}
