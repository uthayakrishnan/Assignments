package coreJava;


//Create Product class with fields id,name and price and create Product object and store data and display that data
public class Product {

	private int id;
	private String name;
	private int price;
	
public static void main(String[] args) {
	Product product = new Product();
	product.id = 01;
	product.name = "Laptop";
	product.price = 250;
	System.out.println("ID:" +" " +product.id);
	System.out.println("NAME:" + ""+product.name);
	System.out.println("PRICE:" +"" +product.price);
}
}
