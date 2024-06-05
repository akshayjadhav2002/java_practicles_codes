
public class demo{

    static void fun(){
        System.out.println("IN fun");

    }

    public static void main (String args[]){

        demo obj = new demo();
        obj.fun();
        fun();
        demo.fun();
    }
}