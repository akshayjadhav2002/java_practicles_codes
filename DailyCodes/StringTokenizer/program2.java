import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name");

        String name = br.readLine();
        br.close();
        System.out.println("Enter society Name");
        String SocName = br.readLine();
        System.out.println("Enter wing");
        char wing =br.readLine();  ///Error missmatched  type cannot be converted from String to char
        System.out.println("Enter flatno");
        String flatNo = br.readLine();

        br.close();
    }
}
