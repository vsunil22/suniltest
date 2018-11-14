package SimpleAbstarct;

public class stringoprartions {

	public static void main(String[] args) {
		String s="sunil";
		String s1="sunil21234";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}

		char []array=s1.toCharArray();
		
		for(int i=0;i<=array.length;i++)
		{
			int a=Integer.parseInt(String.valueOf(Character.isDigit(i)));
		}
	}

}
