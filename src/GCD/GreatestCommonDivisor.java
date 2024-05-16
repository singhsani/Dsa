package GCD;

public class GreatestCommonDivisor {
    public static int gcd(int n,int m){
        if(n%m==0)
            return m;
        n=n%m;
        return gcd(m,n);
    }

    public static void main(String[] args) {
        System.out.println(gcd(4,5));
    }
}
