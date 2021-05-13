package ornek;

public class Main {

	public static void main(String[] args) {
	KursProgramAsama kursProgramAsama1=new KursProgramAsama(
			"Degiþkenler,Döngüler",
			true,
			"Deðiþken Tiplerini Araþtýrýnýz",
			"Ders Çok Baþarýlýydý");
	KursProgramAsama[] kursProgramAsamalar= {kursProgramAsama1};
	for(KursProgramAsama kursProgramAsama:kursProgramAsamalar) {
		System.out.println(
				kursProgramAsama.dersProgram+
				kursProgramAsama.kayýt+
				kursProgramAsama.odev+
				kursProgramAsama.degerlendirme);
		
		
	}
	
	Kurs kurs1=new Kurs(
			1,
			"Java Kursu",
			"E-ticaret backend yazýlýmlarý için java eðitimleri",
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
