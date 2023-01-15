package lr6;

import java.util.Random;

public class example8 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int ArrayLength = 11;
        int[] intArray = new int[ArrayLength];
        for (int i = 0 ; i <ArrayLength; i++){
            intArray[i] = random.nextInt(100);
            System.out.println("["+i+"] = "+intArray[i]);
        }

        System.out.println("Среднее значение ["+ArrayLength+"] = "+Task1.ArrayAvg(intArray));
    }
    protected static class Task1{
        private static double ArrayAvg (int[] Array){
            int sum=0;
            for (int j : Array) {
                sum += j;
            }
            return (double)sum/Array.length;
        }
    }
}
