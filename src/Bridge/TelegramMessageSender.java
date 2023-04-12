package Bridge;

public class TelegramMessageSender implements MessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("'" + message + "' : This message was sent with Telegram");
    }
}
