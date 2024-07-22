package coreJava;
//Q43
public class StringLength {
	
	public static int calculateLength(String str){
		//calculate length here and don't use length function of string class
		int stringLength = str.lastIndexOf("");
		return stringLength;
			}
			public static void main(String[] args) {
				String str1 = "Hello how are you shyam?";
				String str ="";
				int len = calculateLength(str);
				System.out.println(len);
			}
			
}


