package app;

import java.util.ArrayList;
import java.util.List;

public class VegetableThread extends Thread {
    private List<String> names;

    public VegetableThread(int sizeList) {
        this.names = createList(sizeList);
    }

    private List<String> createList(int sizeList) {
        List<String> tempList = new ArrayList<>(sizeList);
        for (int i = 1; i <= sizeList; i++) {
            tempList.add("vegetable_" + i);
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
