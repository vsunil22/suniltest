package SimpleAbstarct;

public class singlelevelinheritance extends multipleinheritance {

	public void show()
	{
		System.out.println("show fron child cass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singlelevelinheritance s=new singlelevelinheritance();
		
		multipleinheritance m=new singlelevelinheritance();
		
		multipleinheritance nm=new multipleinheritance();
		
		nm.show();
		m.show();
		s.show();
	}

}
