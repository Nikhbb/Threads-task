package app;

public class Main {
    public static void main(String[] args) {
        FruitThread fruits = new FruitThread(5);
        VegetableThread vegetables = new VegetableThread(5);

        vegetables.setPriority(Thread.MAX_PRIORITY);
        fruits.start();
        vegetables.start();
    }
}
