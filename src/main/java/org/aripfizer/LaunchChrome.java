package org.aripfizer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchChrome {
    public static AndroidDriver<AndroidElement> capabilities () throws MalformedURLException {
        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "06504371BG101509");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        driver = new AndroidDriver<>( new URL("http://127.0.0.1:4723"), cap);

        return driver;


    }
}