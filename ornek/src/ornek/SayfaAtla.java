package ornek;

public class SayfaAtla {
public void SonrakiSayfa(Sayfa sayfa) {
	sayfa.sayfaNo++;
	System.out.println("Sonraki Sayfaya Ge�tiniz");
}
public void OncekiSayfa(Sayfa sayfa) {
	sayfa.sayfaNo--;
	System.out.println("�nceki Sayfaya Ge�tiniz");
}
}
