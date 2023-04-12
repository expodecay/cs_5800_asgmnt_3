package Bridge;

public class TextMessage implements MessageType {

    protected MessageSender message_sender;

    public TextMessage(MessageSender message_sender){
        this.message_sender = message_sender;
    }

    @Override
    public void sendMessage(String message) {
        message_sender.sendMessage(message);
    }
}
