package SimpleAbstarct;

import java.util.Scanner;

public class arreyreversemethod {
	
	public static void main(String args[])
	{
		int array[]= {1,3,4,2,7,6};
		
		for(int i=0; i<array.length/2; i++)
		{
			int temp = array[i]; 
			array[i] = array[array.length -i -1]; 
			array[array.length -i -1] = temp;
		}
		
		
	}
	
	
	

	
}
