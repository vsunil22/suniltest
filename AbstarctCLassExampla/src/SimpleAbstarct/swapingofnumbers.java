package SimpleAbstarct;

public class swapingofnumbers {
	
	

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int temp;
	System.out.println("before swap:"+a+"and" +b);
	
	
	System.out.println("After swap:"+a+ "and"+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After second swap:"+a+ "and"+b);
	
	}

}
