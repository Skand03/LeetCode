
class SolutionSS{
    public int secondHighest(String s){
        int firstMax = -1;
        int secondMax = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ('0' <= ch && ch <= '9') {
                int digit = ch - '0';

                if (digit > firstMax) {
                    secondMax = firstMax;
                    firstMax = digit;
                } else if (digit < firstMax && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }
        return secondMax;
    }
}

public class SecondLargestDigitString1796 {
    public static void main(String[] args) {
       String s = "asdf123sdf540";
        SolutionSS ss = new SolutionSS();
        System.out.println(ss.secondHighest(s));
    }
}
