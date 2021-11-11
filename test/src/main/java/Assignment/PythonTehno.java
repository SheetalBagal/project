package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PythonTehno {
	public PythonTehno(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ul[@id='python_technologies']/li/a[text()='Artificial Intelligence with Python']")
	private WebElement python;
	
	
	@FindBy(xpath="//span[text()='Categories ']")
	private WebElement categories;
	
	
	@FindBy(xpath="//a[text()=' Big Data & Analytics ']")
	private WebElement Analytics;
	
	
	
	public WebElement getAnalytics() {
		return Analytics;
	}
	public void setAnalytics(WebElement analytics) {
		Analytics = analytics;
	}
	public WebElement getCategories() {
		return categories;
	}
	public void setCategories(WebElement categories) {
		this.categories = categories;
	}
	public WebElement getPython() {
		return python;
	}
	public void setPython(WebElement python) {
		this.python = python;
	}
	public void python() {
		python.click();
		}
	
	
	
	public void PythonTehno () {
		python.click();
		}
	
	
	public void categories() {
		categories.click();
	}
	
	public void Analytics() {
		Analytics.click();
	}
	
	
	
	
}
