import java.util.*;
class Main{
    public static int search(int[]arr, int val, boolean found, int ind){
        int n = arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i]==val){
                ind = i;
                found = true;
                break;
            }
        }
        if(found ==true){
            return ind;
        }
        else{
            return -1;
        }

    }
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[100];
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        System.out.print(search(arr,val,false,-1));

    }
}