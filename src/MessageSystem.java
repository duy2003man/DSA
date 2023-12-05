public class MessageSystem {
    private CustomQueue messageQueue;
    private CustomStack messageProcessor;

    public MessageSystem() {
        messageQueue = new CustomQueue();
        messageProcessor = new CustomStack();
    }

    public void sendMessage(String message) {
        messageQueue.enqueue(message);
    }

    public void processMessages() {
        while (!messageQueue.isEmpty()) {
            String message = messageQueue.dequeue();
            messageProcessor.push(message);
        }
    }

    public void printProcessedMessages() {
        while (!messageProcessor.isEmpty()) {
            String message = messageProcessor.pop();
            System.out.println("Processed message: " + message);
        }
    }

}