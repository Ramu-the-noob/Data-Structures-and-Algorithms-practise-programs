import java.util.Stack;
public class STACK {
    public static void main(String[] args){

        /* stack = LIFO(last in first out) data structure
           stores objects in a vertical tower
           pop() = remove element from top of the stack
           push() = add element t the top of the stack
        */
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search(6));
    }
}
