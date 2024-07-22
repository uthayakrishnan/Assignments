package coreJava;

public class StaticTotalOutput {
	//Q36
	static int total = 0;

	public static void add() {
		total = 10 + 30;
	}

	public static void main(String[] args) {
		StaticTotalOutput.add();
		System.out.println(total);
	}

}
