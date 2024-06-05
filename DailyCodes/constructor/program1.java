
public class program1{

    //Access Specifier of constructor is what acces specifier of class is 
    //if we explicitly give acces specifier to constructor then it takes it 
    ///static and final is not allowed
   protected program1(){
        System.out.println("In constructor");
    }

   public static void main(String args []){
    program1 obj =new program1();
   }    
}
