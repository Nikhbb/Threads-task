package app;

import java.util.ArrayList;
import java.util.List;

public class FruitThread extends Thread {
    private List<String> names;

    public FruitThread(int sizeList) {
        this.names = createList(sizeList);
    }

    private List<String> createList(int sizeList) {
        List<String> tempList = new ArrayList<>(sizeList);
        for (int i = 1; i <= sizeList; i++) {
            tempList.add("fruit_" + i);
        }
        return tempList;
    }

    @Override
    public void run() {
        for (String s : names) {
            System.out.println(s);
        }
    }
}
