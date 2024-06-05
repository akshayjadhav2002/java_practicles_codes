import java.util.*;

class program4{
	
	public static void main(String args []){

	
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sqr = num*num;
		int cnt =0;
		while(cnt<2){
		
			int digit = sqr%10;
			int numdigit = num%10;
			if(digit==numdigit){
				cnt++;
			}
			sqr = sqr/10;
			num =num/10;
		}
		if(cnt == 2){
		System.out.println("number is Automorphic");

		}
		else{

		System.out.println("Number is not AutomorPhic");

		}
	}

}
