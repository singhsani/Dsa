package Array;

public class CheckArrayIsSorted {
    public static boolean isSorted(int[] arr ,int n){
        if(n==1)
             return true;
        return arr[n-2]>arr[n-1]?false:isSorted(arr,n-1);
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{3,2,7,4,5,6},6));
    }
}
