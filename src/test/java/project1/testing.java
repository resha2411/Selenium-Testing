package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing  {
   WebDriver driver=null; 
	  
  @BeforeTest
  public void beforeTest()throws Throwable {
	  
	  //Driver 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\reet\\eclipse-workspace\\project1\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.thesparksfoundationsingapore.org/");
	  driver.manage().window().maximize();
	  
	  //Logo and Verify Title
	  WebElement logo=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));
	  Assert.assertTrue(logo.isDisplayed());
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("The Sparks Foundation | Home", title);
	  WebElement verifylogo = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));
	  Assert.assertTrue(verifylogo.isDisplayed(),"Home Page Logo not displayed");
	  System.out.println(logo);
	  
	  //contact us page
	  WebElement contact=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a"));
	  contact.click();
	  Thread.sleep(3000);
	  
	  String header=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
      Assert.assertEquals("Contact Us", header);
      System.out.println(header);
      
      //join us page
      WebElement joinus=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/a"));
      joinus.click();
      Thread.sleep(3000);
      WebElement why=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/ul/li[1]/a\n"));
      why.click();
      Thread.sleep(3000);
      String span=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/h3/span")).getText();
      Assert.assertEquals("Be Your Own Boss", span);
      System.out.println(span);
  
      //links page details
      WebElement links=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a"));
      links.click();
      Thread.sleep(3000);
      WebElement AI=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/ul/li[3]/a"));
      AI.click();
      Thread.sleep(3000);
      WebElement nextlink=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/a"));
      nextlink.click();
      Thread.sleep(3000);
      String MainWindow1=driver.getWindowHandle();

 
//  String link5=driver.findElement(By.xpath("/html/head/title")).getText();
//  Assert.assertEquals("Can AI fix education? We asked Bill Gates - The Verge", link5);
     driver.switchTo().window(MainWindow1);
     System.out.println(MainWindow1);
     
     //Programs page details
     WebElement program=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a"));
     program.click();
     Thread.sleep(3000);
     WebElement workshop=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[4]/a"));
     workshop.click();
     Thread.sleep(3000);
     WebElement student=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[1]/a"));
     student.click();
     Thread.sleep(3000);
     String studentscholar=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
     Assert.assertEquals("Student Scholarship Program",studentscholar );
     System.out.println(studentscholar);

     ////AboutUs Page
     WebElement ClickOnAboutUsPage =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/a"));
     ClickOnAboutUsPage.click();
     Thread.sleep(3000);
     WebElement ClickOnExeutiveAboutUsDropdown =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[4]/a"));
     ClickOnExeutiveAboutUsDropdown.click();
     Thread.sleep(3000);
     String ExecutiveTeamHeader =  driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
     Assert.assertEquals("Executive Team", ExecutiveTeamHeader);
     System.out.println(ExecutiveTeamHeader);
  
     String FounderName =  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/h4")).getText();
     Assert.assertEquals("Priyesh Kumar", FounderName);
     System.out.println(FounderName);
	  
  
     WebElement FounderDescription =  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/p"));
     Assert.assertTrue(FounderDescription.isDisplayed());
     WebElement FounderPicture =  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/a/img"));
     if(FounderPicture.isDisplayed())
     {
	  FounderPicture.click();
	  Thread.sleep(3000);
	  String title1 = driver.getTitle();
	  String MainWindow2=driver.getWindowHandle();
	  driver.switchTo().window(MainWindow2);
	 // Assert.assertEquals(false, false)
	  System.out.println(title1);
      }
     else
      {
	  System.out.println("Founder Picture not dislayed");
      }
     
     //policy page
     WebElement policy=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a"));
     policy.click();
     Thread.sleep(3000);
     WebElement ethics=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/ul/li[2]/a\n"));
     ethics.click();
     Thread.sleep(3000);
     String heading=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
	 Assert.assertEquals("Code Of Ethics And Conduct", heading);
	 System.out.println(heading);
	 driver.close();
  }
  
}
