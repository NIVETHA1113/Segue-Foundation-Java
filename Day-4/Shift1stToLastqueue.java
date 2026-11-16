import java.util.*;
public class Shift1stToLastqueue {
    public static void main(String[] args) {
    int[]arr = {1,2,3,4,5};
    int n = arr.length;
    Queue<Integer>queue = new java.util.LinkedList<>();
    for(int i=1;i<n;i++){
queue.offer(arr[i]);
    }        
    queue.offer(arr[0]);
    for(Integer ans: queue){
        System.out.print(ans+" ");
    }
    }}

