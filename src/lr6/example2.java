package lr6;

public class example2 {
    public static void main(String[] args) {
        Task task = new Task();
        Task.strim();
        Task.strim();
        Task.strim();
        Task.strim();

    }

    public static class Task {
        private static int in1;
        public static void strim() {
            System.out.println(in1);
            in1++;
        }
    }

}