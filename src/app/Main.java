package app;

public class Main {
    public static void main(String[] args) {
        FruitThread fruitThread = new FruitThread(5);
        VegetableThread vegetableThread = new VegetableThread(5);

        fruitThread.setPriority(Thread.MIN_PRIORITY);
        vegetableThread.setPriority(Thread.MAX_PRIORITY);

        fruitThread.start();
        vegetableThread.start();
    }
}
