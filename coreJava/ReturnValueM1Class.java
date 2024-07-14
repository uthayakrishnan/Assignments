package coreJava;

//Q32
public class ReturnValueM1Class {
	
	public static int callM1(int i){
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
		
		int returnValue = callM1(6);
		int returnfromM1 = ReturnValueM1Class.callM1(7);
		
		System.out.println(returnValue);
		System.out.println(returnfromM1);
	}


}
