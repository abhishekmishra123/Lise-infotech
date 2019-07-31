import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    WebDriver driver;
    public static void main(String args[])
    {
        WebDriver driver;
        System.out.println("This is opening browser");
        //System.setProperty("webdriver.gecko.driver", "/Users/machd/Downloads/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/machd/Downloads/chromedriver");
        //driver= new FirefoxDriver();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.liseinfotech.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            driver.findElement(By.cssSelector("input.form-control.contact-first-name")).sendKeys("TestUser");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("input.form-control.contact-phone")).sendKeys("8878983278");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("input.form-control.contact-email")).sendKeys("TestUser@mailinator.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("textarea.form-control.contact-message")).sendKeys("TestUser12345");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("button.button.subscription-button.px-5.py-2")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

//    @Test() //2
//    public void googleTitle() {
//        String  title =driver.getTitle();
//        System.out.println(title);
//    }

//    @Test()
//    public void googleLogo() {
//        boolean b=	driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
//
//    }

//    @Test
//    public void mailinkTest() {
//        boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
//        driver.quit();
//    }

}
