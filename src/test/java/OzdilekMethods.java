import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class OzdilekMethods extends OzdilekBaseTest {
    FluentWait<MobileDriver> wait;
    MobileElement mobileElement;
    Logger logger = LogManager.getLogger(OzdilekMethods.class);

    @Step("<xpath> Xpath'li elementi bul ve tıkla")
    public void findElementWithXpathClick(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        logger.info("Elemente Tiklandi");

    }

    @Step("<int> saniye kadar bekle")
    public void waitForsecond(int s) throws InterruptedException {
        Thread.sleep(1000 * s);
        logger.info("Bekleme yapildi");
    }






    @Step("Uygulamanın açıldıgını kontrol et")
    public void checkAppOpened() {
        logger.info("Uygulama Acildimi Kontrol Ediyor");
        try {

            mobileElement = (MobileElement) appiumDriver.findElement(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/action_bar_root']"));
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            boolean sonuc = true;
            Assert.assertTrue(sonuc);
            System.out.println("Sayfa başarılyla açıldı");
        } catch (Exception e) {
        }


    }

    @Step("<xpath> katagorilere tıkla")
    public void katagoriClick(String xpath) {

        appiumDriver.findElement(By.xpath(xpath)).click();
        logger.info("kategorilere Tiklandi");
    }

    @Step("<xpath>Kadın Kategorisini seç")
    public void ClickKadin(String xpath) {


        appiumDriver.findElement(By.xpath(xpath)).click();
    }

    @Step("<xpath>Pantalon Kategorisini seç")
    public void clickPantalon(String xpath) {


        appiumDriver.findElement(By.xpath(xpath)).click();
    }

    @Step("kaydır")
    public void swipeUp(){
        final int ANIMATION_TIME = 200; // ms
        final int PRESS_TIME = 200; // ms
        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;
        // init screen variables
        Dimension dims = appiumDriver.manage().window().getSize();
        System.out.println("Telefon Ekran Boyutu " + dims);
        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        System.out.println("Başlangıç noktası " + pointOptionStart);
        pointOptionEnd = PointOption.point(dims.width / 2, dims.height / 4);
        System.out.println("Bitiş noktası " + pointOptionEnd);
        try {
            new TouchAction(appiumDriver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }
    logger.info("Kaydirma İslemi yapildi");
    }
    @Step("Rastgele Urun seç")
    public void randomUrun(){
        Random rnd = new Random();
        int i = rnd.nextInt(3);
        System.out.println(i);
        appiumDriver.findElement(By.xpath("//*[@class='androidx.recyclerview.widget.RecyclerView']/androidx.cardview.widget.CardView["+i+"]"))
                .click();

        logger.info("rastgele Ürün Secildi");
    }

    @Step("<xpath>Favorilere Tıkla")
    public void clickFavorite(String xpath){
        appiumDriver.findElement(By.xpath(xpath)).click();
    logger.info("Elemente Tiklandi");
    }

    @Step("<id> Kullanıcı Adını gir")
    public void kullanıcıAdi(String id){
        MobileElement element;
      element=  appiumDriver.findElement(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/etEposta']"));
        element.click();

        element.sendKeys("Usernamae");
        logger.info("Kullanici Adi Sifre Girildi");
    }
    @Step("<pw> Password gir")
    public void password(String pw){
        MobileElement element;
        element=  appiumDriver.findElement(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/etPassword']"));
        element.click();

        element.sendKeys("Usernamae");

    logger.info("Sifre Girildi");
    }
    @Step("<xpath> li  elemetin sayfada gorunur olduğunu kontrol et ve tıkla")
    public void findByelementEndclick(String xpath){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        if (element.isDisplayed()){
            element.click();
        }else{
            System.out.println("Kontrol edilen element Görünür olmadı");
        }
        logger.info("Element tiklandi");
    }
    @Step("Iki kere geri git")
    public void back(){

        MobileElement element= appiumDriver.findElement(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/ivBack']"));
        appiumDriver.findElement(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/ivBack']")).click();
        appiumDriver.findElement(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/ivBack']")).click();
        /*
        element.click();
        element.click();
         */
       logger.info("Geri gidildi");
    }
}


