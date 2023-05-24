package day11;

public class Runner {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 100; i++) {
            picker.doWork();
            picker.bonus();

            courier.doWork();
            courier.bonus();
        }

        System.out.println(warehouse + picker.toString() + courier);
    }
}
