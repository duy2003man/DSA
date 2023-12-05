public class CustomStack {
    private Node top;

    private class Node {
        private String message;
        private Node next;

        public Node(String message) {
            this.message = message;
            this.next = null;
        }
    }

    public CustomStack() {
        top = null;
    }

    public void push(String message) {
        Node newNode = new Node(message);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String message = top.message;
        top = top.next;
        return message;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.message;
    }

    public boolean isEmpty() {
        return top == null;
    }
}