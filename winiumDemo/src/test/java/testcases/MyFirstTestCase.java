package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MyFirstTestCase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesktopOptions opt = new DesktopOptions();
		opt.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), opt);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("num7Button")).click();
		driver.findElement(By.id("plusButton")).click();
		driver.findElement(By.id("num3Button")).click();
		driver.findElement(By.id("equalButton")).click();
		
		Thread.sleep(1000);
		
		String resultado = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		System.out.println("O resultado é: "+resultado);
	}

}
