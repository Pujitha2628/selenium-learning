
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		char ok='h';
		String str="pujitha";
		boolean b = true;
		double dec=9.77;

		System.out.println(num);
		System.out.println(ok + "ello");
		System.out.println(b);
		
		//Arrays
		int[] arr= new int[4];
		arr[0]=1;
		arr[2]=10;
		arr[1]=23;
		arr[3]=22;
		//arr[4]=3;
		
		int[] arr1= {2,3,4,5,1};
		
		for(int i=0;i<arr.length;i++) 
		{
			
			System.out.println(arr[i]);
		}
		
		 String[] name= {"raju","rani","aur"};
			 
//			 for(int i=0; i<name.length; i++) {
//				 System.out.println(name[i]);
//			 }
//		 
			 
			 
			 for( String s : name) {
				 System.out.println(s);
			 }
		 
	}
	}


