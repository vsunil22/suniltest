package SimpleAbstarct;

public class reversefirstandlastchar {

	public static void main(String[] args) {
String rev=null;

		String str="suni sup";
        String [] ch = str.split("\\s+");
        for (int i = 0; i < ch.length; i++)
        { 
        	System.out.println(ch.length);
        	String s=ch[i].toString();
        		StringBuffer sb=new StringBuffer(s);
        		rev=sb.reverse().toString();
        }
        System.out.println(rev);
	}

}
