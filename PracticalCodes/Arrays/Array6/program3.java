import java.util.*;

class program3{
		
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the key ");
	int key = sc.nextInt();

		int arr [] = { 11,6,8,9,5,8,7,8,6};
		int cnt  =0;
		for(int i =0;i<arr.length;i++){
		
			if(arr[i] == key){
				cnt++;
				if(cnt>2){
				break;

				}
			}
		}

		for(int i =0;i<arr.length;i++){

			if(cnt>2 && arr[i] == key){
				arr[i] =arr[i]*arr[i]*arr[i];
			System.out.print(arr[i] + " ");

			}else{
			System.out.print( arr[i] + " " );
			}

		}
	}


}
