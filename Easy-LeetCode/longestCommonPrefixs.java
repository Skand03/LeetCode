import java.util.*;

public class longestCommonPrefixs {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (i < last.length && first[i] == last[i]) {
                result.append(first[i]);
            } else {
                break;
            }
        }

        return result.toString();
    }
}