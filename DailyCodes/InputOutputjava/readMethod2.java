import java.io.*;

class readmethod2{
	public static void main(String [] args)throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter your Name");
	String name = br.readLine();

	System.out.println("Enter Society");
	String socName = br.readLine();

	System.out.println("Enter wing");
	char wing = (char) br.read();  //return type of read() is int but we typedcased it into char

	br.skip(2);  //it skips the characters in the bufferreader

	System.out.println("Flatno");
	//int fNo = Integer.parseInt(br.readLine());    //readLine gives us string but we need int to we used wrapper class to wrap it in integer
	String fNo = br.readLine();

	}


}
