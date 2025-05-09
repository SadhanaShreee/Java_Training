public class oneToHund {
    public static void countToHundred(long n){
        if(n>1000){
            return;
        }
        System.out.println(n);
        countToHundred(n+1);
    }
    public static void main(String[] args) {
        countToHundred(1);
    }
}
