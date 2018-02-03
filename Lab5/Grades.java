import java.util.Scanner;
class Grades{
	public int a,b,c,d,e,f;
	public static Scanner kyb;
	public static void main(String args[]){
		kyb = new Scanner(System.in);
		Grades object = new Grades();
		object.readGrades();
		object.draw();

	}
	public void readGrades(){
		System.out.println("A alanlarin sayisi");
		a = kyb.nextInt();
		System.out.println("B alanlarin sayisi");
		b = kyb.nextInt();
		System.out.println("C alanlarin sayisi");
		c = kyb.nextInt();
		System.out.println("D alanlarin sayisi");
		d = kyb.nextInt();
		System.out.println("E alanlarin sayisi");
		e = kyb.nextInt();
		System.out.println("F alanlarin sayisi");
		f = kyb.nextInt();
	}
	public void setGradeA(int sayi){
		a = sayi;
	}
	public void setGradeB(int sayi){
		b = sayi;
	}
	public void setGradeC(int sayi){
		c = sayi;
	}
	public void setGradeD(int sayi){
		d = sayi;
	}
	public void setGradeE(int sayi){
		e = sayi;
	}
	public void setGradeF(int sayi){
		f = sayi;
	}
	public void totalNumberOfGrades(){
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		System.out.println("C:" + c);
		System.out.println("D:" + d);
		System.out.println("E:" + e);
		System.out.println("F:" + f);
	}
	public int percentageA(){
		return a / (a+b+c+d+e+f);
	}
	public int percentageB(){
		return b / (a+b+c+d+e+f);
	}
	public int percentageC(){
		return c / (a+b+c+d+e+f);
	}
	public int percentageD(){
		return d / (a+b+c+d+e+f);
	}
	public int percentageE(){
		return e / (a+b+c+d+e+f);
	}
	public int percentageF(){
		return f / (a+b+c+d+e+f);
	}
	public void writeGrades(){
		System.out.println("Not dagilimi:");
		System.out.println("A: " + percentageA());
		System.out.println("B: " + percentageB());
		System.out.println("C: " + percentageC());
		System.out.println("D: " + percentageD());
		System.out.println("E: " + percentageE());
		System.out.println("F: " + percentageF());
	}
	public void draw(){
		int count = 1;
		System.out.print("\n  ");
		for(int i=1;i<=100;i++){
			if(i%10==0){
				System.out.print(count++);
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.print("\n  ");
		for(int i=1;i<=100;i++){
			if(i%10==0){
				System.out.print("|");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.print("\n  ");
		for(int i=0;i<100;i++){
				System.out.print("*");
		}
		System.out.print("\nA:");
		for(int i=1;i<=a;i++){
			System.out.print("*");
		}
		System.out.print("\nB:");
		for(int i=1;i<=b;i++){
			System.out.print("*");
		}
		System.out.print("\nC:");
		for(int i=1;i<=c;i++){
			System.out.print("*");
		}
		System.out.print("\nD:");
		for(int i=1;i<=d;i++){
			System.out.print("*");
		}
		System.out.print("\nE:");
		for(int i=1;i<=e;i++){
			System.out.print("*");
		}
		System.out.print("\nF:");
		for(int i=1;i<=f;i++){
			System.out.print("*");
		}
		System.out.println();
	}
	public boolean equals(Grades grades){
		return (this.a == grades.a && this.b == grades.b && this.c == grades.c && this.d == grades.d && this.e == grades.e && this.f == grades.f);
	}

}