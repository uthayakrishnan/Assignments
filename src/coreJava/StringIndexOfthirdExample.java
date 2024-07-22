package coreJava;
//Q41
public class StringIndexOfthirdExample {
	
	public static void main(String[] args) {
		String str = "Hello how are you shyam?";
		//here print the index of third occurrence 'o' character from str string
		int firstOccurence = str.indexOf('o');
		int secondOccurence = str.indexOf('o', firstOccurence+1);
		int thirdOccurence = str.indexOf('o', secondOccurence+1);
		System.out.println(str.indexOf('o', thirdOccurence));
	}


}
