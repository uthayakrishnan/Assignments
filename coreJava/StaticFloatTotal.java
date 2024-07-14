package coreJava;
//Q29
public class StaticFloatTotal {

	public static float printM1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		float returnValue = printM1(7);
		float total = 100 + returnValue;
		System.out.println(total);
	}
}
