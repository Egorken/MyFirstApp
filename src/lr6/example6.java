package lr6;

public class example6 {
    public static void main(String[] args) {
        int[] inArray = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6,};
        System.out.println("Второй аргумент метода меньше длины массива");
        for (int i = 0; i < Task1.SetArray(inArray, 10).length; i++) {
            System.out.println("outArray[" + i + "] = " + Task1.SetArray(inArray, 10)[i]);
        }
        System.out.println("Второй аргумент метода больше длины массива");
        Task1.SetArray(inArray, 25);
        Task1.viewArray();
    }


    protected static class Task1 {
        private static int[] outArray;
        private static int[] SetArray(int[] inArray, int count) {

            if (count > inArray.length) {
                count = inArray.length;
            }
            outArray = new int[count];
            System.arraycopy(inArray, 0, outArray, 0, count);
            return outArray;
        }

        private static void viewArray()
        {
            for (int i = 0; i < Task1.outArray.length; i++) {
                System.out.println("outArray[" + i + "] = " + outArray[i]);
            }
        }
    }
}