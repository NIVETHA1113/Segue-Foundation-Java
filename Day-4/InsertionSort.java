public class InsertionSort {
  public static void main(String[]arg){
    int[]arr = {2,4,1,5,3,8,6};
    int n = arr.length;
    for(int i=1;i<n-1;i++){
        int key = arr[i];
        int j=1;
        while(j>=0 && arr[j-1]>key){
            arr[j+1] = arr[j];
            j--;
        }
    }
  }  
}
