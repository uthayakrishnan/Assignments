package collections;
//Q79,80
import java.util.HashSet;

public class HashsetofIntegers {

	public static void main(String args[]) {
		
		HashSet <Integer>h = new HashSet<Integer>();
		h.add(100);
		h.add(878);
		h.add(500);
		h.add(100);
		System.out.println(h);
		
		 
		HashSet <Employee> employeehash = new HashSet<Employee>();
		employeehash.add(new Employee(100,"sam",1000));
		employeehash.add(new Employee(101,"ram",4000));
		employeehash.add(new Employee(101,"ram",4000));
		employeehash.add(new Employee(103,"mam",5000));
		System.out.println("Employee Records");
		for (Employee employee : employeehash) {
			
			System.out.println(employee.getId()+""+employee.getName()+""+employee.getSal());
			
		}
		
		HashSet <Product> producthash = new HashSet<Product>();
		producthash.add(new Product(100,"laptop",1000,2));
		producthash.add(new Product(101,"mouse",4000,2));
		producthash.add(new Product(101,"mouse",4000,2));
		producthash.add(new Product(103,"cable",5000,4));
		System.out.println("Product Details");
		for (Product product : producthash) {
			
			System.out.println(product.getId()+""+product.getName()+""+product.getPrice()+""+product.getQnty());
			
		}
		 
		
	}
	
}
