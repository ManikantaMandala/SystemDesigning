package code.structural.decorator.notification_system.notifier;

import code.structural.decorator.notification_system.logger.Logger;

public class SlackNotifier extends BaseNotifier {

    public SlackNotifier(Notifier wrapee) {
        super(wrapee);
    }

    public void send(String message) {
        super.send(message);

        Logger.printSlackNotifier(message);
    }
}
