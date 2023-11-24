import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://alfardanexchange.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		//js.executeScript("window.scrollBy(20,document.body.scrollHeight)");
	    WebElement a = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/ul[2]/li[10]/a"));
	    int x=a.getLocation().x;
		for (int i=0; i<=x;i++)
	{
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
	/*	js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000); */

	//	Thread.sleep(10000);
		
	}
	// drag downwards
		/*Actions dragger = new Actions(driver);
		WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/ul[2]/li[10]/a"));
		
		int numberOfPixelsToDragTheScrollbarDown = 10;
		for (int i = 10; i < 500; i += numberOfPixelsToDragTheScrollbarDown) {
		    try {
		        // this causes a gradual drag of the scroll bar, 10 units at a time
		        dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release().perform();
		        Thread.sleep(1000);
		    } catch(Exception e1) {}
		} */
		driver.close();
	}

}
