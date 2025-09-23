public class Main {

    // CircularQueue class inside Main
    static class CircularQueue {
        private int size;
        private int[] queue;
        private int front, rear;

        // Constructor
        public CircularQueue(int size) {
            this.size = size;
            this.queue = new int[size];
            this.front = this.rear = -1;
        }

        // Check if the queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return front == -1;
        }

        // Enqueue an element
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                if (front == -1) {  // First element to be added
                    front = 0;
                }
                rear = (rear + 1) % size;
                queue[rear] = item;
                System.out.println("Enqueued: " + item);
            }
        }

        // Dequeue an element
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                int item = queue[front];
                System.out.println("Dequeued: " + item);
                if (front == rear) {  // Queue has only one element
                    front = rear = -1;
                } else {
                    front = (front + 1) % size;
                }
            }
        }

        // Get the front element
        public int frontElement() {
            if (!isEmpty()) {
                return queue[front];
            }
            System.out.println("Queue is empty");
            return -1; // Return -1 to signify empty
        }

        // Get the rear element
        public int rearElement() {
            if (!isEmpty()) {
                return queue[rear];
            }
            System.out.println("Queue is empty");
            return -1; // Return -1 to signify empty
        }
    }

    // Main method to run the CircularQueue
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);  // Queue of size 5
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.dequeue();
        cq.enqueue(50);
        cq.enqueue(60);
        
        // Additional front and rear checks
        System.out.println("Front element: " + cq.frontElement());
        System.out.println("Rear element: " + cq.rearElement());
    }
}
