class program2{

    //constructor gets memory inside object 
    //there is hidden this parameter in the constructor which is the object of that class used to differentiate btw 
    // instance variable and local variable having same name; 
    program2(){
        System.out.println(this);
    }

    public static void main(String args []){
        program2 obj = new program2();
        System.out.println(obj);
    }
}