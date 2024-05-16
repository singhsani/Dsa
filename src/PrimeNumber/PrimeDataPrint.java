package PrimeNumber;

public class PrimeDataPrint {
    public static boolean checkPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=num/i;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if(checkPrime(7)){
            System.out.println("is prime");
        }else{
            System.out.println("not prime");
        }
    }
}
