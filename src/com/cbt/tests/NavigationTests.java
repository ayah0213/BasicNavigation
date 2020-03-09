package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {
        Chrome();
        fireFox();
        Edge();

    }

    public static void Chrome() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title1 = driver.getTitle();
        Thread.sleep(3000);
        driver.navigate().back();
        String title2 = driver.getTitle();

        StringUtility.verifyEquals(title, title2);
        driver.navigate().forward();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title1, title3);

        driver.quit();
    }

    public static void fireFox() throws InterruptedException {
        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("firefox");
        //2.Go to website https://google.com
        driver.get("http://google.com");
        //3. Save the title in a string variable
        String title = driver.getTitle();
        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");
        //5. Save the title in a string variable
        String title1 = driver.getTitle();
        Thread.sleep(3000);
        //6. Navigate back to previous page
        driver.navigate().back();
        //7. Verify that title is same is in step 3
        String title2 = driver.getTitle();
        StringUtility.verifyEquals(title2,title);
        //8. Navigate forward to previous page
        driver.navigate().forward();
        //9. Verify that title is same is in step 5
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title3,title1);

        driver.quit();

    }
    public static void Edge(){

        //1. Open browser
        WebDriver driver= BrowserFactory.getDriver("Edge");

       // 2.Go to website https://google.com
        driver.get("https://google.com");

        //3. Save the title in a string variable
        String title = driver.getTitle();

       // 4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the title in a string variable
        String title1= driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();
        String title2 = driver.getTitle();

        //7. Verify that title is same is in step 3
        StringUtility.verifyEquals(title2,title);

        //8. Navigate forward to previous page
        driver.navigate().forward();
        String title3=driver.getTitle();

        //9. Verify that title is same is in step 5
        StringUtility.verifyEquals(title3, title1);

        driver.quit();

    }
}
