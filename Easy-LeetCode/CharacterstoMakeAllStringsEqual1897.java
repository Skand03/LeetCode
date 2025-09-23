class Solutions {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }

        for (int c : count) {
            if (c % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}

public class CharacterstoMakeAllStringsEqual1897 {
    public static void main(String[] args) {
        String[] words = { "abc", "aabc", "bc" };
        Solutions sol = new Solutions();
        System.out.println(sol.makeEqual(words));
        
    }
}
