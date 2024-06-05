package class_objects;

class prog{
    

    public static void main(String args[]){
        program3 obj = new program3();
        System.out.println(obj.x);
        System.out.println(program3.y);
        obj.fun();
        program3.run();
    }
}
class program3 {
    int x = 10;
    static int y =20;

    void fun(){
        System.out.println("In fun method");
    }


    ///static method
    static void run(){
        System.out.println("In run method");
    }
    
}