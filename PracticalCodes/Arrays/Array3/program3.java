import java.util.*; 


class program3{
	
	public static void main(String args[] ){
	
		Scanner sc = new Scanner(System.in);

		int ele =  sc.nextInt();
		int arr [] = {2,5,2,7,8,4,9};
		int cnt = 0;

		for(int i =0;i<arr.length;i++){

			
			if(arr[i]==ele){
			cnt++;	
				
			}
		}
		System.out.println("The number of occurrence of number " + ele + "is " + cnt);
	

	}


}
