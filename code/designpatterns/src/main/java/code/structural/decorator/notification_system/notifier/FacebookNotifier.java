package code.structural.decorator.notification_system.notifier;

import code.structural.decorator.notification_system.logger.Logger;

public class FacebookNotifier extends BaseNotifier {

    public FacebookNotifier(Notifier wrapee) {
        super(wrapee);
    }

    public void send(String message) {
        super.send(message);

        // FacebookNotifier implementation
        Logger.printFacebookNotifier(message);
    }

}
