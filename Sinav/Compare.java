import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Compare {

	private static final String oegList = "/home/ffh/113Lab/Sinav/berk.txt";
	private static final String allList = "/home/ffh/113Lab/Sinav/berkKarsilastir.txt";
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		ArrayList<String> tumListe = new ArrayList<String>();
		ArrayList<String> oegListe = new ArrayList<String>();
		try {
			fr = new FileReader(allList);
			br = new BufferedReader(fr);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				tumListe.add(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		try {
			fr = new FileReader(oegList);
			br = new BufferedReader(fr);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				oegListe.add(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		String ogrenciAdi = "";
		int count = 1;
		for(int i=0;i<tumListe.size();i++){
				ogrenciAdi = tumListe.get(i).substring(19,tumListe.get(i).lastIndexOf(','));
				for(int j=0;j<oegListe.size();j++){
					String karsilastirilacak = oegListe.get(j).substring(13);
					String lower = karsilastirilacak.toLowerCase();
					if (lower.contains(ogrenciAdi.toLowerCase())) {
						System.out.println(count++ + ". " + ogrenciAdi + " " + tumListe.get(i).substring(tumListe.get(i).lastIndexOf(',')));
					}
				}
		}

	}

}