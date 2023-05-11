package lt.marius.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static void setDriver() {

        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.7");
//        options.addArguments("--headless=new");

        drivers.set(new ChromeDriver(options));
        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static WebDriver getDriver() {
        return drivers.get();
    }

    public static void closeDriver() {
        drivers.get().quit();
        drivers.remove();
    }

}
