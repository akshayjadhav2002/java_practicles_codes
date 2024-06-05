package Inheretience;

public class program2 {
    int x =20;

    program2(){
        //because of inheritance first line of constructor is super
        System.out.println("In constructor");
    }

    void fun(){
        System.out.println("In fun function");
    }
}

class child extends program2{

    child(){

        System.out.println("In child ");
    }

    //the consttructor of parent class is inherited to the child class
    //constructor of parent class gets palce inside parent class constructor

}

class client {
    public static void main(String args[]){

        child objectcChild  = new child();
        //All properties of parent class comes to child class
        System.out.println(objectcChild.x);
        objectcChild.fun();


    }
}
/*In constructor
20
In fun function */