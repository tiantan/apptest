package Test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import susetest.page;

public class quizTestt extends page {

    /**
     *  点击显示上一条
     * @throws InterruptedException
     */
    @Test
    public void PreQuestion() throws InterruptedException{
        WebElement element =((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.messaging:id/start_new_conversation_button\")");
        element.click();
         //driver.findElementById("com.android.messaging:id/start_new_conversation_button").click();//点击下一个按钮
        Thread.sleep(2000);
        driver.findElementById("com.android.messaging:id/recipient_text_view").sendKeys("12323");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@class='android.widget.TextView' and @index='1']" ).click();
        //  String tips = driver.findElementById("com.example.quizactivity:id/question_text_view").getText();
        //  Assert.assertEquals(tips, "The Suez Canal connects the Red Sea and the Indian Ocean.");
        Thread.sleep(2000);
      //  String uiautomatorExpress="new UiSelector().textContains(\""+text+"\")";
      //  ((AndroidDriver) driver).findElementByAndroidUIAutomator("test");
    }


    @Test
     public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test");
        Reporter.log("testestet");
     }
}
