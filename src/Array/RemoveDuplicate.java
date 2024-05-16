package Array;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] arr){
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int[] arr={1,2};
       int c= removeDuplicate(arr);
        for(int i=0;i<=c;i++){
            System.out.print(arr[i]);
        }
    }
}
