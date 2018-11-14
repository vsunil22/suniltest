package SimpleAbstarct;

public class reversestringwhichhasspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		String line="i love you sunil";
		// \\s+  is the space delimiter in java 
		String[] wordList = line.split("\\s+"); 
		
	for(int i=wordList.length-1;i>=0;i--)
	{
			
		s=wordList[i].toString();
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	}
		
		for(int i=0;i<wordList.length;i++) 
		{
			
			s=wordList[i].toString();
			StringBuffer sb=new StringBuffer(s);
			StringBuffer rev=sb.reverse();
			System.out.println(rev);
		
		}
		
		
		
		
		

	}

}
