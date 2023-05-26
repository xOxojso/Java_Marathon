package day13;

import java.time.Instant;
import java.util.Date;

public class Message {
    private final User sender;
    private final User receiver;
    private String text;
    private final Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return "FROM: " + sender.getUserName() + "\nTO: " + receiver.getUserName() + "\nON "
                + date.toString() + "\n" + text;
    }
}
