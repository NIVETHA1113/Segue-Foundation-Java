public class ReverseAdjacent {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        for(int i=0,j=1;i<arr.length-2;i+=2,j+=2){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }}

