package code.structural.decorator.notification_system.notifier;

public class BaseNotifier implements Notifier {
    protected Notifier wrapee;

    public BaseNotifier() {

    }

    public BaseNotifier(Notifier wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void send(String message) {
        wrapee.send(message);
    }

}
