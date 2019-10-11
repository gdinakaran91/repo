package com.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressespageObjects extends Basepage {
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement tshirts;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	WebElement prodlist;
	
	public WebElement tshirts() {
		return tshirts;
	}
	public WebElement prodlist() {
		return prodlist;
	}
	public DressespageObjects() {
		PageFactory.initElements(driver, this);
	}
}
