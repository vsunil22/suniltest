package SimpleAbstarct;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			BMW b=new BMW();
			
			b.Break();
			b.start();
			b.stop();
			b.safety();
			
		
			
		Car c= new BMW();
		c.Break();
		c.start();
		c.stop();
		
//		c.safety(); //Can not access 
	}

}
