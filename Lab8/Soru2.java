import java.util.Scanner;

class Soru2{
	public static void main(String args[]){
		int size;
		Scanner kyb = new Scanner(System.in);
		System.out.println("Bir tek tamsayi giriniz");
		size = kyb.nextInt();
		while(size % 2 == 0){
			System.out.println("Bir tek tamsayi giriniz");
			size = kyb.nextInt();
		} 
		char[][] dizi = new char[size][size];

		for(int i=0;i<size;i++){
       		for(int j=0;j<size;j++)
       			dizi[i][j] = ' ';
       	}

        for (int i = 0; i < size; i++) {
        	dizi[i][0] = '*';
        	for(int j=0;j < size; j++){
        		if(i == j)
        			dizi[i][j] = '*';
        		if(i+j == size-1)
        			dizi[i][j] = '*';
        	}
        	dizi[i][size-1] = '*';
       	}
       	for(int i=0;i<size;i++){
       		for(int j=0;j<size;j++)
       			System.out.print(dizi[i][j]);
       		System.out.println("");
       	}
	}
}