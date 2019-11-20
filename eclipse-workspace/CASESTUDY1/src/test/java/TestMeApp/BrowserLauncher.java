package TestMeApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLauncher {
static WebDriver driver;
public static WebDriver utility (String name) {
if (name.equals("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream NEW\\Chrome Driver\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
return driver;
}
else if (name.equals("explorer")) {
System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream NEW\\InternetExplorer driver\\IEDriverServer.exe");
driver= new InternetExplorerDriver();
driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
return driver;
}
return null;
}

}