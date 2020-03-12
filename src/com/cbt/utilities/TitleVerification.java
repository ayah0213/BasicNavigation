package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("http://practice.cybertekschool.com/login");
       String title3 =  driver.getTitle();
       Thread.sleep(2000);
        driver.quit();





    }
}
