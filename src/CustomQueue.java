public class CustomQueue {
    private Node front;
    private Node rear;

    private class Node {
        private String message;
        private Node next;

        public Node(String message) {
            this.message = message;
            this.next = null;
        }
    }

    public CustomQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(String message) {
        Node newNode = new Node(message);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String message = front.message;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return message;
    }

    public boolean isEmpty() {
        return front == null;
    }
}