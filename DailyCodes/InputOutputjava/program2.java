import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program2 {
  
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");
        //reader.close(); // Remember to close the reader
    }


}
