package Stack;

import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<String> stack;

    public void push(String item) {
        stack.push(item);
    }

    public String peek() {
        return stack.peek();
    }

    public String pop() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString() {
        return stack.toString();
    }
}
