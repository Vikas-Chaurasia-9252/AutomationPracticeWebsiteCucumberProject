package applicationHooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks {
	private ConfigReader cread;
	private WebDriver driver;
	private Properties prop;
	private DriverFactory driverFactory;
	
	@Before(order = 0)
	public void getProp() {
		cread = new ConfigReader();
		prop = new Properties();
		prop = cread.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		System.out.println("I am in hook before1 before");
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		System.out.println("I am in hook before1");
	}
	
	
	@After(order=0)
	public void teardown() {
		  if (driver != null) {
        driver.quit();
    }
	}
	
	@After(order=1)
	public void takeScreenshot(Scenario sc) {
		
		if(sc.isFailed()) {
			String fileName = sc.getName().replaceAll(" ", "_");
			 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Build destination path
        String screenshotDir = System.getProperty("user.dir") + "/target/ExtentReports/screenshots/";
        File dest = new File(screenshotDir + fileName + ".png");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/png", fileName);
			System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
		}
		
	}
		

}
