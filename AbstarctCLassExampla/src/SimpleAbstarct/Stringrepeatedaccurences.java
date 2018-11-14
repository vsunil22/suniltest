package SimpleAbstarct;

public class Stringrepeatedaccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="abcacba";
		int countzero=0,countones=0;
				
				int count=0;
				
				char [] ar=num.toCharArray();
				for(int i=0;i<=ar.length-1;i++)
				{
					
					if(Character.isAlphabetic(ar[i]))
					{
						
						char n=ar[i];
						
						
						if(n=='a')
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

