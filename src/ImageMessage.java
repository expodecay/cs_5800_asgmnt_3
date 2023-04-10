public class ImageMessage implements MessageType {

    protected MessageSender message_sender;

    public ImageMessage(MessageSender message_sender){
        message_sender = message_sender;
    }

    @Override
    public void sendMessage(String message) {
        message_sender.sendMessage(message);
    }
}
