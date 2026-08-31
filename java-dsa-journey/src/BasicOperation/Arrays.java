package BasicOperation;

public class Arrays {

    public static void main(String[] args) {

        //    Problem 1: Sum of Elements
        int[] arr = {2, 4, 60, 8, 10};
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum += arr[i];
        }
            System.out.println("Sum of Array" + sum);

//        Problem 2: Maximum and Minimum Element
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                max = arr[i];
            }
            if(min<arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max Element"+ max);
        System.out.println("Min Element"+ min);

//        3 Linear Search
        int key = 10;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not found");

//        Implement 2D Array and traversing
        int [][]matrix = {
                {2,3,4},{2,5,6},{5,6,7}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

//        4: Reverse Array (Two Pointer)
        int marks[] = {20,30,40,50,60};
        int start =1;
        int end = marks.length;
        while (start<end){
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
      }

    }

