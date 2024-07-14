package coreJava;

//Q35
public class DisplayTotalClass {
	
	static int total = 0;

	public static void add() {  
		int total = 10 + 30;
	}

	public static void main(String[] args) {
		DisplayTotalClass.add();
		System.out.println(total);
	}


}
