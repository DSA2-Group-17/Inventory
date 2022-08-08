import java.util.*;
    public class Main{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

            // Create a queue of capacity 4
            Queue q = new Queue(4);

            System.out.println("State of Initial Queue:");
            // print Queue elements
            q.queueDisplay();

            // inserting elements in the queue
            System.out.println("please enter a new item ");

            String one = sc.nextLine();
            System.out.println("Queue after Enqueue Operation:"+one);
            System.out.print("Enter next number :");
            String two = sc.nextLine();
            System.out.println("Queue after Enqueue Operation:"+one+" "+two);
            System.out.print("Enter next number :");
            String three = sc.nextLine();
            System.out.println("Queue after Enqueue Operation:"+one+" "+two+" "+three);
            System.out.print("Enter next number :");
            String four = sc.nextLine();
            System.out.println("Queue after Enqueue Operation:"+one+" "+two+" "+three+" "+four);
            q.queueEnqueue(one);
            q.queueEnqueue(two);
            q.queueEnqueue(three);
            q.queueDequeue();
            q.queueEnqueue(four);
            q.queueDequeue();

            System.out.println("After adding the data elements, your queue looks like this  now :");
            q.queueDisplay();



        }
    }
