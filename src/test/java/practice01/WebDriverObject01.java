package practice01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverObject01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");


        WebDriver driver = new FirefoxDriver();
        driver.close();

        driver = new ChromeDriver();
        driver = new FirefoxDriver();

    }
}