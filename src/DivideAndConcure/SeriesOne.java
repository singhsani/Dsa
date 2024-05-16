package DivideAndConcure;

public class SeriesOne {
    public static int printSeries(int x){
        if(x<=0)
            return 1;
        System.out.println(x);
        int y= 3*printSeries(x/2)+ x*x;
        System.out.println(y);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(printSeries(12));
    }
}
