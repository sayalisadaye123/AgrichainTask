package Page11;


import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver ;
	public HomePage(WebDriver driver) {// constructor
		 this.driver= driver;///
		}
	
	public String getTitleOfPage() {
		
		String title = driver.getTitle();
		return title;
	}

}
