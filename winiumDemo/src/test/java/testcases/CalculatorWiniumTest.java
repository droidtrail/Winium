package testcases;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class CalculatorWiniumTest {
	
	static WiniumDriver driver = null;
	static WiniumDriverService service = null;
	static DesktopOptions options = null;
	
	@BeforeClass
	public static void setUpEnviroment() throws IOException {
		options = new DesktopOptions();
		options.setApplicationPath("c:\\Windows\\System32\\calc.exe");
		File driverPath = new File ("e:\\Winium\\Winium.Desktop.Driver.exe");
		service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath)
				.usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();	
	}
	@Before
	public void startDriver(){
		
		driver = new WiniumDriver(service,options);	
		
	}
	
	@Test
	public void selectScientificViewAddNumbersTest() {
		driver.findElement(By.id("TogglePaneButton")).click();
	}
}
