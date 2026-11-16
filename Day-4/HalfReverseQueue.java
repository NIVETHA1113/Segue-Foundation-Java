import java.util.*;
public class HalfReverseQueue {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int n = arr.length;
        Queue<Integer>queue = new java.util.LinkedList<>();
        for(int i=(n+1)/2;i<n;i++){
            queue.offer(arr[i]);
        }
        for(int i=0;i<(n+1)/2;i++){
            queue.offer(arr[i]);
        }
        for(Integer ans: queue){
            System.out.print(ans+" ");
        }
    }}

