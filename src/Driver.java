import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Do you want to send a 'TextMessage', 'ImageMessage', or 'VideoMessage'?");
        Scanner scanner = new Scanner(System.in);
        String message_type = scanner.next();

        if (message_type.equalsIgnoreCase("TextMessage")){
            MessageType TextMessage = new TextMessage(new WhatsAppMessageSender());
            TextMessage.sendMessage(message_type);
        }
    }
}
