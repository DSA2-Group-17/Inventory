package stack;

public class Main {

    public static void main (String[] args){

        ArrayStack<String> myStack = new ArrayStack<String>();
        myStack.push("Kofi");
        myStack.push("Johnson");
        myStack.push("Adoma");
        myStack.push("Whawhani");
        myStack.push("Dickson");

        System.out.println(myStack.toString());
        System.out.println("Size: " + myStack.size());
        System.out.println("Top: " + myStack.peek());

        String name = myStack.pop();

        System.out.println("Popped: " + name);
        System.out.println(myStack.toString());
        System.out.println("Size: " + myStack.size());
        System.out.println("Top: " + myStack.peek());
    }
}
