package Bridge;

public class Driver {
    public static void main(String[] args) {
        String text = "TextMessage";
        String image = "ImageMessage";
        String video = "VideoMessage";

        MessageType whatsApp_text_message = new TextMessage(new WhatsAppMessageSender());
        MessageType whatsApp_image_message = new ImageMessage(new WhatsAppMessageSender());
        MessageType whatsApp_video_message = new VideoMessage(new WhatsAppMessageSender());
        whatsApp_text_message.sendMessage(text);
        whatsApp_image_message.sendMessage(image);
        whatsApp_video_message.sendMessage(video);
        System.out.println();

        MessageType facebook_text_message = new TextMessage(new FacebookMessageSender());
        MessageType facebook_image_message = new ImageMessage(new FacebookMessageSender());
        MessageType facebook_video_message = new VideoMessage(new FacebookMessageSender());
        facebook_text_message.sendMessage(text);
        facebook_image_message.sendMessage(image);
        facebook_video_message.sendMessage(video);
        System.out.println();

        MessageType telegram_text_message = new TextMessage(new TelegramMessageSender());
        MessageType telegram_image_message = new ImageMessage(new TelegramMessageSender());
        MessageType telegram_video_message = new VideoMessage(new TelegramMessageSender());
        telegram_image_message.sendMessage(text);
        telegram_image_message.sendMessage(image);
        telegram_video_message.sendMessage(video);
    }
}
