package lr11.example6.treeSet.add;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAddingToTheBeginning {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 13000000; i++) {
            treeSet.add(i + "hello");
        }
        System.out.println("Время выполнения операции добавления treeSet = " + getRunningTime(treeSet));
    }
    private static long getRunningTime(SortedSet<String> set){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            set.add(0 + "alone");
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
