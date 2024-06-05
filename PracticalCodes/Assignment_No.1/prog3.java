class Prog3{
	public static void main(String []args){
		
		int num = 15;

		if(num %2 ==0 && num > 10){
			System.out.println(num +"Number is even and greater than 10"); 
		}
		else if(num %2 ==0 && num ==10 ){
			System.out.println(num + "Number is even and eqaul to 10");
		}

		else if(num %2 != 0 && num < 10 ){
			System.out.println(num + "Number is pdd and small than 10");

		}
		else{
			System.out.println(num + "number is greater then 10 and odd");
		}
	}

}
