package coreJava;

//Q44
public class IndexOfFirst {

	public static void main(String[] args) {
		String str = "Hello Welcome";
		char index = 'W';
		char from = 'l';
		//print index of first 'l' after 'W'
		System.out.println(str.indexOf( 'l',7));
		System.out.println(str.indexOf(from, str.indexOf(index)));
	}

}
