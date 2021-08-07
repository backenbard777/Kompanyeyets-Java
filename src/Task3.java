public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        for (int e : arr) {
            if (e % 3 == 0) {
                System.out.println(e);
            }
        }
    }
}
