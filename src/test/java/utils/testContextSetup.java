//This class is the Dependency injection class which is the center of all classes 
//through only this class step definitions class can access all menthods and property of any class
//as all other classesa are initialize in this class already through constructor


package utils;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageObjects.pageObjectManager;

public class testContextSetup {
	
	public String landingpageProductname;
	public String offerpageProductname;
	public String checkOutPageProductname;
	public WebDriver driver;
    public testBase testbase;
    public pageObjectManager pageobjectmanager;
    public genericUtils genericutils;
 // to call testbase methods and properties through its object in constructor as constructor runs first nd stores all object instances
    public testContextSetup() throws IOException
    {
    	testbase= new testBase();
    	pageobjectmanager = new pageObjectManager(testbase.WebDriverManager());
    	genericutils=new genericUtils(testbase.WebDriverManager());	
    
    }
    }
