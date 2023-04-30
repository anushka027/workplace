import java.util.Stack;

public class StackDemo {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<>();
        
        stack.push("America");
        stack.push("INDIA");
        stack.push("pakistan");

        System.out.println(stack);

        String bool = stack.pop();
        System.out.println(bool);

        System.out.println(stack);

        String bool1 = stack.peek();
        System.out.println(bool1);

        System.out.println(stack);

     }
}
