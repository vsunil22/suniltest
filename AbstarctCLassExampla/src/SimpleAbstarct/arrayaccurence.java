package SimpleAbstarct;

public class arrayaccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int []a= {1,2,1,1,3,4,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[i]);
				}
				
			}	
		}
		System.out.println(count);

	}

}
