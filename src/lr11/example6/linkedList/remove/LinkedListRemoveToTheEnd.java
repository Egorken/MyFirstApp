package lr11.example6.linkedList.remove;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRemoveToTheEnd {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 13000000; i++) {
            linkedList.add(i);
        }

        System.out.println("Время выполнения операции удаления linkedList = " + getRunningTime(linkedList));
    }

    private static long getRunningTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.remove(12999999);
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
