public class searchInsertposition {
    public static void main(String[] args) {
        int search = 99;
        int count = 0;
        int[] arr = { 1, 2, 8, 9, 6, 7, 5, 6, 99, 88, 55, 99, 99, 99 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("The linear Search are " + search + " " + i);
                count = count + 1;
                System.out.println("Total count of " + count);
            }
        }
    }

}
