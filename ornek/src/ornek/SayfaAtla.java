package ornek;

public class SayfaAtla {
public void SonrakiSayfa(Sayfa sayfa) {
	sayfa.sayfaNo++;
	System.out.println("Sonraki Sayfaya Geçtiniz");
}
public void OncekiSayfa(Sayfa sayfa) {
	sayfa.sayfaNo--;
	System.out.println("Önceki Sayfaya Geçtiniz");
}
}
