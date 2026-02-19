public class Array {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 2, 4, 1};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        System.out.println("The unique element is:" + result);
    }
}