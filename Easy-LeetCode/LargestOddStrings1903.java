
class OddString {
    public static String largestStringOdd(String num) {
        int lastOddIndex = -1;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                lastOddIndex = i;
            }
        }

        if (lastOddIndex == -1) {
            return "";
        }

        String result = "";
        for (int i = 0; i <= lastOddIndex; i++) {
            result = result + num.charAt(i);
        }

        return result;
    }
}

public class LargestOddStrings1903 {
    public static void main(String[] args) {
        System.out.println(OddString.largestStringOdd("9123456787"));
    }

}
