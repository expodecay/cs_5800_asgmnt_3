public class VideoMessage implements MessageType {

    protected MessageSender message_sender;

    public VideoMessage(MessageSender message_sender){
        message_sender = message_sender;
    }

    @Override
    public void sendMessage(String message) {
        message_sender.sendMessage(message);
    }
}
