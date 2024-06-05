import java.util.*;

class program2{
	
	public static void main(String [] args){

	
		Scanner sc =new Scanner(System.in);

		int num = sc.nextInt();
		int sum =0;
		int temp = num;
		while(temp>0){
		
			int digit = temp%10;
			//temp = temp/10;
			int fact =1;
			for(int i =1;i<=digit;i++){
				fact *=i;
			}
			sum +=fact;
			temp = temp/10;
			
		}
		
		if(sum==num){
		
			System.out.println("Number is a Strong Number");
		
		}
		else{
			System.out.println( sum + "is Not Strong number");

		}
	}

}
