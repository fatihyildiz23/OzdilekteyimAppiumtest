import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Check {
    FluentWait<MobileDriver> wait;
    Logger logger = LogManager.getLogger(OzdilekMethods.class);
    Boolean sonuc;
    MobileElement mobileElement;

    @Step("<xpath> Xpath kontrolu ile Alısveris Sayfasi Acildimi Kontrol et")
    public void check(String id) {


        OzdilekMethods methods = new OzdilekMethods();
        mobileElement = (MobileElement) OzdilekBaseTest.appiumDriver.findElement(By.xpath(id));


        Assert.assertEquals("alışveriş sayfasi başari ile acildi", "Anasayfa", mobileElement.getAttribute("content-desc"));
    }
    @Step("<xpath> Alışveris sayfası yüklenene kadar bekle")
    public boolean waitPageOpen(String id) {
        logger.info("");
        try {
            mobileElement = (MobileElement) OzdilekBaseTest.appiumDriver.findElement(By.xpath(id));
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            logger.info("True");
            System.out.println("Alışveriş sayfası yüklendi");
            return true;
        } catch (Exception e) {
            logger.info("False" + e.getMessage());
            return false;

        }}
    @Step("<xpath> Xpath kontrolu ile Kategoriler Sayfasi Acildimi Kontrol et")
    public void checkKategori(String id) {


        OzdilekMethods methods = new OzdilekMethods();
        mobileElement = (MobileElement) OzdilekBaseTest.appiumDriver.findElement(By.xpath(id));

        if (mobileElement.isDisplayed()) {
            Assert.assertEquals("", "Kategoriler", mobileElement.getAttribute("text"));
        } else {
            System.out.println("Kontrol edilen element Görünür olmadı");
        }

    }

    @Step("Urun Detay Safyası açıldımı kontrol et")
    public void checkUrunDetay() {

  mobileElement = (MobileElement) OzdilekBaseTest.appiumDriver.findElement(By.xpath("//*[@text='Renk:']"));
  Assert.assertEquals("Urun Katagorisi Başarı ile açıldı", "Renk:", mobileElement.getAttribute("text"));

 }


}
