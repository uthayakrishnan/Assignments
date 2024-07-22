package coreJava;

public class StringReverse {
	
	//Q37
	public static String reverseString(String str){
		
		//reverse str string here and return
		
		int len = str.length();
		System.out.println(len);
		int i=0;
		String  stringReverse = "";
		for (i = len-1; i >= 0; i--){
	       
			stringReverse=stringReverse+ str.charAt(i);
	    }
		
		return stringReverse;
	}
	public static void main(String[] args) {
		String str = "Hello Welcome";
		String reversedString = reverseString(str);
		System.out.println(reversedString);
	}


}
