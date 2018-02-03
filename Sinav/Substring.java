class Substring{
	
	public String mySubstring(String word,int start,int finish){
		String substring = "";
		for(int i=start;i<finish;i++){
			substring += word.charAt(i);
		}
		return substring;
	}

	public String mySubstring(String word,int start){
		String substring = "";
		for(int i=start;i<word.length();i++){
			substring += word.charAt(i);
		}
		return substring;
	}
}