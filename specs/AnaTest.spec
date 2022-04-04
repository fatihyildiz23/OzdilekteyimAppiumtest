Specification Heading
=====================

Get Started
----------------
# Alisverise Basla
*"3" saniye kadar bekle
*Uygulamanın açıldıgını kontrol et
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/tv_startShoppingStore']" Xpath'li elementi bul ve tıkla
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayStore']" Alışveris sayfası yüklenene kadar bekle
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_home']" Xpath kontrolu ile Alısveris Sayfasi Acildimi Kontrol et
# Kategorileri Sec

//*"*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_categories']" katagorilere tıkla
*"//*[@text='Kategoriler']" li  elemetin sayfada gorunur olduğunu kontrol et ve tıkla
*"//*[@text='Kategoriler']" Xpath kontrolu ile Kategoriler Sayfasi Acildimi Kontrol et
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/recyclerCategories']/android.widget.RelativeLayout[2]" li  elemetin sayfada gorunur olduğunu kontrol et ve tıkla
//*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/recyclerCategories']/android.widget.RelativeLayout[2]"Kadın Katagorisini seç
# Urun Secme
*"//*[@class='androidx.recyclerview.widget.RecyclerView']/android.widget.RelativeLayout[14]" Xpath'li elementi bul ve tıkla
*"1" saniye kadar bekle
*kaydır
*kaydır
*Rastgele Urun seç
*"1" saniye kadar bekle
# Favorilere Ekle
*Urun Detay Safyası açıldımı kontrol et

*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayAddFav']"Favorilere Tıkla
*"1" saniye kadar bekle

# Kullanıcı Adı ve Sifre gir
*"Username" Kullanıcı Adını gir
*"passsword" Password gir
*Iki kere geri git

# Rastgele Urun Sec ve Sepete Ekle
*Rastgele Urun seç
*"1" saniye kadar bekle
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayAddCartBtn']" Xpath'li elementi bul ve tıkla
*"5" saniye kadar bekle