class Ogrenci{
		private String isim,numara;
		private int birinciDersNotu,ikinciDersNotu;
		public Ders ders1,ders2;
		public static int ogrenciSayisi;

		public Ogrenci(){
			ogrenciSayisi++;
			ders1 = new Ders();
			ders2 = new Ders();
		}

		public Ogrenci(String isim, String numara, Ders ders1, Ders ders2){
			this.isim = isim;
			this.numara = numara;
			this.ders1 = ders1;
			this.ders2 = ders2;
			ogrenciSayisi++;
			System.out.println("Ogrenci olusturuldu: " + isim + " " + numara);
		}

		public void dersEkle(String dersKodu, String dersIsmi, int notu, int kredi){
			if(ders1.getDersKodu().equals("") ){
				ders1 = new Ders(dersKodu,dersIsmi,kredi);
				birinciDersNotu = notu;
			}
			else if(ders2.getDersKodu().equals("")){
				ders2 = new Ders(dersKodu,dersIsmi,kredi);
				ikinciDersNotu = notu;
			}
			else{
				System.out.println("Ogrenci icin iki ders de girilmistir. Ders silmeniz gerekmektedir.");
			}
		}

		public void dersSil(String dersKodu){
			if(ders1.getDersKodu().equals(dersKodu)){
				ders1.setDersKodu("");
				ders1.setDersIsmi("");
				ders1.setKredi(0);
				System.out.println("Ders1 silindi");
			}
			else if(ders2.getDersKodu().equals(dersKodu)){
				ders2.setDersKodu("");
				ders2.setDersIsmi("");
				ders2.setKredi(0);
				System.out.println("Ders2 silindi");
			}
			else{
				System.out.println("Ogrenci bu dersi almamaktadir: " + dersKodu);
			}
		}

		public void setIsim(String isim){
			this.isim = isim;
		}

		public String getIsim(){
			return isim;
		}

		public void setNumara(String numara){
			this.numara = numara;
		}

		public String getNumara(){
			return numara;
		}

		public void setBirinciDersNotu(int birinciDersNotu){
			this.birinciDersNotu = birinciDersNotu;
		}

		public int getBirinciDersNotu(){
			return birinciDersNotu;
		}

		public void setIkinciDersNotu(int ikinciDersNotu){
			this.ikinciDersNotu = ikinciDersNotu;
		}

		public int getIkinciDersNotu(){
			return ikinciDersNotu;
		}
}