import java.util.*;

class program1{
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
			int num = sc.nextInt();

			int sum = 0;
			for(int i =1;i<num;i++){
				if(num%i==0){
				sum +=i;
				}
		

			}

			if(sum == num){
			System.out.println( num + " is a Perfect Number");
			}
			else{

			System.out.println(num + "is not perfect number");
			}




	}


}
