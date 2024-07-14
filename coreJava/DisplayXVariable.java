package coreJava;

//Q13
  public class DisplayXVariable {
	int x = 10;
	
	public void show(){
		int x = 100;
		System.out.println(x);//do required changes at this line but output should be 100
		System.out.println(this.x);//do required changes at this line but output should be 10
	}
	
	public static void main(String[] args) {
		DisplayXVariable displayXObject = new DisplayXVariable();
		displayXObject.show();
	}


}
