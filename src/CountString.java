public class CountString {
    public static int countString(String str){
        int count=0,i=0;
        while(str.charAt(i)>=0){
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countString("llllk"));
    }
}
