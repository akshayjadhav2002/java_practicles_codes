public class program3 {
    int x = 10;
    program3(int x){
        System.out.println(x);
        System.out.println(this.x = x);
    }

    void fun(){
        System.out.println(x);
    }

    public static void main(String args []){
        program3 obj1 = new program3(20);
        program3 obj2 = new program3(30);
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        obj1.fun();
        obj2.fun();

    }

    ///cnostructor is used to differentite between different object of same class
}
