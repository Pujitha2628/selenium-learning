import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2= {1,2,24,56,5,42};
		
		for(int i=0;i<arr2.length;i++) 
		{
			
			if(arr2 [i] %2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			
			
			else 
			{
				System.out.println(arr2[i] +"is not multiple of 2");	
			}
			
			}
		
		
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("toni");
		ar.add("honey");
		ar.get(1);
		System.out.println(ar.get(0));
		
		for( int i=0; i<ar.size(); i++) {
		System.out.println(ar.get(i));  
		
		}
		
		//enhanced for loop
		
		for(String s1 : ar) {
			System.out.println(s1);  

		}
	}
}
		
	

