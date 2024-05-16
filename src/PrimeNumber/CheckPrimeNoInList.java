package PrimeNumber;

import java.util.ArrayList;
import java.util.List;


public class CheckPrimeNoInList {
    public static int isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return 0;
        }
        return n;
    }
    public static void main(String[] args) {
        CheckIsPrime checkIsPrime=new CheckIsPrime();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=2){
                if(isPrime(list.get(i))!=0){
                    System.out.println(isPrime(list.get(i)));
                }
            }
        }
    }
}
