package coreJava;

//Q19
public class NonStaticFloat {
	
	public  void showM1Float(float a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		//call m1 method from here
		NonStaticFloat nonStaticFloat = new NonStaticFloat();
		nonStaticFloat.showM1Float(12.4f);
		
	}


}
