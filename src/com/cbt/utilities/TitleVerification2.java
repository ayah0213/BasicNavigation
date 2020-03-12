package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://www.westelm.com/");
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < urls.size(); i++) {
            String currentUrl = urls.get(i); // itialize the i
            driver.get(currentUrl);
            String title = driver.getTitle().toLowerCase().replaceAll(" ", "");
            // initialize the content and converted to Lower case, and deleted spaces of Title

            if (currentUrl.contains(title)){
                System.out.println("Test passed");
                System.out.println(currentUrl);
                System.out.println(title);
            }else{
                System.out.println("Test fail");
                System.out.println(currentUrl);
                System.out.println(title);
            }
        }
       driver.quit();


    }
}