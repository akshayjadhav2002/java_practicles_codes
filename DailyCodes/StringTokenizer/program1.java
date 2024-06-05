import java.util.*;

//String tokenizer is in util package
class stringToken{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter player Info");
	String info = sc.nextLine();
	StringTokenizer st = new StringTokenizer(info,"#@!");

	while(st.hasMoreElements()){
		System.out.println(st.nextToken());

	}
	//hasmoreTokens == hasmoreElements both are same 	
	sc.close();
	}

		
}
