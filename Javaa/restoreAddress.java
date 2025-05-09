import java.util.*;

public class restoreAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String> res = restoring(input);
        System.out.println(res);
    }

    public static List<String> restoring(String s) {
        List<String> ips = new ArrayList<>();
        int len = s.length();

        for (int i = 1; i < 4 && i < len - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < len - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < len; k++) {
                    String p1 = s.substring(0, i);
                    String p2 = s.substring(i, j);
                    String p3 = s.substring(j, k);
                    String p4 = s.substring(k);

                    if (isValid(p1) && isValid(p2) && isValid(p3) && isValid(p4)) {
                        ips.add(p1 + "." + p2 + "." + p3 + "." + p4);
                    }
                }
            }
        }
        return ips;
    }

    public static boolean isValid(String p) {
        if (p.length() > 1 && p.startsWith("0"))
            return false;
        int num = Integer.parseInt(p);
        return num >= 0 && num <= 255;

    }
}

//Think of the loops as the possible positions for those three dots.
//The outermost loop (for(int i=1;i<4 && i<len-2;i++)): This loop decides where to put the first dot.

//i starts at 1 because the first part of an IP address can't be empty.
//i < 4 because each part of an IP address can have at most 3 digits.
//i < len - 2 because after placing the first dot, you still need at least two more digits for the remaining two parts and the dots that will follow.
//In each iteration, i represents the index in the string where the first dot will be placed. For "25525511135", i will try values 1, 2, and 3.
//The middle loop (for(int j =i+1;j<i+4 && j<len-1;j++)): Once the first dot's position (i) is fixed, this loop decides where to put the second dot.

//j starts at i + 1 because the second dot must come after the first one.
//j < i + 4 because the second part (between the first and second dot) can also have at most 3 digits.
//j < len - 1 because after placing the second dot, you still need at least one more digit for the last part and the final dot.
//For each value of i, j will try values starting from i+1 up to a maximum of i+3 or len-1. j represents the index of the second dot.

//The innermost loop (for(int k = j+1;k<j+4 && k<len;k++)): 
//With the positions of the first two dots (i and j) fixed, this loop decides where to put the third dot.
//k starts at j + 1 because the third dot must come after the second one.
//k < j + 4 because the third part (between the second and third dot) can have at most 3 digits.
//k < len because the third dot can be at most at the second to last position, leaving at least one digit for the final part.
//For each combination of i and j, k will try values starting from j+1 up to a maximum of j+3 or len. k represents the index of the third dot.
//nside the innermost loop, the code extracts the four parts of the potential IP address using the dot positions i, j, and k:
