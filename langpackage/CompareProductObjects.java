package langpackage;

//Q56
//Create two product class objects and compare its data


public class CompareProductObjects {
	
	public static void main(String[] args) {
		
		Product pdt1 = new Product(1,"laptop",2000,2);
		Product pdt2 = new Product(1,"laptop",2000,2);
		System.out.println(pdt1.equals(pdt2));
	}

}
