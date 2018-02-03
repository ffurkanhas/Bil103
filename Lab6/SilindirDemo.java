class SilindirDemo{
	public static void main(String args[]){
		Silindir s1 = new Silindir();
		Silindir s2 = new Silindir();
		s1.tabanYaricap = 5;
		s1.yukseklik = 10;
		s2.tabanYaricap = 2;
		s2.yukseklik = 5;
		System.out.println("1. silindir tabanCevresi: " + s1.tabanCevresiHesapla());
		System.out.println("1. silindir yuzeyCevresi: " + s1.yuzeyCevresiHesapla());
		System.out.println("1. silindir yuzeyAlani  : " + s1.yuzeyAlaniHesapla());
		System.out.println("1. silindir tabanAlani  : " + s1.tabanAlaniHesapla());
		System.out.println("1. silindir hacim       : " + s1.hacimHesapla());
		System.out.println("-------------------------------------------------------");
		System.out.println("2. silindir tabanCevresi: " + s2.tabanCevresiHesapla());
		System.out.println("2. silindir yuzeyCevresi: " + s2.yuzeyCevresiHesapla());
		System.out.println("2. silindir yuzeyAlani  : " + s2.yuzeyAlaniHesapla());
		System.out.println("2. silindir tabanAlani  : " + s2.tabanAlaniHesapla());
		System.out.println("2. silindir hacim       : " + s2.hacimHesapla());
		System.out.println("**********************\n***Karsilastirmalar***\n**********************");
		System.out.println("Ayni silindirler mi? " + s1.ayniSilindirMi(s2));
		System.out.println("2. silindir, 1. silindirin icine sigar mi? " + s1.icineSigarMi(s2));
		System.out.println("1. silindirin taban cevresi 2. silindirden buyuk mu? " + s1.tabanCevresiKarsilastir(s2));
		System.out.println("1. silindirin hacmi 2. silindirden buyuk mu? " + s1.hacimKarsilastir(s2));
	}
}