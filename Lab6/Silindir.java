class Silindir{
	public double tabanYaricap,yukseklik;
	public static double pi = Math.PI;

	public double tabanCevresiHesapla(){
		return 2*tabanYaricap*pi;
	}
	public double yuzeyCevresiHesapla(){
		return (2 * tabanCevresiHesapla()) + (2 * yukseklik);
	}
	public double tabanAlaniHesapla(){
		return pi * tabanYaricap * tabanYaricap;
	}
	public double yuzeyAlaniHesapla(){
		return tabanCevresiHesapla() * yukseklik;
	}
	public double hacimHesapla(){
		return tabanAlaniHesapla() * yukseklik;
	}
	public boolean ayniSilindirMi(Silindir s2){
		return (s2.tabanYaricap == this.tabanYaricap && s2.yukseklik == this.yukseklik );
	}
	public boolean icineSigarMi(Silindir s2){
		return (this.hacimHesapla() > s2.hacimHesapla() && this.tabanYaricap > s2.tabanYaricap && this.yukseklik > s2.yukseklik);
	}
	public boolean tabanCevresiKarsilastir(Silindir s2){
		return (this.tabanCevresiHesapla() > s2.tabanCevresiHesapla());
	}
	public boolean hacimKarsilastir(Silindir s2){
		return (this.hacimHesapla() > s2.hacimHesapla());
	}
}