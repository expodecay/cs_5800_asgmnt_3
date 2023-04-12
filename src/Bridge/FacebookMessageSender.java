package Bridge;

public class FacebookMessageSender implements MessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("'" + message + "' : This message was sent with Facebook");
    }
}
