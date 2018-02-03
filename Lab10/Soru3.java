class Soru3{

	public static void main(String args[]){
		Soru3 s = new Soru3();
		System.out.println("Recursive: " + s.fibRec(7));
		System.out.println("Iterative: " + s.fibFor(7));
	}

	public int fibRec(int n) {
        if (n <= 1) return n;
        else return fibRec(n-1) + fibRec(n-2);
    }

    public int fibFor(int n) {
		if(n <= 1){
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}
}