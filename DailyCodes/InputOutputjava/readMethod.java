import java.io.*;

class readMethod{
	public static void main(String [] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Name");
		String name = br.readLine();

		System.out.println("Enter soc Name");
		String SocName = br.readLine();

		System.out.println("Enter Wing");
		char Wing = (char) br.read();
			br.skip(1);
		System.out.println("Enter flat No");
		//int flatNo = Integer.parseInt(br.readLine());
		String flaatNo = br.readLine();
	}

}
