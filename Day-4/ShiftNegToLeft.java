public class ShiftNegToLeft {
    public static void main(String[] args) {

        int[] arr = {2, 3, -4, -6, 6, -9, 5};

        int n = arr.length;
        int[] res = new int[n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                res[k++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res[k++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

