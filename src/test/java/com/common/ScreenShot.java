package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
public static void ss(WebDriver driver,String sc) throws Throwable {
TakesScreenshot sht=(TakesScreenshot)driver;
File fl=sht.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(fl, new File(sc+".png"));
}
}
