package SimpleAbstarct;

import java.util.Scanner;

public class Finnocci {

	public static void main(String[] args) {
		
		int a=0, b=1, fib=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter number of values");
		
		int n=sc.nextInt();
		
		if(n==0) {
			System.out.println(a);
		}
		else if(n==1)
		{
			System.out.println(a);
			System.out.println(b);
			
			
		}
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++) {
			
			fib=a+b;
			System.out.println(fib);
			a=b;
			b=fib;
			
			
		}
		
	}

}
