package coreJava;
//Q17
public class M1MethodClass {
	
	public  void callM1Method(){	
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		M1MethodClass m1MethodClass = new M1MethodClass();
		m1MethodClass.callM1Method();
	}


}
