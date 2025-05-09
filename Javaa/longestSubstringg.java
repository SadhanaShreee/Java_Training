import java.util.HashMap;

public class longestSubstringg {
    public static void main(String[] args) {
        String input = "pwwkew";

        int max = 0;
        int left = 0;

        HashMap<Character, Integer> pos = new HashMap<>();
        for (int right = 0; right < input.length(); right++) {
            char current = input.charAt(right);
            if (!pos.containsKey(current)) {
                pos.put(current, right);
            } else {
                left = Math.max(left, pos.get(current) + 1);
                pos.put(current, right);
            }
            max = Math.max(max, (right - left) + 1);
        }
        System.out.println("Max - " + max);

    }
}
