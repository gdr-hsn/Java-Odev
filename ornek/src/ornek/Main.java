package ornek;

public class Main {

	public static void main(String[] args) {
	KursProgramAsama kursProgramAsama1=new KursProgramAsama(
			"Degi�kenler,D�ng�ler",
			true,
			"De�i�ken Tiplerini Ara�t�r�n�z",
			"Ders �ok Ba�ar�l�yd�");
	KursProgramAsama[] kursProgramAsamalar= {kursProgramAsama1};
	for(KursProgramAsama kursProgramAsama:kursProgramAsamalar) {
		System.out.println(
				kursProgramAsama.dersProgram+
				kursProgramAsama.kay�t+
				kursProgramAsama.odev+
				kursProgramAsama.degerlendirme);
		
		
	}
	
	Kurs kurs1=new Kurs(
			1,
			"Java Kursu",
			"E-ticaret backend yaz�l�mlar� i�in java e�itimleri",
			50
			);
	Kurs[] kurslar= {kurs1};
	for(Kurs kurs:kurslar) {
		System.out.println(
				kurs.id+
				kurs.ad+
				kurs.detay+
				kurs.tamamlanmaOrani
				);
				
	}
		Sayfa sayfa1=new Sayfa(12);
		Sayfa[] sayfalar= {sayfa1};
		for(Sayfa sayfa:sayfalar) {
			System.out.println(sayfa.sayfaNo);
		
		}
		SayfaAtla sayfaAtla=new SayfaAtla();
		//sayfaAtla.OncekiSayfa(sayfa1);
		sayfaAtla.SonrakiSayfa(sayfa1);
		System.out.println(sayfa1.sayfaNo);
		
	}
	

}
