package class_objects;

public class program2 {
    
    public static void main(String args []){
        System.out.println("In Main Method");
    }
    
    //Static block runs first on jvm then main methos runs.
    //static method initializes the static variables in it and then static methods get palce in  
    //special structure
    static {
        System.out.println("In static block");
    }
}
