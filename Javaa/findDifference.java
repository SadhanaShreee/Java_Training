public class findDifference {
        public static char findTheDifference(String s, String t) {
            int xor = 0;
    
            for (char c : s.toCharArray()) {
                xor ^= c; // XOR all characters in s
            }
    
            for (char c : t.toCharArray()) {
                xor ^= c; // XOR all characters in t
            }
    
            return (char) xor; // The remaining character is the answer
        }
    
        public static void main(String[] args) {
            String s = "abcd";
            String t = "abcde";
            System.out.println("Extra character: " + findTheDifference(s, t));
        }
    }
    

