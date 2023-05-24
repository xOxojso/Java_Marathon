package day11;

public class Picker implements Worker {
    private double salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        int countOrder = warehouse.getCountOrder();
        if (countOrder == 1500) {
            salary *= 3;
        }
    }

    public String toString() {
        return "Picker salary: " + salary + "\n";
    }
}
