public class Prefixx {
    public String CommonPrefix(String[] strs){
        String pref = strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(pref)){
                pref = pref.substring(0,pref.length()-1);

                if(pref.isEmpty()) {
                    System.out.println("No common prefix found");
                    break;
                }
            }
        }
        return pref;
    }
    public static void main(String[] args) {
        Prefixx objectt = new Prefixx();
        String[] input = {"flow","flower","fly"};

        String res = objectt.CommonPrefix(input);
        if(!res.isEmpty()){

        System.out.println("The Common prefix is: "+res);
    }
}
}


