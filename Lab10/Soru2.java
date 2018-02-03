class Soru2{

	public static void main(String args[]){
		Soru2 s = new Soru2();
		s.counter(1,20,"DESC");
	}


	public void counter(int min, int max, String sortBy){

		if(min > max){
			return;
		}
		if(sortBy.equals("ASC")){
			System.out.println(min);
			counter(min+1,max,sortBy);
		}
		if(sortBy.equals("DESC")){
			System.out.println(max);
			counter(min,max-1,sortBy);
		}

	}
}