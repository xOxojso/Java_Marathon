package day11;

public class Warehouse {
    private int countOrder;
    private double balance;


    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "количество собранных заказов: " + countOrder + "\nдоход от доставленных заказов: " + balance+"\n";
    }
}
