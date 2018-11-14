package SimpleAbstarct;

public class Stringreversefirstnlast {

	public static void main(String[] args) {
		 // Create an equivalent char array 
        // of given string 
		String str="suni supriya shourya";
	
		String[] news=str.split("\\s+");
        for(int k=0;k<news.length;k++)
        {
    
        	
        	String sirstchsr=news[k];
        	
        	char last=sirstchsr.charAt(sirstchsr.length()-1);
        	char first=sirstchsr.charAt(0);
        	
        	StringBuffer sb=new StringBuffer(sirstchsr);
        	sb.setCharAt(0, last);
        	sb.setCharAt(sirstchsr.length()-1,first);
        	System.out.println(sb);
       
        	
        	StringBuffer rev=sb.reverse();
        	System.out.println(rev);
        	
        	String sub=sb.substring(1);
        	System.out.println(sub);
        	
        	
        	
}
        
        
		
		
//		String s="sunil";
//		char [] ar=s.toCharArray();
		
//		for(int i=0;i<=ar.length;i++) 
//		{
//		if(i==0)
//		{
//			int l=ar.length-1;
//			char temp=ar[l];
//			ar[l]=ar[i];
//			ar[i]=temp;
//		}
//		
//		}
//		System.out.println(ar);
		
		
        
        
        
 //       char[] ch = str.toCharArray();
//        for(int j=0;j<ch.length;j++) {
//        	System.out.println(ch.length);
//        }
//       for (int i = 0; i < ch.length; i++)
//        { 
//  
//        	
//    	   
//            // k stores index of first character 
//            // and i is going to store index of last  
//           // character.  
//          int k = i; 
//            while (i < ch.length && ch[i] != ' ')  
//               i++; 
//              
//           // Swapping 
//            char temp = ch[k]; 
//           ch[k] = ch[i - 1]; 
//           ch[i - 1] = temp; 
//  
//            // We assume that there is only one space 
//            // between two words. 
//        } 
//       
//      System.out.println(ch);
    } 

	}
