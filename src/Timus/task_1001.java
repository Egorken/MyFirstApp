package Timus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class task_1001 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.0000");
            List<String> a = new ArrayList<String>();

            while (in.hasNextLong() ) {
                a.add(df.format(Math.sqrt(in.nextLong())));
            }

            for (int i = a.size() - 1; i >= 0; --i) {
                System.out.println(a.get(i));
            }
        }
    }
