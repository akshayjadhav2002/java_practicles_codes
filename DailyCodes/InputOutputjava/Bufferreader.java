import java.io.*;

class Bufferreader{
	//It is mandator to handle Exception if we are using the BR and ISR class
	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		//Reaturn Type of read method is int
		int str = isr.read(); //read single chracter from console
		//String str = isr.getEncoding(); //gets the encoding format used
		//boolean str = isr.ready() //tells us is it ready to take input
		//isr.close(); close the inputStream pipeline                                         
		BufferedReader br = new BufferedReader(System.in);

		//int str = isr.read(br,0,7);
		//BufferedReader br = new BufferedReader(System.in);
		System.out.println(str);
		
	}
}
