import java.io.*;
class buffer{
	public static void main(String [] args) throws IOException {
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	System.out.println("Enter name: ");
	 String cmpName = br.readLine(); //return type of readLine() method is String 		
	System.out.println("Enter Age : " );
	int age = Integer.parseInt(br.readLine());
	//integer read karai che asel tar parsing karave lagte
	System.out.println(" Name is :" + cmpName );
	System.out.println("Age is :" + age);
	
	}
}
