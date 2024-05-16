package DivideAndConcure;

/**
 * O(sqrt(n))
 */
public class SeriesTwo {
    public static void sqrtDemo(int n){
        for(int i=0;i*i<n;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
       sqrtDemo(15);
    }
}
