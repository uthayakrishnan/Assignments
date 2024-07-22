package langpackage;

////Q53
//Create product class with id,name,price,qnty and create object with some data and display that data using toString
public class ProductMain {
	
	public static void main(String[] args) {
		
		Product pdt = new Product(001,"Laptop",2000,2);
		System.out.println(pdt.toString());
	}


}
