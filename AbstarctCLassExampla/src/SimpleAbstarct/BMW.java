package SimpleAbstarct;

public class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW.....Start");
	}

	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("BMW.....Break");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW......Stop");
		
	}
	

	public void safety()
	{
		System.out.println("Safety.....");
		
	}
}
