import java.util.Scanner;
public class RemoveDuplicatesBrute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = 0; j <k; j++) {

                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[k++] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
