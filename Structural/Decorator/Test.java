import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean runTime = true;
        boolean SMSEnable = true;
        boolean FacebookEnable = true;
        boolean SlackEnable = true;
        boolean sendMessage = true;
        while (runTime) {
            Notifier notifier = new Notifier();
            Scanner scanner  = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    runTime = false;
                }
                if (input.equals("sms")) {
                    SMSEnable = !SMSEnable;
                }
                if (input.equals("facebook")) {
                    FacebookEnable = !FacebookEnable;
                }
                if (input.equals("slack")) {
                    SlackEnable = !SlackEnable;
                }
                if (input.equals("send")) {
                    sendMessage = true;
                }
            }
            if (FacebookEnable) {
                notifier = new FacebookDecorator(notifier);
            }
            if (SMSEnable) {
                notifier = new SMSDecorator(notifier);
            }
            if (SlackEnable) {
                notifier = new SlackDecorator(notifier);
            }
            if (sendMessage) {
                notifier.send("Hello World!");
                sendMessage = false;
            }
        }
    }
}
