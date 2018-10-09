package SimpleAbstarct;

public class primeNum {

	public static void main(String[] args) {
		int n=4, flag=0;
		
		if(n==0||n==1)
		{
			System.out.println("Number is not prime");
		}

		for(int i=2; i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Number is Not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}
