package coreJava;

//Q28
public class StaticTotalClass {

	public static int callstaticTotalM1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int returnValue = callstaticTotalM1(7);
		int total = 100 + returnValue;
		System.out.println(total);
	}

}
