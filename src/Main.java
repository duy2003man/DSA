public class Main {
    public static void main(String[] args) {
        MessageSystem messageSystem = new MessageSystem();
        messageSystem.sendMessage("Message 1");
        messageSystem.sendMessage("Message 2");
        messageSystem.sendMessage("Message 3");

        messageSystem.processMessages();
        messageSystem.printProcessedMessages();

    }
}