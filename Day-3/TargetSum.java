import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        int target = sc.nextInt();
        int start = 0;
        int end = n-1;
        int sum =0;
        while(start<=end){
            sum = arr[start]+arr[end];
            if(sum==target){
            System.out.println("Target found "+arr[start]+" "+arr[end]);
            return;
        }
        else if(sum<target){
            start++;
        }
        else{
            end--;
        }
    }
}
}