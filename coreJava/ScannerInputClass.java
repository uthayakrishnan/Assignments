package coreJava;
import java.util.Scanner;

//Q34
public class ScannerInputClass {

 
	
	public static void main(String[] args) {
		//take data id,name,salary from user using scanner and display that data in show method
		Scanner empObject = new Scanner(System.in);
		
		System.out.println("Enter Id\n" );
		int id = empObject.nextInt();
		
		empObject.nextLine();
		System.out.println("Enter Name\n" );
		String name = empObject.nextLine();
		
		System.out.println("Enter Salary\n" );	
		int sal = empObject.nextInt();
	
		ScannerInputClass scannerInputClass = new ScannerInputClass();
		scannerInputClass.show(id,name,sal);
	
		empObject.close();
		
	}

	public void show(int id, String name, int sal){
		//display data here by doing required changes
		System.out.println(id+ "  " +name+ "  " +sal);
		
	}
	
}
