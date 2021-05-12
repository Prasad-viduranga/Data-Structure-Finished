import ds.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        queue.print();

    }

}
