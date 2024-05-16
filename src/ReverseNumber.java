public class ReverseNumber {
    public static int reverse(int x){
        int j=10,sum=0;
        while(x>0){
            int rem=x%10;
            //System.out.println(rem);
            sum=sum*j+rem;
            //j=j*10;
            x=x/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(5002));
    }
}
