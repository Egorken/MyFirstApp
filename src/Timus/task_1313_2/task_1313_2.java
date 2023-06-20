package Timus.task_1313_2;

import java.io.*;

public class task_1313_2 {
    public static void main(String[] args) {
        String inputFileName = "src/Timus/task_1313/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            int size = Integer.parseInt(bufferedReader.readLine());

            int[][] ints = new int[size][size];

            String readLine = "";

            for (int i = 0; ((readLine = bufferedReader.readLine()) != null); i++) {
                String[] strings = readLine.split(" ");
                for (int j = 0; j < size; j++) {
                    ints[i][j] = Integer.parseInt(strings[j]);
                }
            }
            for (int i = 0; i < size; i++) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(ints[j][i - j] + " ");
                }
            }

            for (int i = 1; i < size; i++) {
                for (int j = size - 1; j >= i; j--) {
                    System.out.println(ints[j][size - j + i - 1] + " ");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}