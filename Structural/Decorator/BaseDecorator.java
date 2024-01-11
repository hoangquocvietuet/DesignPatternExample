public class BaseDecorator extends Notifier {
    private Notifier wrappee;

    public BaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    public void send(String message) {
        this.wrappee.send(message);
    }
}
