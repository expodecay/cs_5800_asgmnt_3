package Bridge;

public class WhatsAppMessageSender implements MessageSender{

    public void sendMessage(String message) {
        System.out.println("'" + message + "' : This message was sent with WhatsApp");
    }
}
