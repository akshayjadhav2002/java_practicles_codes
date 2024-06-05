import java.util.*;
class program1{
    /**
     * @param args
     */
    public static void main(String [] args){
        //object of Scanner class here LHS on = is called as refrence and RHS is called as Object
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println(name);
        sc.close();
    }

}

  /*A simple text scanner which can parse primitive types and strings using
   regular expressions.
A Scanner breaks its input into tokens using a delimiter pattern, 
which by default matches whitespace. The resulting tokens may then be converted into 
values of different types using the various next methods. */