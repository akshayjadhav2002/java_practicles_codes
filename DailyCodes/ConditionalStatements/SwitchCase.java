class SwitchCase{
	public static void main (String [] args){
	boolean num = true;
	System.out.println("Before Switch");

	switch(num){
	case ('A'>'B'):
		System.out.println("one");
			break; 
			//break allow us to stop the program control and return from here  

	case ('A'<'B'):
		System.out.println("Two");
			break;
	case 102:
		System.out.println("Three");
			break;
	default:
		//Default condition  occurs if none condition is meet
		System.out.println(" In default");
		
	}
	System.out.println("After Switch");
	}
}
// In  switch Float value is not allowed and double.
// Character and String chalte type pan chalto
// Dublicate values chalat nahit case made
// Boolean data type not allowed in case
