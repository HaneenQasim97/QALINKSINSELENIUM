import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINKS {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//1.
		System.out.println(driver.findElements(By.tagName(("a"))).size());
		//2.
		WebElement myfooter =driver.findElement(By.id("pageFooter"));
		System.out.println(myfooter.findElements(By.tagName(("a"))).size());
		//3.
		WebElement children  =driver.findElement(By.id("pageFooterChildren"));
		System.out.println(children.findElements(By.tagName(("a"))).size());
		//6.
		
		Set<String> mytabs = driver.getWindowHandles();
		Iterator<String> tabview = mytabs.iterator();
		while (tabview.hasNext()) {
			driver.switchTo().window(tabview.next());
			System.out.println(driver.getTitle());
			
			
		}
	}}
