public class NotificationService {
    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void envoyer(String message) {
        sender.send(message);
    }
}
