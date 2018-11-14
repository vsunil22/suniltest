package SimpleAbstarct;

public class countzerosandonesinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String num="101001010";
int countzero=0,countones=0;
		
		int count=0;
		
		char [] ar=num.toCharArray();
		for(int i=0;i<=ar.length-1;i++)
		{
			if(Character.isDigit(ar[i]))
			{
				int n=Integer.parseInt(String.valueOf(ar[i]));
				
				if(n==0)
				{
					
					countzero++;
				}
				else 
				{
					countones++;
				}
			}
			
		}
		System.out.println(countzero);
		System.out.println(countones);
	}

}
