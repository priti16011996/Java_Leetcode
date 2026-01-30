import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeactingChhar_03 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> box = new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0; right<s.length(); right++ )
        {
            while(box.contains(s.charAt(right)))
            {
                box.remove(s.charAt(left));
                left++;
            }
            box.add(s.charAt(right));
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
