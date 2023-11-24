import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UAT {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		/*driver.get("http://172.19.199.46:6789/app/uatonline/f?p=4550:1:781271743391001\r\n");
		driver.findElement(By.xpath("//*[@id=\"F4550_P1_COMPANY\"]")).sendKeys("afex");
		driver.findElement(By.xpath("//*[@id=\"F4550_P1_USERNAME\"]")).sendKeys("yash");
		driver.findElement(By.xpath("//*[@id=\"F4550_P1_PASSWORD\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"P1_LOGIN\"]")).click();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.xpath("//*[@id=\"R30606315059404549\"]/div[2]/div/div/table/tbody/tr/td[1]/a/span[1]/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.findElement(By.xpath("//*[@id=\"3519715528105919\"]/tbody/tr/td[1]/a/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.xpath("//*[@id=\"R74808517252457688\"]/div[2]/div/div[1]/div/div/table/tbody/tr/td[1]/a/span[1]/img")).click();
		*/
		driver.get("http://172.19.199.46:6789/app/uatonline/f?p=105:101:443464736449301");
		
		Thread.sleep(10000);
		
		driver.close();
	
	}
}
