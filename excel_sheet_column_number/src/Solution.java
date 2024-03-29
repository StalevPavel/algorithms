import java.util.HashMap;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (Character c : columnTitle.toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
