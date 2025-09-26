public class FindLastWordInString {
    public static void main(String[] args) {
        String s = "hello how are you ?";
        String[] word = s.trim().split("\\s+");
        String lastWord = word[word.length-1];

        System.out.println(lastWord.length());


        }

    }

