package BasicOperation;

public class Arrays {

    public static void main(String[] args) {

        //    Problem 1: Sum of Elements
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum += arr[i];
        }
            System.out.println("Sum of Array" + sum);
    }
}
