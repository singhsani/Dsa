public class CheckSquareOfTwo {

    public static void main(String[] args) {
        int n=21;
        if((n &(n-1))==0){
            System.out.println("is Square");
        }else{
            System.out.println("not square");
        }
    }
}
