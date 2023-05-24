package day7;

import java.util.Random;

public class Player {
    private static final int MAX_PLAYERS = 6;
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        stamina = getRandomStamina();

        if (countPlayers < MAX_PLAYERS) {
            countPlayers++;
        }
    }

    public static void info() {
        String freePlaces = (MAX_PLAYERS - countPlayers) == 1 ? " свободное место" : " свободных места";
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) + freePlaces);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public void run() {
        if (this.stamina == MIN_STAMINA) {
            return;
        }
        this.stamina--;
        checkStamina();
    }

    private void checkStamina() {
        if (this.stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    private int getRandomStamina() {
        return Random.from(new Random()).nextInt(90, 100);
    }

    public int getStamina() {
        return stamina;
    }
}
