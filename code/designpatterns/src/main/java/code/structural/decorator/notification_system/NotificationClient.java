package code.structural.decorator.notification_system;

import code.structural.decorator.notification_system.notifier.FacebookNotifier;
import code.structural.decorator.notification_system.notifier.Notifier;
import code.structural.decorator.notification_system.notifier.SMSNotifier;
import code.structural.decorator.notification_system.notifier.SlackNotifier;

public class NotificationClient {
    public Notifier notifier;
    public boolean facebookEnabled;
    public boolean slackEnabled;

    public static void main(String[] args) {
        NotificationClient nClient = new NotificationClient();
        nClient.notifier = new SMSNotifier();

        nClient.facebookEnabled = true;
        nClient.slackEnabled = true;

        nClient.setNotifier(nClient.notifier);

        nClient.notifier.send("Hello world!");
    }

    public void setNotifier(Notifier notifier) {
        if (facebookEnabled) {
            this.notifier = new FacebookNotifier(notifier);
            if (slackEnabled) {
                this.notifier = new SlackNotifier(this.notifier);
            }
        } else if (slackEnabled) {
            this.notifier = new SlackNotifier(notifier);
        }

    }
}
