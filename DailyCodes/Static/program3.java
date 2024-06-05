class program3{
	int a = 10;
	static int b = 20;
	void methodFun(){
		System.out.println(a+b);
	}
	public static void main(String [] args){
		System.out.println("In main method");
		program3 obj = new program3();
		System.out.println(obj.a);
		obj.methodFun();
		
	}
}
