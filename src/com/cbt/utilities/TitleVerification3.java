package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://www.westelm.com/");


        for (int i = 0; i < urls.size(); i++) {
            WebDriverManager.chromedriver().version("79").setup();
            WebDriver driver = new ChromeDriver();
            String currentUrl = urls.get(i); // itialize the i
            driver.get(currentUrl);
            String title = driver.getTitle().toLowerCase().replaceAll(" ", "");
            // initialize the content and converted to Lower case, and deleted spaces of Title

            if (currentUrl.contains(title)) {
                System.out.println("Test passed");
                System.out.println(currentUrl);
                System.out.println(title);
            } else {
                System.out.println("Test fail");
                System.out.println(currentUrl);
                System.out.println(title);
            }
                driver.quit();

        }




    }
}