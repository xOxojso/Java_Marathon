package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Oleg");
        User user3 = new User("Vika");

        user1.sendMessage(user2, "Привет Олег!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет Иван!");
        user2.sendMessage(user1, "Хорошо!");
        user2.sendMessage(user1, "Как у тебя дела?");

        user3.sendMessage(user1, "Привет Иван!");
        user3.sendMessage(user1, "Меня зовут Вика");
        user3.sendMessage(user1, "Что делаешь?");

        user1.sendMessage(user3, "Привет Вика!");
        user1.sendMessage(user3, "Приятно познакомиться, я программирую!");
        user1.sendMessage(user3, "А ты что делаешь?");

        user3.sendMessage(user1, "Я тоже программирую!");

        MessageDatabase.showDialog(user1, user3);
    }
}
