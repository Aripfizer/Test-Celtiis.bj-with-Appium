package org.aripfizer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;


public class Launch extends  LaunchChrome{
    public static <e> void main() throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement>  driver = capabilities();
        driver.get("https://celtiis.bj/");
        Thread.sleep(5000);
         WebElement acceptButton =  driver.findElementByXPath("//*[@id=\"__next\"]/div[1]/div/div/div[3]/button[3]");
        acceptButton.click();
        Thread.sleep(5000);

        WebElement searchButton = driver.findElementByXPath("//*[@id=\"celtiis-header-search\"]");
        searchButton.click();
        Thread.sleep(5000);

        WebElement searchInput = driver.findElementByXPath("/html/body/div/div[3]/div[1]/div/div/div[2]/div/div/div/input");
        searchInput.sendKeys("celtiis");
        Thread.sleep(9000);
        driver.quit();
    }
}