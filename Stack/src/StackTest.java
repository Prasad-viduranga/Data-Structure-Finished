import ds.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.print();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print();

        stack.pop();
        stack.print();

        System.out.println(stack.empty());

        System.out.println(stack.peek());

        stack.clear();

        stack.print();

        System.out.println(stack.empty());


    }
}
