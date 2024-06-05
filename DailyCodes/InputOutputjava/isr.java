import java.io.*;
public class isr {
  
    public static void main (String [] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        char input = (char) isr.read();
        System.err.println(input);
    }
} 
