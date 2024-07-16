import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

interface  MacD {
    int types = 20;
    static int emp = 30;

    //bydefault methods in interface are public abstract
   void revenue();
   void makingBurger();
        /*
        *  ---------The idea for writing the method body in interface in to reduce the code usage-----------
        * if we make the method in interface as default then we can override the method in implementing class
        * but in case of static we can not override the method as the method is static strongly bound to class.
        *
        * */
   static void fires(){
       System.out.println("In macD fries");
   }
}

class SinhagadMacD implements  MacD{

    public void revenue(){
        System.out.println("MacD of Sinhagad");
    }
    public void makingBurger(){
        System.out.println("making Maharaja burger");
    }
}
public class program1 {

    public static  void main(String args []){
        SinhagadMacD obj = new SinhagadMacD();
//        obj.fires();
        obj.makingBurger();
        obj.revenue();
    }

}
