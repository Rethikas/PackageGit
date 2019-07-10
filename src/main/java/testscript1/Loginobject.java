package testscript1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginobject extends BasePage {

	@FindBy(xpath = "//div/ul/li[1]/a[text()='Women']")
	private WebElement WomenName;

	@FindBy(xpath = "//div/ul/li[2]/a[text()='Dresses']")
	private WebElement DressName;

	@FindBy(xpath = "//div/ul/li[3]/a[text()='T-shirts']")
	private WebElement TshirtName;
	
	@FindBy(id="newsletter-input")
    private WebElement mailid;
	
	@FindBy(name="submitNewsletter")
    private WebElement sendemail;
	
	@FindBy(xpath="//*[@class='columns-container']//p[@class='alert alert-success']")
	private WebElement newsletter;
	
	@FindBy(className="sf-with-ul")
    private WebElement TopsName;
	
	@FindBy(xpath="//label/a[contains(@href,'category#size-s')]")
	private WebElement SmallSize;
	
	@FindBy(xpath="//label/a[contains(@href,'category#size-m')]")
	private WebElement MediumSize;
	
	@FindBy(xpath="//label/a[contains(@href,'category#size-l')]")
	private WebElement LargeSize;
	
	
	public Loginobject() {

		PageFactory.initElements(driver, this);
	
	}

	public WebElement getWomenNameFromPanel() {
		
		return WomenName;
	}

	public WebElement getDressNameFromPanel() {
		
		return DressName;
	}

	public WebElement getTshirtNameFromPanel() {
		
		return TshirtName;
	}
	
	public WebElement getWomNameNaviagtion(){
		
		TopsName.click();
		return TopsName;
	}
	public WebElement getDressNameNaviagtion(){
		
		return DressName;
	}
	public WebElement getTshirtNameNaviagtion(){
		
		return TshirtName;
	}
	
	public WebElement getSmallSize() {
		
		return SmallSize;
		
	}
	public WebElement getMediumSize() {
		
		return MediumSize;
		
	}
	public WebElement getLargeSize() {
		
		return LargeSize;
		
	}
	 public void getsubscription() {
		 
		 int random=new Random().nextInt(500000);
		 System.out.println(random);
		 setText(mailid,"Automation" + random +"@gmail.com");
		 sendemail.click();
	 }
	 
	 public String getSubscriptionMessage() {
	 return newsletter.getText();
	 }
}
