package Bridge;

public class Facebook implements MessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("'" + message + "' : This message was sent with Builder.Facebook");
    }
}
