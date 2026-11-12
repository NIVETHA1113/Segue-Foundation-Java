import java.util.*;
public class HalfReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        int i,j;
        int mid = n/2;
        for(i=0,j= (n+1)/2;i<mid;i++,j++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }}