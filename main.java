
enum class NotificationType {
    EMAIL,
    SMS,
    WHATSAPP
}

abstract class Notification {
    int id;
    NotificationType type;
}

class EmailNotification extends Notification {
    String sender;
    String reciever;
    String subject;
    List<String> cc;
}

class SMSNotification extends Notification {
    String mobNumber;
    String message;
}

class WhatsappNotification extends Notification {
    String mobNumber;
    String message;
}

interface NotificationHandler {
    sendNotification();
}

class EmailNotificationHandler implements NotificationHandler {
    sendNotification() {

    }
}

class SMSNotificationHandler implements NotificationHandler {
    sendNotification() {
        
    }
}

class WhatsappNotificationHandler implements NotificationHandler {
    sendNotification() {
        
    }
}

