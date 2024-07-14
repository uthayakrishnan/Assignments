package coreJava;

//Q27
public class StaticReturnClass {
	
	public static int callStaticIntM1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int returnValue = callStaticIntM1(7);
		System.out.println(returnValue);
	}


}
