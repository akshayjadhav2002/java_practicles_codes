package Stack;
///Using Array
public class Stack{
  
    int StackArray[];
    int top;
    int size;

    Stack(int size){
        this.size = size;
        StackArray = new int[size];
        this.top = -1;
    }

    void push(int element){
        if(size-top>1) {
        StackArray[++top] = element;
        }
        else{
            System.out.println("Stack overflow occured");
        }

    }
    int peek(){
        if(top<0){

            System.err.println("Stack under flow");
        }
        return StackArray[top];
    }

    void pop (){   
        if(top>=0){
        StackArray[top] = 0;
        top--;
        }
        else{
            System.out.println("Stack under flow occured");
        }
    }

    boolean isEmpty(){
        if(top<=-1){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String args []){
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
       System.out.println(stack.peek());
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       System.out.println(stack.peek());
       System.out.println(stack.isEmpty());
    }
    
}