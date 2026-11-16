import java.util.*;
public class SecondLargest {
    public static void main(String[]arg){
        int[]arr = {2,3,5,7,8};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                sec_max = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>sec_max){
                sec_max = arr[i];
            }
        }
        System.out.print(sec_max);
    }
}
