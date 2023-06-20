package lr11.example6.treeSet.remove;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRemoveToTheEnd {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();
    for (int i = 0; i < 13000000; i++) {
        treeSet.add(i + "hello");
    }
    System.out.println("Время выполнения операции удаления treeSet = " + getRunningTime(treeSet));
}
    private static long getRunningTime(SortedSet<String> set){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            set.remove("9999999hello");
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
