package code.structural.decorator.notification_system.notifier;

import code.structural.decorator.notification_system.logger.Logger;

// default notifier
public class SMSNotifier implements Notifier {

    public SMSNotifier() {
    }

    @Override
    public void send(String message) {
        Logger.printSMSNotifier(message);
    }

}
