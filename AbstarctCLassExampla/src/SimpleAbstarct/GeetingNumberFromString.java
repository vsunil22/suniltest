package SimpleAbstarct;

public class GeetingNumberFromString {

	public static void main(String[] args) 
	{
		String s= "sunil1234";
		int sum=0;
		char [] arr=s. toCharArray();
		
		for(int i=0; i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				System.out.println(arr[i]);
				sum=sum+Integer.parseInt(String.valueOf(arr[i]));
				
			}
		}
		System.out.println(sum);

		//Reverse string without reverse method or with out string buffer and string Builder
		String s1="sunil";
		for (int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		
		
		//quick wasy to reverse String in Java - Use StringBuffer
        String s2 = "HelloWorld";
        String reverse = new StringBuffer(s2).reverse().toString();
        System.out.println(reverse);
      
        //another quick to reverse String in Java - use StringBuilder
        String   s3 = "WakeUp";
        reverse = new StringBuilder(s3).reverse().toString();
        System.out.println(reverse);
      
      
	}
	

}
