 package cristiano.Neymar;
 
 class Stack {
    int[] arr;
    int top;
    int size;

    // behaviour
    Stack(int size) {
        this.size = size;
       arr = new int[size];
        top = -1;
    }

    public void push( int element) {
        if(size - top > 1) {
            top++;
            arr[top] = element;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    public void pop() {
        if(top >=0 ) {
            top--;
        }
        else{
            System.out.println("Stack UnderFlow" );
        }
    }

    int peek() {
        if(top >=0 )
            return arr[top];
        else
        {
            System.out.println("Stack is Empty" );
            return -1;
        }
    }

   public  boolean isEmpty() {
        if( top == -1) {
            return true;
        }
        else{
            return false;
        }
    }

}

public class nymar1{
    public static void main(String[] args){
        Stack st=new Stack(5);
        st.push(20);
        st.push(43);
        st.push(44);
        st.push(22);
        st.push(50);
        //st.push(34);
        //st.push(44);
        System.out.println( st.peek());
        st.pop();
        System.out.println( st.peek());
         st.pop();
         System.out.println( st.peek());
        st.pop();
        System.out.println( st.peek());
         st.pop();
         System.out.println( st.peek());
         st.pop();
         System.out.println( st.peek());
         if(st.isEmpty()){
            System.out.println("stack is empty mere dost");
         }
         else {
            System.out.println("stack is not empty mere dost");
         }

        // st.pop();




}
}
/* 
int main() {


    Stack st(5);

    st.push(22);
    st.push(43);
    st.push(44);
    st.push(22);
    st.push(43);
    st.push(44);

    cout << st.peek() << endl;

    st.pop();

    cout << st.peek() << endl;

    st.pop();

    cout << st.peek() << endl;

    st.pop();

    cout << st.peek() << endl;

    if(st.isEmpty()) {
        cout << "Stack is Empty mere dost " << endl;
    }
    else{
        cout << "Stack is not Empty mere dost " << endl;
    }

    
    /*
    //creation of stack
    stack<int> s;

    //push operation
    s.push(2);
    s.push(3);

    //pop
    s.pop();

    cout << "Printing top element " << s.top() << endl;

    if(s.empty()){
        cout << "Stack is empty " << endl;
    }
    else{
        cout << "stack is not empty " << endl;
    }

    cout << "size of stack is " << s.size() << endl;

    */

    

    

