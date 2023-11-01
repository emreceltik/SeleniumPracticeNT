package practice01;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverObject02 {
    public static void main(String[] args) {

        //WebDriverManager.firefoxdriver().setup();//Selenium 4.6 sonrası gerek yok.
        WebDriver driver = new FirefoxDriver();
        driver.close();
    }

}