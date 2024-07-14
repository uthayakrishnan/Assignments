package coreJava;

//Q14
  
class HelloWorld {
	
	public void show(){
		System.out.println("Hello world");
	}
}

public class HelloWorldMain{
	public static void main(String[] args) {
		//call show method of Test class from here
		HelloWorld helloworldObject  =new HelloWorld();
		helloworldObject.show();
		
	}


}
