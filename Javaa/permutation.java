public class permutation {
    public static void permute(String str,String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);

           String rem = str.substring(0,i) + str.substring(i+1);

           permute(rem, ch + res);

        }

    }
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("The permutation of "+input);

        permute(input,"");
    }

}
