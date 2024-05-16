package DivideAndConcure;

public class FebonicSeries {
    public static int febonice(int n){
        if(n==0)
             return 0;
        if(n==1)
            return 1;
        return febonice(n-1) + febonice(n-2);
    }

    public static void main(String[] args) {
        System.out.println(febonice(5));
    }
}
