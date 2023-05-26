package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> message = new ArrayList<>();

    private MessageDatabase() {
    }

    public static void sendMessage(User u1, User u2, String text) {
        message.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return message;
    }

    public static void showDialog(User u1, User u2) {
        message.stream().filter(mess -> mess.getSender().equals(u1) && mess.getReceiver().equals(u2)
                        || mess.getSender().equals(u2) && mess.getReceiver().equals(u1)).
                map(mess -> mess.getSender() + " " + mess.getText()).forEach(System.out::println);
    }
}
