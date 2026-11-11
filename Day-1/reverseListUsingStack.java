import java.util.*;
public class reverseListUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer>sk = new Stack<>();
        for(int i=0;i<n;i++){
            sk.push(arr[i]);
        }
        while(sk.size()>0){
            System.out.println(sk.pop());
        }
    }}

