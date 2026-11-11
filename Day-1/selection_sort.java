import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int counter = 0;
        for(int i=0;i<n-1;i++){
            int pos = i;
            int min = arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    counter++;
                    min = arr[j];
                    pos = j;
                }
            }
        if(counter !=0){
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;
            counter = 0;
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
