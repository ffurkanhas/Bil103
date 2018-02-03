class Demo{
	public static void main(String args[]){
		Ogrenci deneme = new Ogrenci();
		deneme.setIsim("asd");
		deneme.setNumara("141101045");
		deneme.dersEkle("Ders1","ders1111",100,4);
		Ders bil103 = new Ders("Bil103", "Bilgisayar Bilimlerine Giris", 2);
		Ders bil113 = new Ders("Bil113", "Bilgisayar Programlama I", 4);
		Ogrenci ffh = new Ogrenci("Fatih Furkan HAS", "141101024", bil103, bil113);
		ffh.setBirinciDersNotu(90);
		ffh.setIkinciDersNotu(100);
		Ogrenci eda = new Ogrenci("Eda Balaban", "141101071", bil103,bil113);
		eda.setBirinciDersNotu(10);
		eda.setIkinciDersNotu(20);
		System.out.println(ffh.getNumara() + " numarali ogrenci " + ffh.getIsim() + "'in ortalamasi " + ortalamaHesapla(ffh) );
		System.out.println(eda.getNumara() + " numarali ogrenci " + eda.getIsim() + "'in ortalamasi " + ortalamaHesapla(eda.ders1,eda.getBirinciDersNotu(),eda.ders2,eda.getIkinciDersNotu()));
		System.out.println(ffh.getIsim() + "'in aldigi dersler: " + ffh.ders1.getDersIsmi() + ", " + ffh.ders2.getDersIsmi());
		ffh.dersSil("Bil113");
		System.out.println(ffh.getIsim() + "'in aldigi dersler: " + ffh.ders1.getDersIsmi() + ", " + ffh.ders2.getDersIsmi());
		System.out.println("Toplam ogrenci sayisi: " + Ogrenci.ogrenciSayisi);
	}

	public static double ortalamaHesapla(Ogrenci ogrenci){
		return  ( ogrenci.getBirinciDersNotu() * ogrenci.ders1.getKredi() + ogrenci.getIkinciDersNotu() * ogrenci.ders2.getKredi() ) 
		         / ( ogrenci.ders1.getKredi() + ogrenci.ders2.getKredi() );
	}

	public static double ortalamaHesapla(Ders ders1, int ders1Notu, Ders ders2, int ders2Notu){
		return ( ders1Notu * ders1.getKredi() + ders2Notu * ders2.getKredi()) / ( ders1.getKredi() + ders2.getKredi());
	}

}