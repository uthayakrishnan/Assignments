package coreJava;
//Q42
public class StringOccurenceExample {
	
	public static void main(String[] args) {
		String str = "Hello how are you shyam?";
		//here print number of occurrences of 'o' character from str string
	    int indexOf = 0;
		int noOfOccurence = 0;
		 while (indexOf > -1)
		    {
		      indexOf = str.indexOf('o', indexOf + 1);
		     // System.out.println(indexOf);
		      if (indexOf > -1)
		    	  noOfOccurence++;
		    }
		System.out.println(noOfOccurence);
	}


}
