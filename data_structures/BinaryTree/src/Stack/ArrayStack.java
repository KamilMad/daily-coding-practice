package Stack;

public class ArrayStack {
    private int size = 10;
    private int[] stack;
    private int top;// next place to insert value

    public ArrayStack() {
        this.stack = new int[size];
    }

    public void push(int data) {
        //size is 1 more than last index
        if (top > (size - 1)){
            //TODO resize stack
            System.out.println("Stack overflow");
        }else {
            stack[top] = data;
            top++;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else
            return stack[top - 1];

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return  -1;
        }else {
            int result = stack[top - 1];
            top --;
            return result;
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }



}
