public class TextMessage extends Message{

    public TextMessage(MessageSender message_sender){
        super.message_sender = message_sender;
    }

    @Override
    public void sendMessage(String message) {
        message_sender.sendMessage(message);
    }
}
