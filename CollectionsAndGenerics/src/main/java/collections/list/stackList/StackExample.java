package collections.list.stackList;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Daniel");
        stack.push("Jack");
        System.out.println(stack);
//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
//        System.out.println(stack.pop());
//        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
