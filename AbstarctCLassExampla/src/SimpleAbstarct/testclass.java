package SimpleAbstarct;

public class testclass {
	
	
	public static int a=0;
	int b=10;
	
	
	public void add()
	{
		a=a+10;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		testclass t=new testclass();
		
		t.add();

	}

}
