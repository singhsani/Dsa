package PrimeNumber;

public class CheckIsPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if(isPrime(13))
            System.out.println("is prime no");
        else
            System.out.println("is not prime no");
    }
}
