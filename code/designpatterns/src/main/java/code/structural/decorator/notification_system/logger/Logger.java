package code.structural.decorator.notification_system.logger;

public class Logger {

    public static void printSMSNotifier(String message) {
        System.out.println(message);
        System.out.println("This message is sent via SMS");
    }

    public static void printFacebookNotifier(String message) {
        System.out.println(message);
        System.out.println("This message is sent via Facebook");
    }

    public static void printSlackNotifier(String message) {
        System.out.println(message);
        System.out.println("This message is sent via Slack");
    }
}
