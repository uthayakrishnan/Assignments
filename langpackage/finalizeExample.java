package langpackage;

//Q59
//Write a program which will explain finalize method
public class finalizeExample {
	
	public static void main(String[] args) {
		
		Product pdt = new Product();
		pdt =null;
		System.gc();
		
	}

}
