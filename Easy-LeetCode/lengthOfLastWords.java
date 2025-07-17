public class lengthOfLastWords {
    public static void main(String[] args) {
        String[] name = { "skand", "chaubey", "hello", "abc", "jdbc", "xyz" };
        String findName = "xyz";

        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(findName)) {
                System.out.println(" The name of word which is find " + findName + " index Number is " + i
                        + " and the length of words is " + findName.length());
            }
            System.out.println(" ");
        }
    }
}
