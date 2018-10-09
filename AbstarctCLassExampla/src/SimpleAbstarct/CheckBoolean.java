package SimpleAbstarct;

public class CheckBoolean {

	public static void main(String[] args)
	{
		int num=1234;
		
		if(palondrom(num))
		{
			System.out.println("num is palindrome");
		}
		else
		{
			System.out.println("Not Palidrome");
		}

	}

public static boolean palondrom(int num)
{
	int number=num;
	int revrse=0, remind;
	
	while(num!=0) 
	{
		remind=num%10;
		revrse=revrse*10+remind;
		num=num/10;
		
	}
	if(revrse==number)
	{
		return true;
	}
	return false;
	
}
}
