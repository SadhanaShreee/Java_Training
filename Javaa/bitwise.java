public class bitwise {
    public static int reverseBit(int n){
        int rev = 0;
        for(int i=0;i<32;i++){
            int last = n & 1;
            rev = (rev << 1) | last;
            n = n >> 1;
        }
        return rev;


    }
    public static void main(String[] args) {
        int n = 10;
        int res = reverseBit(n);
        System.out.println("The reverse bitwise of num 10 is "+res);

    }
}
