package com.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObjects extends Basepage {
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womens;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dresses;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement tshirts;
	@FindBy(xpath="//*[@id=\"category\"]")
	private WebElement shortsize;
	@FindBy(xpath="//*[@id=\"category\"]")
	WebElement mediumsize;
	@FindBy(xpath="//*[@id=\"category\"]")
	private WebElement largesize;
	@FindBy(xpath="//*[@id=\"newsletter-input\"]")
	private WebElement newsletter;
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	WebElement click;
	/*@FindBy(xpath="//*[@id=\"columns\"]/p")
	WebElement subscription;*/
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCart;
	
	
	public HomepageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement womens(){
		return womens;
	}
	
	public WebElement dresses() {
		return dresses;
	}
	public WebElement tshirts() {
		return tshirts;
	}
	public WebElement shortsize() {
		return shortsize;
	}
	public WebElement mediumsize() {
		return mediumsize;
	}
	public WebElement largesize() {
		return largesize;
	}
	public WebElement newsletter() {
		return newsletter;
	}
	public WebElement click() {
		return click;
	}
	/*public WebElement subscription() {
		return subscription;
	}*/
	public WebElement AddToCart() {
		return AddToCart;
	}

}
	